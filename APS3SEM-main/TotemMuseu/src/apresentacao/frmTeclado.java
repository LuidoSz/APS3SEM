
package apresentacao;

public class frmTeclado extends javax.swing.JDialog
{

   
    public frmTeclado(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lbl_Mensagem = new javax.swing.JLabel();
        btn_Confirmar = new javax.swing.JButton();
        txf_Resposta = new javax.swing.JTextField();
        txa_Questão = new javax.swing.JTextArea();
        btn_W = new javax.swing.JButton();
        btn_Q = new javax.swing.JButton();
        btn_E = new javax.swing.JButton();
        btn_F = new javax.swing.JButton();
        btn_D = new javax.swing.JButton();
        btn_G = new javax.swing.JButton();
        btn_T = new javax.swing.JButton();
        btn_R = new javax.swing.JButton();
        btn_Y = new javax.swing.JButton();
        btn_J = new javax.swing.JButton();
        btn_H = new javax.swing.JButton();
        btn_K = new javax.swing.JButton();
        btn_A = new javax.swing.JButton();
        btn_S = new javax.swing.JButton();
        btn_V = new javax.swing.JButton();
        btn_P = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_X = new javax.swing.JButton();
        btn_Ç = new javax.swing.JButton();
        btn_Z = new javax.swing.JButton();
        btn_O = new javax.swing.JButton();
        btn_I = new javax.swing.JButton();
        btn_U = new javax.swing.JButton();
        btn_L = new javax.swing.JButton();
        btn_M = new javax.swing.JButton();
        btn_N = new javax.swing.JButton();
        btn_B = new javax.swing.JButton();
        btn_Espaco = new javax.swing.JButton();
        btn_Deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("questao_teclado");
        setForeground(java.awt.Color.orange);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        lbl_Mensagem.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Mensagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Mensagem.setText("questão dissertativa");

        btn_Confirmar.setBackground(new java.awt.Color(153, 204, 0));
        btn_Confirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Confirmar.setText("CONFIRMAR");
        btn_Confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_ConfirmarActionPerformed(evt);
            }
        });

        txf_Resposta.setEditable(false);
        txf_Resposta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txf_Resposta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));

        txa_Questão.setEditable(false);
        txa_Questão.setColumns(20);
        txa_Questão.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txa_Questão.setRows(5);
        txa_Questão.setText("GEFRJNHEIFGHWUFIGHIQEWGDGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDFFF\nGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDGEFRJNHEIFGHWUFIGHIQEWGIFFFF\nGEFRJNHEIFGHWUFIGHIQEWGDGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDFFF\nGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDGEFRJNHEIFGHWUFIGHIQEWGIFFFF\nGEFRJNHEIFGHWUFIGHIQEWGDGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDFFF\nGEFRJNHEIFGHWUFIGHIQEWGIQWGH9UFDGEFRJNHEIFGHWUFIGHIQEWGIFFFF\nDWSFEWFGEWFWGFEWGWGEWGEWGEGEGEGEGEGEGEGEGEGEGEWRWTGEHRH");
        txa_Questão.setAutoscrolls(false);
        txa_Questão.setBorder(null);

        btn_W.setText("W");
        btn_W.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_W.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_WActionPerformed(evt);
            }
        });

        btn_Q.setText("Q");
        btn_Q.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Q.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_QActionPerformed(evt);
            }
        });

        btn_E.setText("E");
        btn_E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_F.setText("F");
        btn_F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_F.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_FActionPerformed(evt);
            }
        });

        btn_D.setText("D");
        btn_D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_G.setText("G");
        btn_G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_T.setText("T");
        btn_T.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_R.setText("R");
        btn_R.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Y.setText("Y");
        btn_Y.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_J.setText("J");
        btn_J.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_J.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_JActionPerformed(evt);
            }
        });

        btn_H.setText("H");
        btn_H.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_K.setText("K");
        btn_K.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_K.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_KActionPerformed(evt);
            }
        });

        btn_A.setText("A");
        btn_A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_S.setText("S");
        btn_S.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_V.setText("V");
        btn_V.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_P.setText("P");
        btn_P.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_C.setText("C");
        btn_C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_X.setText("X");
        btn_X.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Ç.setText("Ç");
        btn_Ç.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Z.setText("Z");
        btn_Z.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Z.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_ZActionPerformed(evt);
            }
        });

        btn_O.setText("O");
        btn_O.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_I.setText("I");
        btn_I.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_U.setText("U");
        btn_U.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_L.setText("L");
        btn_L.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_M.setText("M");
        btn_M.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_N.setText("N");
        btn_N.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_B.setText("B");
        btn_B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Espaco.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 36)); // NOI18N
        btn_Espaco.setText("ESPAÇO");
        btn_Espaco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Deletar.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        btn_Deletar.setText("←");
        btn_Deletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Deletar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_W, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_E, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_R, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_T, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_U, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_I, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_O, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Ç, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_P, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_A, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_S, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_D, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_F, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_G, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_H, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_J, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_K, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_X, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_C, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_V, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_B, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_N, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_M, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txa_Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(lbl_Mensagem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txf_Resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txa_Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txf_Resposta, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_W, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_E, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_R, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_T, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_U, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_I, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_O, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_P, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_S, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_D, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_F, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_G, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_H, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_J, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_K, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Ç, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_X, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_C, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_V, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_B, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_N, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_M, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Deletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_ConfirmarActionPerformed
    {//GEN-HEADEREND:event_btn_ConfirmarActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void btn_QActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_QActionPerformed
    {//GEN-HEADEREND:event_btn_QActionPerformed
     txf_Resposta.setText(txf_Resposta.getText() + "Q");
    }//GEN-LAST:event_btn_QActionPerformed

    private void btn_WActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_WActionPerformed
    {//GEN-HEADEREND:event_btn_WActionPerformed
        txf_Resposta.setText(txf_Resposta.getText() + "W");
    }//GEN-LAST:event_btn_WActionPerformed

    private void btn_FActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_FActionPerformed
    {//GEN-HEADEREND:event_btn_FActionPerformed
        txf_Resposta.setText(txf_Resposta.getText() + "F");
    }//GEN-LAST:event_btn_FActionPerformed

    private void btn_KActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_KActionPerformed
    {//GEN-HEADEREND:event_btn_KActionPerformed
        txf_Resposta.setText(txf_Resposta.getText() + "K");
    }//GEN-LAST:event_btn_KActionPerformed

    private void btn_ZActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_ZActionPerformed
    {//GEN-HEADEREND:event_btn_ZActionPerformed
         txf_Resposta.setText(txf_Resposta.getText() + "Z");
    }//GEN-LAST:event_btn_ZActionPerformed

    private void btn_JActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_JActionPerformed
    {//GEN-HEADEREND:event_btn_JActionPerformed
         txf_Resposta.setText(txf_Resposta.getText() + "J");
    }//GEN-LAST:event_btn_JActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_DeletarActionPerformed
    {//GEN-HEADEREND:event_btn_DeletarActionPerformed
       String str = txf_Resposta.getText();
       StringBuilder deletar = new StringBuilder (str);
       str= String.valueOf(deletar.deleteCharAt(str.length()  -1));
       txf_Resposta.setText(str);
    }//GEN-LAST:event_btn_DeletarActionPerformed
     private void btn_GActionPerformed(java.awt.event.ActionEvent evt)                                      
    {                                          
        txf_Resposta.setText(txf_Resposta.getText() + "G");
    }                                     
    
     
    public static void main(String args[])
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmTeclado dialog = new frmTeclado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_A;
    private javax.swing.JButton btn_B;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_D;
    private javax.swing.JButton btn_Deletar;
    private javax.swing.JButton btn_E;
    private javax.swing.JButton btn_Espaco;
    private javax.swing.JButton btn_F;
    private javax.swing.JButton btn_G;
    private javax.swing.JButton btn_H;
    private javax.swing.JButton btn_I;
    private javax.swing.JButton btn_J;
    private javax.swing.JButton btn_K;
    private javax.swing.JButton btn_L;
    private javax.swing.JButton btn_M;
    private javax.swing.JButton btn_N;
    private javax.swing.JButton btn_O;
    private javax.swing.JButton btn_P;
    private javax.swing.JButton btn_Q;
    private javax.swing.JButton btn_R;
    private javax.swing.JButton btn_S;
    private javax.swing.JButton btn_T;
    private javax.swing.JButton btn_U;
    private javax.swing.JButton btn_V;
    private javax.swing.JButton btn_W;
    private javax.swing.JButton btn_X;
    private javax.swing.JButton btn_Y;
    private javax.swing.JButton btn_Z;
    private javax.swing.JButton btn_Ç;
    private javax.swing.JLabel lbl_Mensagem;
    private javax.swing.JTextArea txa_Questão;
    private javax.swing.JTextField txf_Resposta;
    // End of variables declaration//GEN-END:variables
}
