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
        int j=1;
        int k=0;
        for (int i=1;i<41;i++){
            if(j<=10){
                Carte carteJaune= new Carte(k,"jaune");
                this.paquet.add(carteJaune);
            }else if(j<=20){
                Carte carteBleue= new Carte(k,"bleue");
                this.paquet.add(carteBleue);
            }else if(j<=30){
                Carte carteVerte= new Carte(k,"verte");
                this.paquet.add(carteVerte);
            }else {
                Carte carteRouge = new Carte(k,"rouge");
                this.paquet.add(carteRouge);
            }
            j++;
            if (k<9) {
                k++;
            }else {
                k = 0;
            }
        }
        
        Collections.shuffle(this.paquet);
    }
    
    public void affiche(){
        for(int i =0; i<this.paquet.size();i++){
            System.out.println(this.paquet.get(i).toString());
        }
    }
    public static void main(String[] args) {
        Paquet p = new Paquet();
        p.affiche();
    }
}
