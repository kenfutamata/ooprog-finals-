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
public class FinalActivityno1_FutamataKento4 extends javax.swing.JFrame {
    private static int points  = 0; 
    
    public int getpoints4(){
        return points; 
    }
      
    /**
     * Creates new form FinalActivityno1_FutamataKento
     */
    public FinalActivityno1_FutamataKento4() {
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

        LetterA = new javax.swing.JCheckBox();
        LetterB = new javax.swing.JCheckBox();
        LetterC = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        submitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LetterA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterA.setText("A. 8");

        LetterB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterB.setText("B.  10");

        LetterC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterC.setText("C.  9");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("4.  If m=9, then after n = m++, the value of m is");

        submitbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetterA)
                            .addComponent(LetterB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LetterC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitbutton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(LetterA)
                .addGap(18, 18, 18)
                .addComponent(LetterB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetterC)
                    .addComponent(submitbutton))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource(); 
       
         
          if(LetterA.isSelected() && LetterB.isSelected() && LetterC.isSelected()){
            points+=1;
            JOptionPane.showMessageDialog(null, "You score 1 point"); 
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
            FA_1.displaypoint();
             FinalActivityno1_FutamataKento5 FA_5 = new  FinalActivityno1_FutamataKento5(); 
             FA_5.setVisible(true);
             setVisible(false); 
            
          
        }
          else if (LetterB.isSelected() && LetterA.isSelected()||LetterB.isSelected()&&LetterC.isSelected()){
             points+=2;
             JOptionPane.showMessageDialog(null, "You score 2 points"); 
             FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
            FA_1.displaypoint();
             FinalActivityno1_FutamataKento5 FA_5 = new  FinalActivityno1_FutamataKento5(); 
             FA_5.setVisible(true);
             setVisible(false); 
            
            
         }
        
          else if(LetterB.isSelected()){
             points+=5; 
             JOptionPane.showMessageDialog(null, "You score 5 points"); 
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
            FA_1.displaypoint();
             FinalActivityno1_FutamataKento5 FA_5 = new  FinalActivityno1_FutamataKento5(); 
             FA_5.setVisible(true);
             setVisible(false); 
            
         }
          else if(LetterA.isSelected()||LetterC.isSelected()||LetterA.isSelected()&&LetterC.isSelected()){ 
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
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalActivityno1_FutamataKento4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LetterA;
    private javax.swing.JCheckBox LetterB;
    private javax.swing.JCheckBox LetterC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}
