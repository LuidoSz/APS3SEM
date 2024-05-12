
package apresentacao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;


 
public class frmPrincipal extends javax.swing.JDialog {



    
    frmPrincipal (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true); //<- remove bordas
        initComponents();
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btn_Iniciar = new javax.swing.JButton();
        lbl_Cabecario = new javax.swing.JLabel();
        lbl_Enunciado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setSize(new java.awt.Dimension(10, 10));

        btn_Iniciar.setBackground(new java.awt.Color(255, 102, 0));
        btn_Iniciar.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn_Iniciar.setText("INICIAR QUESTIONÁRIO");
        btn_Iniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Iniciar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_IniciarActionPerformed(evt);
            }
        });

        lbl_Cabecario.setBackground(new java.awt.Color(153, 153, 153));
        lbl_Cabecario.setFont(lbl_Cabecario.getFont().deriveFont(lbl_Cabecario.getFont().getStyle() | java.awt.Font.BOLD, lbl_Cabecario.getFont().getSize()+38));
        lbl_Cabecario.setText("QUESTIONÁRIO (TEXTO PRA ENCHER LINGUÇA)");

        lbl_Enunciado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Enunciado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_Enunciado.setLabelFor(lbl_Enunciado);
        lbl_Enunciado.setText("dfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsfsfsfsffsfsdfsdfdsf\\sf\\sfdfsdfdsf\\sf\\sf");
        lbl_Enunciado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_Enunciado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_Enunciado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
                                .addComponent(lbl_Enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_Cabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Enunciado)
                .addGap(432, 432, 432)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarActionPerformed
        
                frmPrincipal.this.dispose();
        
                frmQuestionario questionario = new frmQuestionario(new javax.swing.JFrame(), true);
                
                questionario.setVisible(true);
                
                
                
                

    
    }//GEN-LAST:event_btn_IniciarActionPerformed

       
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal principal = new frmPrincipal(new javax.swing.JFrame(), true) {
                    public void actionPerformed(ActionEvent e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                principal.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                
                principal.setSize(getScreenSize());
                principal.setModal(true);
                principal.setLocationRelativeTo(null);            
                principal.setVisible(true);
                
                          
            }
            
              private Dimension getScreenSize() { //<- função para pegar a resolução da tela
        return Toolkit.getDefaultToolkit().getScreenSize();

    }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbl_Cabecario;
    private javax.swing.JLabel lbl_Enunciado;
    // End of variables declaration//GEN-END:variables
}

    
