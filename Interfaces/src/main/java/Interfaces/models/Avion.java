package Interfaces.models;

public class Avion implements Volant {

    String modele;
    double vitesseMax;
    int nbMoteurs;

    // Constructor
    public Avion(String modele, double vitesseMax, int nbMoteurs) {
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        this.nbMoteurs = nbMoteurs;
    }

    // Getteurs et setteurs
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteur(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }

    @Override
    public void voler() {
    }

    @Override
    public double vitesseMax() {
        return vitesseMax;
    }

    @Override
    public String toString() {
        return "L'avion " + modele + ", vole à la vitesse maximale de " + vitesseMax + " km/h, et possede " + nbMoteurs
                + " moteurs.";
    }

}
