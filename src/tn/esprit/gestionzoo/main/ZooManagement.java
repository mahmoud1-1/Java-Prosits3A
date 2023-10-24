package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic("Fish", "Salmon", 2, false, "Water habitat");

        Dolphin dolphin = new Dolphin("Ocean", 25.5f);
        Penguin penguin = new Penguin("Antarctic", 10.0f);

        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);


    }

}
