
package totemmuseu;

public class JDialog_Perguntas extends javax.swing.JDialog {
      //vetores para armazenar questões e suas devidas respostas
        String[] questions = {"Q1","Q2","Q3","Q4","Q5"};
        String[][] answers = {{"1","2","3","4"}, {"5","6","7","8"} , {"9","10","11","12"} 
        , {"13","14","15","16"} , {"17","18","19","20"}}; //<- Campos vazios pq ainda não temos as questões elaboradas
        int index = 0, correct = 0;
        



    public JDialog_Perguntas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txf_Questao = new javax.swing.JTextField();
        bnt_Alternativa1 = new javax.swing.JButton();
        btn_Alternativa2 = new javax.swing.JButton();
        btn_Alternativa3 = new javax.swing.JButton();
        btn_Alternativa4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setIconImages(null);

        txf_Questao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txf_Questao.setText("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...");

        bnt_Alternativa1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        bnt_Alternativa1.setText("A");
        bnt_Alternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_Alternativa1ActionPerformed(evt);
            }
        });

        btn_Alternativa2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_Alternativa2.setText("B");
        btn_Alternativa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Alternativa2ActionPerformed(evt);
            }
        });

        btn_Alternativa3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_Alternativa3.setText("C");
        btn_Alternativa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Alternativa3ActionPerformed(evt);
            }
        });

        btn_Alternativa4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_Alternativa4.setText("D");
        btn_Alternativa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Alternativa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txf_Questao, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnt_Alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txf_Questao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_Alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 446, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_Alternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_Alternativa1ActionPerformed
        txf_Questao.setText(questions[index]);
        bnt_Alternativa1.setText(answers[index] [0]);
        btn_Alternativa2.setText(answers[index][1]);
        btn_Alternativa3.setText(answers[index][2]);
        btn_Alternativa4.setText(answers[index][3]);
        
        //auto incremento que faz o texto do campo e dos botões mudar
        index++;
        
    }//GEN-LAST:event_bnt_Alternativa1ActionPerformed

    private void btn_Alternativa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa2ActionPerformed
        txf_Questao.setText(questions[index]);
        bnt_Alternativa1.setText(answers[index] [0]);
        btn_Alternativa2.setText(answers[index][1]);
        btn_Alternativa3.setText(answers[index][2]);
        btn_Alternativa4.setText(answers[index][3]);
        
        index++;
    }//GEN-LAST:event_btn_Alternativa2ActionPerformed

    private void btn_Alternativa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa3ActionPerformed
         txf_Questao.setText(questions[index]);
        bnt_Alternativa1.setText(answers[index] [0]);
        btn_Alternativa2.setText(answers[index][1]);
        btn_Alternativa3.setText(answers[index][2]);
        btn_Alternativa4.setText(answers[index][3]);
        
        index++;
    }//GEN-LAST:event_btn_Alternativa3ActionPerformed

    private void btn_Alternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa4ActionPerformed
        txf_Questao.setText(questions[index]);
        bnt_Alternativa1.setText(answers[index] [0]);
        btn_Alternativa2.setText(answers[index][1]);
        btn_Alternativa3.setText(answers[index][2]);
        btn_Alternativa4.setText(answers[index][3]);
        
        index++;
    }//GEN-LAST:event_btn_Alternativa4ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Perguntas dialog = new JDialog_Perguntas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_Alternativa1;
    private javax.swing.JButton btn_Alternativa2;
    private javax.swing.JButton btn_Alternativa3;
    private javax.swing.JButton btn_Alternativa4;
    private javax.swing.JTextField txf_Questao;
    // End of variables declaration//GEN-END:variables
}
