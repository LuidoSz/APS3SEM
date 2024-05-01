
package totemmuseu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import metodos.Resolucao;


 
public class frmPrincipal extends javax.swing.JDialog {



    
    public frmPrincipal (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true); //<- remove bordas
        initComponents();
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Iniciar = new javax.swing.JButton();
        lbl_Cabecario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1280));
        setSize(new java.awt.Dimension(10, 10));

        btn_Iniciar.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn_Iniciar.setText("INICIAR QUESTIONÁRIO");
        btn_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarActionPerformed(evt);
            }
        });

        lbl_Cabecario.setBackground(new java.awt.Color(153, 153, 153));
        lbl_Cabecario.setFont(lbl_Cabecario.getFont().deriveFont(lbl_Cabecario.getFont().getStyle() | java.awt.Font.BOLD, lbl_Cabecario.getFont().getSize()+38));
        lbl_Cabecario.setText("QUESTIONÁRIO (TEXTO PRA ENCHER LINGUÇA)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setLabelFor(jLabel2);
        jLabel2.setText("dfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsdfdsf\\sf\\sf");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 103, Short.MAX_VALUE)
                        .addComponent(lbl_Cabecario, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_Cabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(456, 456, 456)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarActionPerformed
        
                frmPrincipal.this.dispose();
        
                frmQuestionario questionario = new frmQuestionario(new javax.swing.JFrame(), true);
                
                questionario.setLocationRelativeTo(null);
                questionario.setVisible(true);
                
                
                
                

    
    }//GEN-LAST:event_btn_IniciarActionPerformed

       
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal principal = new frmPrincipal(new javax.swing.JFrame(), true) {
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                };
                principal.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                


                principal.setSize(getScreenSize());
                principal.setLocationRelativeTo(null);
                principal.setModal(true);
                principal.setVisible(true);
                
                          
            }
            
              private Dimension getScreenSize() { //<- função para pegar a resolução da tela
        return Toolkit.getDefaultToolkit().getScreenSize();

    }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Cabecario;
    // End of variables declaration//GEN-END:variables

}

    
