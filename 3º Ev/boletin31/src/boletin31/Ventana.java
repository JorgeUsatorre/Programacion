/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boletin31;

/**
 *
 * @author Jorge
 */
public class Ventana extends javax.swing.JFrame {

    private float num1 ;
    private float  num2;
    private float suma;
    
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bMultiplicacion = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bSuma = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bAC = new javax.swing.JButton();
        bOFF = new javax.swing.JButton();

        jButton2.setText("jButton1");

        jButton6.setText("jButton1");

        jButton8.setText("jButton1");

        jButton10.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bDivision.setText("/");

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bMultiplicacion.setText("*");

        bResta.setText("-");

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bPunto.setText(".");

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bSuma.setText("+");
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        bAC.setBackground(new java.awt.Color(255, 51, 51));
        bAC.setForeground(new java.awt.Color(255, 255, 255));
        bAC.setText("AC");
        bAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACActionPerformed(evt);
            }
        });

        bOFF.setBackground(new java.awt.Color(51, 51, 255));
        bOFF.setForeground(new java.awt.Color(255, 255, 255));
        bOFF.setText("OFF");
        bOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOFFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bAC))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bOFF)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAC)
                    .addComponent(bOFF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+8);
    }//GEN-LAST:event_b8ActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        
    }//GEN-LAST:event_bIgualActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+0);
    }//GEN-LAST:event_b0ActionPerformed

    private void bACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_bACActionPerformed

    private void bOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOFFActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_bOFFActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        jTextArea1.setText(jTextArea1.getText()+2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        jTextArea1.setText("3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
        suma = num1 + num2;
        jTextArea1.setText(num1+"+"+num2);
    }//GEN-LAST:event_bSumaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAC;
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMultiplicacion;
    private javax.swing.JButton bOFF;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSuma;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
