package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Aquatic bouri =new Aquatic("String family", "String name", 1, true, "String habitat");
        Aquatic nazali =new Aquatic("String family", "String name", 1, true, "String habitat");
        myZoo.addAquaticAnimal(bouri);
        myZoo.addAquaticAnimal(nazali);
        myZoo.afficherSwim();


    }

}
