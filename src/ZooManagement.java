//-----------------------Prosit1-----------------------
/*import java.util.Scanner;

public class ZooManagement {
    // Déclaration des variables de classe
    private int nbrCages;
    private String zooName;

    // Constructeur par défaut (aucune initialisation nécessaire ici)

    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

    // Méthode principale (méthode d'entrée du programme)
    public static void main(String[] args) {
        // Création d'une instance de la classe ZooManagement
        ZooManagement zoo = new ZooManagement();

        // Utilisation de Scanner pour obtenir les informations de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer le nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = scanner.nextInt();

        // Nettoyer la ligne
        scanner.nextLine();

        // Demande à l'utilisateur d'entrer le nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        // Fermer le scanner
        scanner.close();

        // Appel de la méthode pour afficher les informations du zoo
        zoo.displayZooInfo();
    }
}*/
//-----------------------Prosit2-----------------------

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
    }
}