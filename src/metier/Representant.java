package metier;

import java.util.*;

public class Representant {

    /* propriétés privées */
    private int idRepresentant;
    private String prenom;
    private String nom;
    private double caRepresentant;
    private List<Client> lesClients;

    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        /* Affectations */
        this.idRepresentant = idRepresentant;
        this.prenom = prenom;
        this.nom = nom;
        this.lesClients = lesClients != null ? lesClients : new ArrayList<>();
    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        if (lesClients != null) {
            for (Client client : lesClients) {
                if (client.getIdClient() == idClient) {
                    return client;
                }
            }
        }
        return null;
    }

    /* getters et setters */
    public int getIdRepresentant() {
        return idRepresentant;
    }

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCaRepresentant() {
        return caRepresentant;
    }

    public void setCaRepresentant(double caRepresentant) {
        this.caRepresentant = caRepresentant;
    }

    public List<Client> getLesClients() {
        return lesClients;
    }

    public void setLesClients(List<Client> lesClients) {
        this.lesClients = lesClients;
    }

}
