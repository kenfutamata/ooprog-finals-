package FinalActivityno;
import javax.swing.*; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kenfu
 */
public class FinalActivityno1_FutamataKentofinalconclusion {
  
  public void displayconclude(){
      FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
      if(FA_1.computation() >= 21){
          JOptionPane.showMessageDialog(null, "Fantastic!");
          System.exit(0); 
      }
      else if(FA_1.computation() >= 15){
          JOptionPane.showMessageDialog(null, "Very Good!");
          System.exit(0); 
      }
      else if(FA_1.computation() <= 15){
          JOptionPane.showMessageDialog(null, "OK!");
          System.exit(0); 
      }
  }
}
