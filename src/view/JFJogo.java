package view;

import static javafx.application.Platform.exit;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import model.Jogador;
import model.Verificacoes;

public class JFJogo extends javax.swing.JFrame {

    String vJogador = "X", nomeJog1, nomeJog2;
    int vPontosX, vPontosO;
    Verificacoes objVerificacao = new Verificacoes();

    public JFJogo(Jogador objJog) {
        initComponents();
        nomeJog1 = objJog.getJogador1();
        lblJog1.setText(nomeJog1);
        nomeJog2 = objJog.getJogador2();
        lblJog2.setText(nomeJog2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblExibePontosX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblJog1 = new javax.swing.JLabel();
        lblExibePontosO = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblJog2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lblExibePontosX.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblExibePontosX.setText("...");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Pontuação");

        lblJog1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblJog1.setText("Jogador X:");

        lblExibePontosO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblExibePontosO.setText("...");

        lblInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(102, 102, 102));

        lblJog2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblJog2.setText("Jogador O:");

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJog2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExibePontosO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJog1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExibePontosX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJog1)
                    .addComponent(lblExibePontosX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJog2)
                    .addComponent(lblExibePontosO))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (btn1.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn1.setBackground(java.awt.Color.BLUE);
                btn1.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn1.setBackground(java.awt.Color.RED);
                btn1.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (btn2.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn2.setBackground(java.awt.Color.BLUE);
                btn2.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn2.setBackground(java.awt.Color.RED);
                btn2.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (btn3.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn3.setBackground(java.awt.Color.BLUE);
                btn3.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn3.setBackground(java.awt.Color.RED);
                btn3.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (btn4.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn4.setBackground(java.awt.Color.BLUE);
                btn4.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn4.setBackground(java.awt.Color.RED);
                btn4.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (btn5.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn5.setBackground(java.awt.Color.BLUE);
                btn5.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn5.setBackground(java.awt.Color.RED);
                btn5.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (btn6.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn6.setBackground(java.awt.Color.BLUE);
                btn6.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn6.setBackground(java.awt.Color.RED);
                btn6.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (btn7.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn7.setBackground(java.awt.Color.BLUE);
                btn7.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn7.setBackground(java.awt.Color.RED);
                btn7.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (btn8.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn8.setBackground(java.awt.Color.BLUE);
                btn8.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn8.setBackground(java.awt.Color.RED);
                btn8.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (btn9.getText().isEmpty()) {
            if (vJogador.equals("X")) {
                btn9.setBackground(java.awt.Color.BLUE);
                btn9.setText(vJogador);
                VerificaJogadas(vJogador);
            } else {
                btn9.setBackground(java.awt.Color.RED);
                btn9.setText(vJogador);
                VerificaJogadas(vJogador);
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFMenu frmMenu = new JFMenu();
                frmMenu.setVisible(true);
                frmMenu.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void setaValoresPadrao() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setBackground(new java.awt.Color(212, 208, 200));
        btn2.setBackground(new java.awt.Color(212, 208, 200));
        btn3.setBackground(new java.awt.Color(212, 208, 200));
        btn4.setBackground(new java.awt.Color(212, 208, 200));
        btn5.setBackground(new java.awt.Color(212, 208, 200));
        btn6.setBackground(new java.awt.Color(212, 208, 200));
        btn7.setBackground(new java.awt.Color(212, 208, 200));
        btn8.setBackground(new java.awt.Color(212, 208, 200));
        btn9.setBackground(new java.awt.Color(212, 208, 200));
    }

    private void zeraValores() {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja jogar novamente?", "Aviso", dialogButton);
        if (dialogResult == 0) {
            setaValoresPadrao();
            vJogador = "X";
            lblInfo.setText("");
        } else {
            dispose();
            JFMenu frmMenu = new JFMenu();
            frmMenu.setVisible(true);
            frmMenu.setLocationRelativeTo(null);
        }
    }

    private void ganhou() {
        if (vJogador.equals("X")) {
            vPontosX = vPontosX + 1;
            lblExibePontosX.setText("" + vPontosX);
        } else {
            vPontosO = vPontosO + 1;
            lblExibePontosO.setText("" + vPontosO);
        }
        if (vPontosX > vPontosO) {
            lblInfo.setText("Fim de jogo. Você venceu " + nomeJog1+"!");
            zeraValores();
        } else {
            lblInfo.setText("Fim de jogo. Você venceu " + nomeJog2+"!");
            zeraValores();
        }

    }

    private void VerificaJogadas(String jogadorAtual) {
        if (btn1.getText().equals(jogadorAtual) && btn4.getText().equals(jogadorAtual) && btn7.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn2.getText().equals(jogadorAtual) && btn5.getText().equals(jogadorAtual) && btn8.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn3.getText().equals(jogadorAtual) && btn6.getText().equals(jogadorAtual) && btn9.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn1.getText().equals(jogadorAtual) && btn2.getText().equals(jogadorAtual) && btn3.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn4.getText().equals(jogadorAtual) && btn5.getText().equals(jogadorAtual) && btn6.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn7.getText().equals(jogadorAtual) && btn8.getText().equals(jogadorAtual) && btn9.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn1.getText().equals(jogadorAtual) && btn5.getText().equals(jogadorAtual) && btn9.getText().equals(jogadorAtual)) {
            ganhou();
        }
        if (btn3.getText().equals(jogadorAtual) && btn5.getText().equals(jogadorAtual) && btn7.getText().equals(jogadorAtual)) {
            ganhou();
        }

        if (btn1.getText().length() != 0 && btn2.getText().length() != 0 && btn3.getText().length() != 0 && btn4.getText().length() != 0 && btn5.getText().length() != 0 && btn6.getText().length() != 0 && btn7.getText().length() != 0 && btn8.getText().length() != 0 && btn9.getText().length() != 0) {
            lblInfo.setText("EMPATE!");
            zeraValores();
        }
        vJogador = objVerificacao.inversaoJogadores(vJogador);
        if (vJogador.equals("X")) {
            lblInfo.setText("Sua vez " + nomeJog1);
        } else {
            lblInfo.setText("Sua vez " + nomeJog2);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblExibePontosO;
    private javax.swing.JLabel lblExibePontosX;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblJog1;
    private javax.swing.JLabel lblJog2;
    // End of variables declaration//GEN-END:variables
}
