/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FinalActivityno;

import javax.swing.JOptionPane;

/**
 *
 * @author kenfu
 */
public class FinalActivityno1_FutamataKento2 extends javax.swing.JFrame {
    private static int points  = 0; 
    
    public int getpoints2(){
        return points; 
    }
      
    /**
     * Creates new form FinalActivityno1_FutamataKento
     */
    public FinalActivityno1_FutamataKento2() {
        super("Question no.2"); 
        initComponents();
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        question2 = new javax.swing.JLabel();
        LetterA = new javax.swing.JCheckBox();
        LetterB = new javax.swing.JCheckBox();
        LetterC = new javax.swing.JCheckBox();
        submitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 153, 51));
        background.setLayout(new java.awt.GridBagLayout());

        question2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        question2.setText("2 The “equal to” relational operator is . ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 38, 0, 0);
        background.add(question2, gridBagConstraints);

        LetterA.setBackground(new java.awt.Color(255, 153, 51));
        LetterA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterA.setText("A. =");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 38, 0, 0);
        background.add(LetterA, gridBagConstraints);

        LetterB.setBackground(new java.awt.Color(255, 153, 51));
        LetterB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterB.setText("B. !=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 38, 0, 0);
        background.add(LetterB, gridBagConstraints);

        LetterC.setBackground(new java.awt.Color(255, 153, 51));
        LetterC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterC.setText("C. ==");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 38, 13, 0);
        background.add(LetterC, gridBagConstraints);

        submitbutton.setBackground(new java.awt.Color(255, 255, 255));
        submitbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 198, 13, 89);
        background.add(submitbutton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();

        if(LetterA.isSelected() && LetterB.isSelected() && LetterC.isSelected()){
            points=1;
            JOptionPane.showMessageDialog(null, "You score 1 point");
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento();
            FA_1.displaypoint();
            FinalActivityno1_FutamataKento3 FA_3 = new FinalActivityno1_FutamataKento3();
            FA_3.setVisible(true);
            setVisible(false);
        }
        else if (LetterC.isSelected() && LetterB.isSelected()||LetterC.isSelected()&&LetterA.isSelected()){
            points=2;
            JOptionPane.showMessageDialog(null, "You score 2 points");
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento();
            FA_1.displaypoint();
            FinalActivityno1_FutamataKento3 FA_3 = new FinalActivityno1_FutamataKento3();
            FA_3.setVisible(true);
            setVisible(false);

        }

        else if(LetterC.isSelected()){
            points+=5;
            JOptionPane.showMessageDialog(null, "You score 5 points");
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento();
            FA_1.displaypoint();
            FinalActivityno1_FutamataKento3 FA_3 = new FinalActivityno1_FutamataKento3();
            FA_3.setVisible(true);
            setVisible(false);
        }
        else if(LetterA.isSelected()||LetterB.isSelected()||LetterA.isSelected()&&LetterB.isSelected()){
            JOptionPane.showMessageDialog(null, "Wrong Answer!");
        }

    }//GEN-LAST:event_submitbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalActivityno1_FutamataKento2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LetterA;
    private javax.swing.JCheckBox LetterB;
    private javax.swing.JCheckBox LetterC;
    private javax.swing.JPanel background;
    private javax.swing.JLabel question2;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}
