/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import controller.ActionsJoueurs;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author framarlina
 */
public class InitialisationJeu extends javax.swing.JFrame {
    private javax.swing.JButton valider;
    private javax.swing.JLabel nbJoueursTitle;
    private javax.swing.JLabel pseudosTitle;
    private JComboBox nbJoueursList;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane scroll;
    private ActionsJoueurs actions;
    private ArrayList<JTextField> pseudos;
    
    public InitialisationJeu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        nbJoueursTitle = new javax.swing.JLabel();
        valider = new javax.swing.JButton("Valider");
        pseudosTitle = new javax.swing.JLabel();
        pseudosTitle.setText("Pseudos :");
        this.pseudos = new ArrayList<JTextField>();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nbJoueursTitle.setText("Nombre de joueurs :");
        Object nbJoueurs [] = {2,4,6};
        this.nbJoueursList = new JComboBox(nbJoueurs);
     
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbJoueursTitle)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(nbJoueursList, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(valider))
                    .addComponent(pseudosTitle))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(nbJoueursTitle)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbJoueursList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valider))
                .addGap(18, 18, 18)
                .addComponent(pseudosTitle)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {  
        int nbJoueurs = (int) nbJoueursList.getSelectedItem();
        int num = 1;
        for(int i=0;i<nbJoueurs;i++){
            JTextField joueur = new JTextField("Joueur "+num);
            pseudos.add(joueur);
        }
        int hauteur = 170;
        for(int i =0;i<pseudos.size();i++) {
            Panel.add(pseudos.get(i));
            pseudos.get(i).setBounds(20, 112, hauteur, 40);
            hauteur = hauteur-10;
        }
    }                                        

   
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialisationJeu().setVisible(true);
            }
        });
    }

                 
}
