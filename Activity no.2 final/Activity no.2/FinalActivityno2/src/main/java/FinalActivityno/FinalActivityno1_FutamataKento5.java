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
public class FinalActivityno1_FutamataKento5 extends javax.swing.JFrame {
    private static int points  = 0; 
    
    public int getpoints5(){
        return points; 
    }
      
    /**
     * Creates new form FinalActivityno1_FutamataKento
     */
    public FinalActivityno1_FutamataKento5() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LetterA = new javax.swing.JCheckBox();
        LetterB = new javax.swing.JCheckBox();
        LetterC = new javax.swing.JCheckBox();
        submitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("int[] num = {101, 202, 303, 404, 505, 606}");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("5.  If you declare an integer array as follows, what is the value of num[2]?");

        LetterA.setBackground(new java.awt.Color(255, 153, 51));
        LetterA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterA.setText("A. 303");
        LetterA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterAActionPerformed(evt);
            }
        });

        LetterB.setBackground(new java.awt.Color(255, 153, 51));
        LetterB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterB.setText("B.  101");

        LetterC.setBackground(new java.awt.Color(255, 153, 51));
        LetterC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LetterC.setText("C.  202");

        submitbutton.setBackground(new java.awt.Color(255, 255, 255));
        submitbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(LetterA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LetterB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LetterC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitbutton)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(LetterA)
                        .addGap(18, 18, 18)
                        .addComponent(LetterB)
                        .addGap(18, 18, 18)
                        .addComponent(LetterC)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitbutton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            FinalActivityno1_FutamataKentofinalconclusion FA_F = new FinalActivityno1_FutamataKentofinalconclusion(); 
            FA_F.displayconclude();
            
          
        }
          else if (LetterA.isSelected() && LetterB.isSelected()||LetterA.isSelected()&&LetterC.isSelected()){
             points=2;
             JOptionPane.showMessageDialog(null, "You score 2 points"); 
             FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
            FA_1.displaypoint();
             FinalActivityno1_FutamataKentofinalconclusion FA_F = new FinalActivityno1_FutamataKentofinalconclusion(); 
            FA_F.displayconclude();
            
            
         }
        
          else if(LetterA.isSelected()){
             points=5; 
             JOptionPane.showMessageDialog(null, "You score 5 points"); 
            FinalActivityno1_FutamataKento FA_1 = new FinalActivityno1_FutamataKento(); 
            FA_1.displaypoint();
             FinalActivityno1_FutamataKentofinalconclusion FA_F = new FinalActivityno1_FutamataKentofinalconclusion(); 
            FA_F.displayconclude();
            
         }
          else if(LetterB.isSelected()||LetterC.isSelected()||LetterB.isSelected()&&LetterC.isSelected()){ 
              JOptionPane.showMessageDialog(null, "Wrong Answer!");
          }
        
         
         
        
        
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void LetterAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterAActionPerformed

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
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalActivityno1_FutamataKento5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FinalActivityno1_FutamataKento5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LetterA;
    private javax.swing.JCheckBox LetterB;
    private javax.swing.JCheckBox LetterC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}