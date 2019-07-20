//By Yure Pablo em 18/01/2017

package UICalculadora;

import Clcalc.Calcul;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Calc extends javax.swing.JFrame {

    Calcul operar = new Calcul();
    String sinal;
    String a;
    public Calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bt1 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        Bt7 = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt9 = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();
        BtSomar = new javax.swing.JButton();
        BtSubtrair = new javax.swing.JButton();
        BtDividir = new javax.swing.JButton();
        BtMultiplicar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PnCalc = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        PnCalc2 = new javax.swing.JTextPane();
        BtLimpar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bt1.setText("1");
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });

        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });

        BtSomar.setText("+");
        BtSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSomarActionPerformed(evt);
            }
        });

        BtSubtrair.setText("-");
        BtSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSubtrairActionPerformed(evt);
            }
        });

        BtDividir.setText(":");
        BtDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDividirActionPerformed(evt);
            }
        });

        BtMultiplicar.setText("*");
        BtMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMultiplicarActionPerformed(evt);
            }
        });

        PnCalc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(PnCalc);

        PnCalc2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PnCalc2.setAlignmentX(1.0F);
        PnCalc2.setAlignmentY(1.0F);
        PnCalc2.setAutoscrolls(false);
        jScrollPane2.setViewportView(PnCalc2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt7)
                        .addGap(18, 18, 18)
                        .addComponent(Bt8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt4)
                            .addComponent(Bt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bt2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bt3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B6))
                            .addComponent(Bt0))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt7)
                    .addComponent(Bt8)
                    .addComponent(Bt9)
                    .addComponent(BtSomar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt4)
                    .addComponent(Bt5)
                    .addComponent(B6)
                    .addComponent(BtSubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt3)
                    .addComponent(Bt1)
                    .addComponent(Bt2)
                    .addComponent(BtDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt0)
                    .addComponent(BtMultiplicar))
                .addGap(18, 18, 18))
        );

        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        jButton1.setText("Apagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSair)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btIgual)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtLimpar)
                    .addComponent(BtSair)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSomarActionPerformed
        // TODO add your handling code here:
        operar.setNum1(Integer.parseInt(PnCalc.getText()));
        PnCalc.setText("");
        sinal = "+";
        PnCalc2.setText("+");
       
    }//GEN-LAST:event_BtSomarActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "7");
         a = "7";
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "8");
         a = "8";
    }//GEN-LAST:event_Bt8ActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        // TODO add your handling code here:
        String s;
              operar.setNum2(Integer.parseInt(PnCalc.getText()));
              if (operar.getNum1()!= 0 && operar.getNum2()!=0){
                switch(sinal) {
                    case "+": 
                  operar.somar();
                  s = String.valueOf(operar.getSom());
                  PnCalc.setText(s);
                  break;
                    case "-":
                        operar.subtrair();
                         s = String.valueOf(operar.getSub());
                         PnCalc.setText(s);
                         break;
                    case ":":
                        operar.dividir();
                        s = String.valueOf(operar.getDv());
                        PnCalc.setText(s);
                        break;
                    case "*":
                        operar.multiplicar();
                         s = String.valueOf(operar.getMt());
                         PnCalc.setText(s);
                         break;
                    
              } 
              }
              else {
                  JOptionPane.showMessageDialog(this, "Não foi possível realizar a operação, tente novamente!");
                  PnCalc.setText(null);
              }
                  
        
    }//GEN-LAST:event_btIgualActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "9");
         a = "9";
    }//GEN-LAST:event_Bt9ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "4");
         a = "4";
    }//GEN-LAST:event_Bt4ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "5");
         a = "5";
    }//GEN-LAST:event_Bt5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "6");
         a = "6";
    }//GEN-LAST:event_B6ActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "1");
         a = "1";
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "2");
         a = "2";
    }//GEN-LAST:event_Bt2ActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "3");
         a = "3";
    }//GEN-LAST:event_Bt3ActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(PnCalc.getText() + "0");
        a = "0";
    }//GEN-LAST:event_Bt0ActionPerformed

    private void BtSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSubtrairActionPerformed
        // TODO add your handling code here:
        operar.setNum1(Integer.parseInt(PnCalc.getText()));
        PnCalc.setText("");
        sinal = "-";
        PnCalc2.setText("-");
        
    }//GEN-LAST:event_BtSubtrairActionPerformed

    private void BtDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDividirActionPerformed
        // TODO add your handling code here:
       operar.setNum1(Integer.parseInt(PnCalc.getText())); 
       PnCalc.setText("");
       sinal = ":";
       PnCalc2.setText(":");
    }//GEN-LAST:event_BtDividirActionPerformed

    private void BtMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMultiplicarActionPerformed
        // TODO add your handling code here:
        operar.setNum1(Integer.parseInt(PnCalc.getText()));
        PnCalc.setText("");
        sinal = "*";
        PnCalc2.setText("*");
        
    }//GEN-LAST:event_BtMultiplicarActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        // TODO add your handling code here:
        PnCalc.setText(null);
    }//GEN-LAST:event_BtLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PnCalc.setText((PnCalc.getText()).replace(a, ""));
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B6;
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton BtDividir;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtMultiplicar;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSomar;
    private javax.swing.JButton BtSubtrair;
    private javax.swing.JTextPane PnCalc;
    private javax.swing.JTextPane PnCalc2;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
