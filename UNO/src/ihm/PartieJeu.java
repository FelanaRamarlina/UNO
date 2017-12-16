
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.util.ArrayList;
import javax.swing.JPanel;
import modele.Joueur;

/**
 *
 * @author framarlina
 */
public class PartieJeu extends javax.swing.JFrame {
    private InitialisationJeu joueurFenetre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    
    public PartieJeu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {
        
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 272, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        
        
        this.joueurFenetre = new InitialisationJeu(); 
        ArrayList<Joueur> joueurs = this.joueurFenetre.getJoueursInitialize();
        
        
        //affichage des carte du joueur qui doit jouer
        /*for(Carte c : joueurs.get(0).paquet()){
            JPanel carte = new JPanel();
            carte.setBounds(20, hauteur, 170, 40);
        }*/
       /* 
        JPanel carte = new JPanel();
        this.add(carte);
        */
    }                      

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartieJeu().setVisible(true);
            }
        });
    }

                   
}
