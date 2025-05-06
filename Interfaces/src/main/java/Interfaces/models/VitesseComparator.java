package Interfaces.models;

import java.util.Comparator;

public class VitesseComparator implements Comparator<Volant> {

    @Override
    public int compare(Volant vol1, Volant vol2) {
        return Double.compare(vol1.vitesseMax(), vol2.vitesseMax()); // Tri par ordre croissant - Pour avoir l'ordre
                                                                     // décroissant => return
                                                                     // Double.compare(vol2.vitesseMax(),
                                                                     // vol1.vitesseMax());
    }

}
