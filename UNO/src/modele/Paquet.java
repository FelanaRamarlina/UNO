/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fr130611
 */
public class Paquet {
    private ArrayList<Carte> paquet;
    
    public Paquet(){
        this.paquet = new ArrayList<Carte>();
    }
    
    public void afficherCartes(){
        for(int i =0; i<this.paquet.size();i++){
            System.out.println(this.paquet.get(i).toString());
        }
    }
    
    public Carte index(int i){
        return this.paquet.get(i);
    }
    public int taille(){
        return this.paquet.size();
    }
    
    public void melanger(){
        Collections.shuffle(this.paquet);
    }
    
    public void ajouter(Carte c){
        this.paquet.add(c);
    }
    
    public void retirer(Carte c){
        this.paquet.remove(c);
    }
    
    public ArrayList<Carte> paquet(){
        return this.paquet;
    }
    
    public static void main(String[] args) {
        Paquet p = new Paquet();
        p.afficherCartes();
    }
}
