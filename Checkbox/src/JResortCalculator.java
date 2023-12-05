import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JResortCalculator extends JFrame implements ItemListener{
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalprice = BASE_PRICE;

    JCheckBox weekendbox = new JCheckBox("Weekend premium $ "+WEEKEND_PREMIUM, false);
    JCheckBox breakfastbox = new JCheckBox("Breakfast premium $ "+BREAKFAST_PREMIUM, false);
    JCheckBox golfbox = new JCheckBox("Golf premium $ "+GOLF_PREMIUM, false);

    JLabel resortlabel = new JLabel("Resort Price calculator");
    JLabel pricelabel = new JLabel("The price of your stay is ");
    JTextField pricedisplay = new JTextField(12);
    JLabel optionexplainlabel = new JLabel("Base price of your room is $ "+BASE_PRICE);
    JLabel optionexplainlabel2 = new JLabel("Check options you want");


    public JResortCalculator(){
    super("Resort price estimator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(resortlabel);
    add(optionexplainlabel);
    add(optionexplainlabel2);
    add(weekendbox);
    add(breakfastbox);
    add(golfbox);
    add(pricelabel);
    add(pricedisplay);
    pricedisplay.setText("$ "+totalprice);
    weekendbox.addItemListener(this);
    breakfastbox.addItemListener(this);
    golfbox.addItemListener(this);

    }


    @Override
    public void itemStateChanged(ItemEvent event) {
    Object source = event.getSource();
    int select = event.getStateChange();

    if(source ==weekendbox)
        if(select == ItemEvent.SELECTED)
            totalprice +=WEEKEND_PREMIUM;
        else
            totalprice -= WEEKEND_PREMIUM;

        else if(source == breakfastbox){
            if(select == ItemEvent.SELECTED)
                totalprice +=BREAKFAST_PREMIUM;
            else
                totalprice-=BREAKFAST_PREMIUM;

        }
        else if(source == golfbox){
            if(select == ItemEvent.SELECTED)
                totalprice +=GOLF_PREMIUM;
            else
                totalprice -= GOLF_PREMIUM;


        }
        pricedisplay.setText("$ "+totalprice);
    }


    public static void main(String[] args) {
        JResortCalculator JRC = new JResortCalculator();
        final int  width = 300;
        final int height = 200;

        JRC.setSize(width, height);
        JRC.setVisible(true);
    }

}
