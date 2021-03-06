/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import controller.ActionsJoueurs;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modele.Joueur;

/**
 *
 * @author framarlina
 */
public class InitialisationJeu extends javax.swing.JFrame {
    private javax.swing.JButton valider;
    private javax.swing.JLabel nbJoueursTitle;
    private javax.swing.JLabel pseudosTitle;
    private JComboBox nbJoueursList;
    private javax.swing.JPanel  Panel;
    private javax.swing.JScrollPane scroll;
    private ActionsJoueurs actions;
    private ArrayList<JTextField> pseudos;
    
    public InitialisationJeu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents(){
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


        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout( Panel);
        Panel.setLayout( PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup( PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup( PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbJoueursTitle)
                    .addGroup( PanelLayout.createSequentialGroup()
                        .addComponent(nbJoueursList, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(valider))
                    .addComponent(pseudosTitle))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup( PanelLayout.createSequentialGroup()
                .addComponent(nbJoueursTitle)
                .addGap(18, 18, 18)
                .addGroup( PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent( Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent( Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    
    /*événements*/
    
    //Initialisation des joueurs
    private void validerActionPerformed(java.awt.event.ActionEvent evt) {  
        valider.setVisible(false);
        int nbJoueurs = (int) nbJoueursList.getSelectedItem();
        int num = 1;
        for(int i=0;i<nbJoueurs;i++){
            JTextField joueur = new JTextField("Joueur "+num);
            pseudos.add(joueur);
            num++;
        }
        int hauteur = 110;
        for(JTextField txt : pseudos) {
            Panel.add(txt);
            txt.setBounds(20, hauteur, 170, 40);
            hauteur = hauteur+60;
        }
        
        JButton jouer = new JButton("Jouer");
        Panel.add(jouer);
        jouer.setBounds(20, 460, 170, 40);
        
        jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialiserActionPerformed(evt);
            }
        });
        
    }  
    
    private void initialiserActionPerformed(java.awt.event.ActionEvent evt) { 
        this.actions = new ActionsJoueurs();
        for(JTextField txt : pseudos){
            Joueur joueur = new Joueur(txt.getText());
            this.actions.ajouter(joueur);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
    
   
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InitialisationJeu Jeu = new InitialisationJeu();
                Jeu.setSize(540,540);
                Jeu.setVisible(true);
            }
        });
    }

                 
}
