/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author fr130611
 */
public class Carte {
    private int num;
    private String couleur;
    
    public Carte(int num, String couleur){
        this.num = num;
        this.couleur = couleur;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public String getCouleur(){
        return this.couleur;
    }
    
    public String toString(){
        return this.getNum()+" "+this.getCouleur();
    }
}
