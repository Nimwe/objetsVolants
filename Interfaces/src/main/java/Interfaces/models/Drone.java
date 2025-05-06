package Interfaces.models;

public class Drone implements Volant, Rechargeable {

    String identifiant;
    int autonomie;
    double vitesseMax;
    int batterie;

    // Constructor
    public Drone(String identifiant, int autonomie, double vitesseMax) {
        this.identifiant = identifiant;
        this.autonomie = autonomie;
        this.vitesseMax = vitesseMax;
        this.batterie = batterieInit;
    }

    // Getteurs et setteurs
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonimie(int autonomie) {
        this.autonomie = autonomie;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void voler() {
        if (batterie >= 15) {
            batterie -= 15;
        } else {

        }
    }

    @Override
    public double vitesseMax() {
        return vitesseMax;
    }

    @Override
    public String toString() {
        return "Le drone " + identifiant + ", a une autonomie de " + autonomie + " h, et vole à la vitesse max de "
                + vitesseMax + " km/h." + infoCharge();
    }

    @Override
    public void recharger() {
        batterie = batterieInit;
    }

    @Override
    public int niveauBatterie() {
        return batterie;
    }

}
