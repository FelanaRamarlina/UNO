/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import modele.Carte;
import modele.Joueur;
import modele.Paquet;

/**
 *
 * @author framarlina
 */
public class ActionsJoueurs {
    private ArrayList<Joueur> joueurs;
    private Paquet paquetCartes;
    
    public ActionsJoueurs() {
        this.joueurs = new ArrayList<Joueur>();
        this.paquetCartes = new Paquet();
        int j=1;
        int k=0;
        for (int i=1;i<41;i++){
            if(j<=10){
                Carte carteJaune= new Carte(k,"jaune");
                this.paquetCartes.ajouter(carteJaune);
            }else if(j<=20){
                Carte carteBleue= new Carte(k,"bleue");
                this.paquetCartes.ajouter(carteBleue);
            }else if(j<=30){
                Carte carteVerte= new Carte(k,"verte");
                this.paquetCartes.ajouter(carteVerte);
            }else {
                Carte carteRouge = new Carte(k,"rouge");
                this.paquetCartes.ajouter(carteRouge);
            }
            j++;
            if (k<9) {
                k++;
            }else {
                k = 0;
            }
        }
        
        this.paquetCartes.melanger();
    }
    
    public void distribuer(){
        int i;
        System.out.println();
        for(i=0;i<this.joueurs.size();i++){
            for(int j=0;j<7;j++){
                this.joueurs.get(i).ajouter(this.paquetCartes.index(j));
                this.paquetCartes.retirer(this.paquetCartes.index(j));
            }
        }        
    }
    
    public void ajouter(Joueur joueur){
        this.joueurs.add(joueur);
    }
    
    public ArrayList<Joueur> getJoueurs(){
        return this.joueurs;
    }
    
    //Traiter les pseudos uniques
    public Joueur getJoueur(String pseudo){
        Joueur joueur = null;
        for(int i=0; i<this.joueurs.size();i++){
            if(this.joueurs.get(i).getPseudo()==pseudo)
                joueur = this.joueurs.get(i);
        }
        return joueur;
    }
    
    public static void main(String[]argz){
        ActionsJoueurs actions = new ActionsJoueurs();
        actions.ajouter(new Joueur("José"));
        actions.ajouter(new Joueur("David"));
        actions.distribuer();
        
        for(int i=0; i<actions.getJoueurs().size();i++) {
            System.out.println(actions.getJoueurs().get(i).getPseudo());
        }
        actions.getJoueur("José").afficherCartes();
        System.out.println();
        actions.getJoueur("David").afficherCartes();
    }
}
