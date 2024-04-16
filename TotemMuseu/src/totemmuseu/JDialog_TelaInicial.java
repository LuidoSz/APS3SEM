
package totemmuseu;

import java.awt.Image;
import java.awt.Toolkit;


public class JDialog_TelaInicial extends javax.swing.JDialog {

    
    private JDialog_TelaInicial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Image background = Toolkit.getDefaultToolkit().getImage("../imgs/starfield.png");
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Intro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_Desc = new javax.swing.JTextArea();
        btn_Iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1280));

        txt_Intro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_Intro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Intro.setText("BEM VINDO AO QUESTIONÁRIO DO MUSEU! PRONTO PARA TESTAR SEUS CONHECIMENTOS?");
        txt_Intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IntroActionPerformed(evt);
            }
        });

        txa_Desc.setColumns(20);
        txa_Desc.setRows(5);
        txa_Desc.setText("Lorem ipsum dolor sit amet. In nihil voluptas ut quis dolores id repellendus quas sed accusamus iste. Eos culpa accusamus qui galisum dicta eos natus quos.\n\nSit doloribus adipisci aut autem modi aut nobis galisum quo dolore cumque est mollitia voluptatem. Est optio reiciendis ex quia nobis est dolor Quis quo commodi dicta qui internos eaque. Est Quis magnam sed fugit adipisci aut dignissimos nihil cum natus architecto At tempora reiciendis cum quae ipsa et nisi similique. Et nihil quisquam sed quasi dolore At illum voluptatem sit molestias rerum.\n\nQuo repellat dolorem ea iure odit qui sint eveniet aut aliquid optio est minus amet. Quo doloribus quaerat sit voluptatibus quaerat est esse dignissimos.\n\nLorem ipsum dolor sit amet. In nihil voluptas ut quis dolores id repellendus quas sed accusamus iste. Eos culpa accusamus qui galisum dicta eos natus quos.\n\nSit doloribus adipisci aut autem modi aut nobis galisum quo dolore cumque est mollitia voluptatem. Est optio reiciendis ex quia nobis est dolor Quis quo commodi dicta qui internos eaque. Est Quis magnam sed fugit adipisci aut dignissimos nihil cum natus architecto At tempora reiciendis cum quae ipsa et nisi similique. Et nihil quisquam sed quasi dolore At illum voluptatem sit molestias rerum.\n\nQuo repellat dolorem ea iure odit qui sint eveniet aut aliquid optio est minus amet. Quo doloribus quaerat sit voluptatibus quaerat est esse dignissimos.\n\nLorem ipsum dolor sit amet. In nihil voluptas ut quis dolores id repellendus quas sed accusamus iste. Eos culpa accusamus qui galisum dicta eos natus quos.\n\nSit doloribus adipisci aut autem modi aut nobis galisum quo dolore cumque est mollitia voluptatem. Est optio reiciendis ex quia nobis est dolor Quis quo commodi dicta qui internos eaque. Est Quis magnam sed fugit adipisci aut dignissimos nihil cum natus architecto At tempora reiciendis cum quae ipsa et nisi similique. Et nihil quisquam sed quasi dolore At illum voluptatem sit molestias rerum.\n\nQuo repellat dolorem ea iure odit qui sint eveniet aut aliquid optio est minus amet. Quo doloribus quaerat sit voluptatibus quaerat est esse dignissimos.\n\nLorem ipsum dolor sit amet. In nihil voluptas ut quis dolores id repellendus quas sed accusamus iste. Eos culpa accusamus qui galisum dicta eos natus quos.\n\nSit doloribus adipisci aut autem modi aut nobis galisum quo dolore cumque est mollitia voluptatem. Est optio reiciendis ex quia nobis est dolor Quis quo commodi dicta qui internos eaque. Est Quis magnam sed fugit adipisci aut dignissimos nihil cum natus architecto At tempora reiciendis cum quae ipsa et nisi similique. Et nihil quisquam sed quasi dolore At illum voluptatem sit molestias rerum.\n\nQuo repellat dolorem ea iure odit qui sint eveniet aut aliquid optio est minus amet. Quo doloribus quaerat sit voluptatibus quaerat est esse dignissimos.\n");
        jScrollPane1.setViewportView(txa_Desc);

        btn_Iniciar.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn_Iniciar.setText("INICIAR QUESTIONÁRIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_Intro, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_Intro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IntroActionPerformed
       
    }//GEN-LAST:event_txt_IntroActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_TelaInicial dialog = new JDialog_TelaInicial(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txa_Desc;
    private javax.swing.JTextField txt_Intro;
    // End of variables declaration//GEN-END:variables
}
