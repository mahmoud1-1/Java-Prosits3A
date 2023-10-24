import java.util.Scanner;

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
}
