
package totemmuseu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

public class frmQuestionario extends javax.swing.JDialog {
 
        String[] questions = {"Q1","Q2","Q3","Q4","Q5"};
        String[][] answers = {{"1","2","3","4"}, {"5","6","7","8"} , {"9","10","11","12"} 
        , {"13","14","15","16"} , {"17","18","19","20"}}; 
        int index = 0;
         private Object setAnswers;
        



    public frmQuestionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        

  
  }

    public void Resposta(int index, String[]questions, String[][] answers) {
{
    
            
        this.lbl_Questao.setText(questions[index]);
        this. bnt_Alternativa1.setText(answers[index] [0]);
        this.btn_Alternativa2.setText(answers[index][1]);
        this.btn_Alternativa3.setText(answers[index][2]);
        this.btn_Alternativa4.setText(answers[index][3]);
        
       
        this.index ++;
                
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnt_Alternativa1 = new javax.swing.JButton();
        btn_Alternativa2 = new javax.swing.JButton();
        btn_Alternativa3 = new javax.swing.JButton();
        btn_Alternativa4 = new javax.swing.JButton();
        lbl_Questao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setIconImages(null);

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

        lbl_Questao.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lbl_Questao.setText("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Questao, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnt_Alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Alternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Alternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_Questao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
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
        Resposta(index, questions, answers);
               
    }//GEN-LAST:event_bnt_Alternativa1ActionPerformed

    private void btn_Alternativa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa2ActionPerformed
        Resposta(index, questions, answers);
    }//GEN-LAST:event_btn_Alternativa2ActionPerformed

    private void btn_Alternativa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa3ActionPerformed
        Resposta(index, questions, answers);
    }//GEN-LAST:event_btn_Alternativa3ActionPerformed

    private void btn_Alternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alternativa4ActionPerformed
        Resposta(index, questions, answers);
    }//GEN-LAST:event_btn_Alternativa4ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmQuestionario questionario = new frmQuestionario(new javax.swing.JFrame(), true);
                questionario.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                questionario.setSize(getScreenSize());
                questionario.setModal(true);
                questionario.setLocationRelativeTo(null);            
                questionario.setVisible(true);
            }
            private Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize(); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_Alternativa1;
    private javax.swing.JButton btn_Alternativa2;
    private javax.swing.JButton btn_Alternativa3;
    private javax.swing.JButton btn_Alternativa4;
    private javax.swing.JLabel lbl_Questao;
    // End of variables declaration//GEN-END:variables



}

    
