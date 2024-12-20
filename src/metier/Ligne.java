package metier;

import java.util.*;

public class Ligne {
   /* propriétés privées */
    private Article unArticle;
    private int qteCommande;
   
   /* getters et setters */
   public Article getUnArticle() {
       return unArticle;
   }

    public void setUnArticle(Article unArticle) {
        this.unArticle = unArticle;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public Ligne (Article unArticle, int qteCommande){
        /* Affectations */
        this.unArticle = unArticle;
        this.qteCommande = qteCommande;
    }
}