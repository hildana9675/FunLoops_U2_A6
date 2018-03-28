/* Hildana. M
 * FunLoops_U2_A6.java
 * This program displays all the integer between two numbers inputed 
 * by an individual
 * March/28/2018
 */

/**
 *
 * @author himel9675
 */
public class FunLoops_U2_A6 extends javax.swing.JFrame {

    /**
     * Creates new form FunLoops_U2_A6
     */
    public FunLoops_U2_A6() {
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
        labelTitle = new javax.swing.JLabel();
        labelStartingValue = new javax.swing.JLabel();
        labelEndingValue = new javax.swing.JLabel();
        textStartingValue = new javax.swing.JTextField();
        textEndingValue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelDisplayValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitle.setText("Fun with Loops!");

        labelStartingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelStartingValue.setText("Enter a starting value:");

        labelEndingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEndingValue.setText("Enter an ending value:");

        textStartingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textStartingValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStartingValueActionPerformed(evt);
            }
        });

        textEndingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textEndingValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEndingValueActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Show Value");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelDisplayValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelStartingValue)
                        .addGap(51, 51, 51)
                        .addComponent(textStartingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEndingValue)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEndingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(labelDisplayValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTitle)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStartingValue)
                    .addComponent(textStartingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEndingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndingValue))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelDisplayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textStartingValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStartingValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStartingValueActionPerformed

    private void textEndingValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEndingValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEndingValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       int startVal, endVal;
       String accum =  "" ; //accumulator 
    
       
       //take value entered by the individual 
       startVal = (int) Double.parseDouble (textStartingValue.getText());
       endVal = (int) Double.parseDouble(textEndingValue.getText());
       
       
       /* add an increment of 1 to the beginning number until  
        * the end number is reached */
       for ( int i = startVal; i <= endVal; i++ ) 
       {
           accum += i + ""; //Start with a number, add a space, write the next number, etc. 
           labelDisplayValue.setText("" + accum); //display the numbers in between the start and end
       }
       
     
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FunLoops_U2_A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunLoops_U2_A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunLoops_U2_A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunLoops_U2_A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunLoops_U2_A6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDisplayValue;
    private javax.swing.JLabel labelEndingValue;
    private javax.swing.JLabel labelStartingValue;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField textEndingValue;
    private javax.swing.JTextField textStartingValue;
    // End of variables declaration//GEN-END:variables
}
