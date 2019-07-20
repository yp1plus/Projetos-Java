//By Yure Pablo em 27/01/2017

package RebecaPintora;

import BrendaPerfeccionista.BrendaIgnorante;
import java.awt.Color;

public class GUIQuadro extends javax.swing.JFrame {

    BrendaIgnorante Y = new BrendaIgnorante();
    public GUIQuadro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        btRebeca = new javax.swing.JButton();
        btBrenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfRaiva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        pnRebeca = new javax.swing.JPanel();
        lblRebeca = new javax.swing.JLabel();
        btPerguntar = new javax.swing.JButton();
        btIgnorar = new javax.swing.JButton();
        pnBrenda = new javax.swing.JPanel();
        lblBrenda = new javax.swing.JLabel();
        btEstresse = new javax.swing.JButton();
        btHumilhar = new javax.swing.JButton();
        btFalso = new javax.swing.JButton();
        btChato = new javax.swing.JButton();
        btIronia = new javax.swing.JButton();
        btElogiar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btRebeca.setText("Rebeca");
        btRebeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRebecaActionPerformed(evt);
            }
        });

        btBrenda.setText("Brenda");
        btBrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBrendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Raiva:");

        tfRaiva.setEnabled(false);

        jLabel2.setText("Status:");

        tfStatus.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btRebeca)
                        .addGap(18, 18, 18)
                        .addComponent(btBrenda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfStatus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(tfRaiva, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfRaiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRebeca)
                    .addComponent(btBrenda))
                .addContainerGap())
        );

        pnRebeca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRebeca.setText("Rebeca:");

        btPerguntar.setText("Perguntar");
        btPerguntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerguntarActionPerformed(evt);
            }
        });

        btIgnorar.setText("Ignorar");
        btIgnorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgnorarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRebecaLayout = new javax.swing.GroupLayout(pnRebeca);
        pnRebeca.setLayout(pnRebecaLayout);
        pnRebecaLayout.setHorizontalGroup(
            pnRebecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRebecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRebecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRebeca)
                    .addGroup(pnRebecaLayout.createSequentialGroup()
                        .addComponent(btPerguntar)
                        .addGap(31, 31, 31)
                        .addComponent(btIgnorar)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        pnRebecaLayout.setVerticalGroup(
            pnRebecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRebecaLayout.createSequentialGroup()
                .addComponent(lblRebeca)
                .addGap(18, 18, 18)
                .addGroup(pnRebecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPerguntar)
                    .addComponent(btIgnorar))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pnBrenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnBrenda.setEnabled(false);

        lblBrenda.setText("Brenda: ");

        btEstresse.setText("Se estressar");
        btEstresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstresseActionPerformed(evt);
            }
        });

        btHumilhar.setText("Humilhar");
        btHumilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHumilharActionPerformed(evt);
            }
        });

        btFalso.setText("Chamar Falso");
        btFalso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFalsoActionPerformed(evt);
            }
        });

        btChato.setText("Chamar Chato");
        btChato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChatoActionPerformed(evt);
            }
        });

        btIronia.setText("Ser Irônica");
        btIronia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIroniaActionPerformed(evt);
            }
        });

        btElogiar.setText("Elogiar");
        btElogiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElogiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBrendaLayout = new javax.swing.GroupLayout(pnBrenda);
        pnBrenda.setLayout(pnBrendaLayout);
        pnBrendaLayout.setHorizontalGroup(
            pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBrendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrenda)
                    .addGroup(pnBrendaLayout.createSequentialGroup()
                        .addGroup(pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEstresse)
                            .addComponent(btHumilhar))
                        .addGap(32, 32, 32)
                        .addGroup(pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBrendaLayout.createSequentialGroup()
                                .addComponent(btChato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btElogiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnBrendaLayout.createSequentialGroup()
                                .addComponent(btFalso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btIronia)))))
                .addContainerGap())
        );
        pnBrendaLayout.setVerticalGroup(
            pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBrendaLayout.createSequentialGroup()
                .addComponent(lblBrenda)
                .addGap(26, 26, 26)
                .addGroup(pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEstresse)
                    .addComponent(btFalso)
                    .addComponent(btIronia))
                .addGap(18, 18, 18)
                .addGroup(pnBrendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHumilhar)
                    .addComponent(btChato)
                    .addComponent(btElogiar))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnRebeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnBrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnRebeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btSair))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBrendaActionPerformed
        // TODO add your handling code here:
        btPerguntar.setEnabled(false);
        btIgnorar.setEnabled(false);
        lblRebeca.setEnabled(false);
        btEstresse.setEnabled(true);
        btElogiar.setEnabled(true);
        btFalso.setEnabled(true);
        btChato.setEnabled(true);
        btHumilhar.setEnabled(true);
        btIronia.setEnabled(true);
        lblBrenda.setEnabled(true);
    }//GEN-LAST:event_btBrendaActionPerformed

    private void btEstresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstresseActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.Estressar(Color.blue));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));  
    }//GEN-LAST:event_btEstresseActionPerformed

    private void btFalsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFalsoActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.ChamarFalso("Falso"));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));     
    }//GEN-LAST:event_btFalsoActionPerformed

    private void btIroniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIroniaActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.SerIrônica());
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
    }//GEN-LAST:event_btIroniaActionPerformed

    private void btHumilharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHumilharActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.Humilhar(1));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
    }//GEN-LAST:event_btHumilharActionPerformed

    private void btChatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChatoActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.ChamarChato("Chato"));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
    }//GEN-LAST:event_btChatoActionPerformed

    private void btIgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgnorarActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.Ignorar(Color.red));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
        
    }//GEN-LAST:event_btIgnorarActionPerformed

    private void btPerguntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerguntarActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.Perguntar(1));
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
    }//GEN-LAST:event_btPerguntarActionPerformed

    private void btRebecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRebecaActionPerformed
        // TODO add your handling code here:
        btPerguntar.setEnabled(true);
        btIgnorar.setEnabled(true);
        lblRebeca.setEnabled(true);
        btElogiar.setEnabled(false);
        btEstresse.setEnabled(false);
        btFalso.setEnabled(false);
        btChato.setEnabled(false);
        btHumilhar.setEnabled(false);
        btIronia.setEnabled(false);
        lblBrenda.setEnabled(false);
    }//GEN-LAST:event_btRebecaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btElogiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElogiarActionPerformed
        // TODO add your handling code here:
        tfStatus.setText(Y.Elogiar());
        tfRaiva.setText(String.valueOf(Y.getRaiva()));
    }//GEN-LAST:event_btElogiarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIQuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIQuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIQuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIQuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIQuadro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBrenda;
    private javax.swing.JButton btChato;
    private javax.swing.JButton btElogiar;
    private javax.swing.JButton btEstresse;
    private javax.swing.JButton btFalso;
    private javax.swing.JButton btHumilhar;
    private javax.swing.JButton btIgnorar;
    private javax.swing.JButton btIronia;
    private javax.swing.JButton btPerguntar;
    private javax.swing.JButton btRebeca;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblBrenda;
    private javax.swing.JLabel lblRebeca;
    private javax.swing.JPanel pnBrenda;
    private javax.swing.JPanel pnRebeca;
    private javax.swing.JTextField tfRaiva;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
