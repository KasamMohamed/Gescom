package metier;

import java.util.*;
import metier.Tva;
import metier.Famille;

public class Article {

    /*propriétés privées*/
    private int idArticle;
    private String designation;
    private int qteStock;
    private double prix;

    /* getters et setters*/
    public int getIdArticle() {
        return idArticle;
    }
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getQteStock(){
        return qteStock;
    }
    public void setQteStock(int qteStock){
        this.qteStock = qteStock;
    }
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix) {
        this.prix=prix;
    }

    public Article(int idArticle, String designation, int qteStock, double prix, Tva uneTva, Famille uneFamille){

    }
}
