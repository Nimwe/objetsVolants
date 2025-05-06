package Interfaces;

import Interfaces.models.Avion;
import Interfaces.models.Drone;
import Interfaces.models.Helicoptere;

import Interfaces.models.Volant;
import Interfaces.models.Rechargeable;
import Interfaces.models.VitesseComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// ✅ 👍 Good Job

public class App {
    public static void main(String[] args) {

        // Liste de Volants
        List<Volant> enginsVolants = new ArrayList<>();

        // Création des Volants
        Avion Concorde = new Avion("Concorde", 2180, 4);
        Drone Talarion = new Drone("Talarion", 20, 555);
        Helicoptere Panther = new Helicoptere("Panther - AS565", 306, 2);

        // Ajout des Volants
        Collections.addAll(enginsVolants, Concorde, Talarion, Panther);

        // Tri par vitesse max
        enginsVolants.sort(new VitesseComparator());

        // Affichage des Volants
        System.out.println("Listes des engins volants triés par leurs vitesse maximale: \n");

        // Simulation de vol avec gestion de batterie quand necessaire
        for (Volant volant : enginsVolants) {

            // Affichage des infos complètes
            System.out.println(volant);

            // Determination si rechargeable ou non
            if (volant instanceof Rechargeable) {
                System.out.println("Cet engin est rechargeable");
                Rechargeable rechargeable = (Rechargeable) volant;
                String nom = ((Drone) volant).getIdentifiant();

                System.out.println(nom + " effectue un vol consommant 15% de sa batterie");
                volant.voler();

                System.out.println("Niveau de batterie de " + nom + " après le vol : " + rechargeable.infoCharge());
                rechargeable.recharger();

                System.out.println("Niveau batterie de " + nom + " après recharge : " + rechargeable.infoCharge());

            } else {
                System.out.println("Cet engin n'est pas rechargeable");
                volant.voler();
            }

            System.out.println("------------------");
        }
    }
}
