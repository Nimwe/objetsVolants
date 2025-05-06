package Interfaces.models;

public interface Rechargeable {

    void recharger();

    int niveauBatterie();

    static final int batterieInit = 100;

    default String infoCharge() {
        return "Batterie chargée à " + niveauBatterie() + " %.";
    }

}
