/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author fr130611
 */
public class Joueur 
{
    private String pseudo;
    private ArrayList<Carte> paquet;
    
    public Joueur(String pseudo){
        this.pseudo = pseudo;
        this.paquet = new ArrayList<Carte>();
    } 
    
    public void ajouter(Carte c){
        this.paquet.add(c);
    }
    public void retirer(Carte c){
        this.paquet.remove(c);
    }
    
    public String getPseudo(){
        return this.pseudo;
    }
    
    public ArrayList<Carte> paquet(){
        return this.paquet;
    }
}
