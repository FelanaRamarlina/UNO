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
public class Joueur extends Paquet
{
    private String pseudo;
    
    public Joueur(String pseudo){
        this.pseudo = pseudo;
    } 
    
    public String getPseudo(){
        return this.pseudo;
    }
    
}
