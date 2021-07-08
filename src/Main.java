import Carte.*;

public class Main {
    public static void main(String[] args) {
        Carte Guerrier = new Sorts(Couleur.BLANC, 1, 0, false, false);

        System.out.println(Guerrier.toString());
        Guerrier.engagerCarte();
        System.out.println(Guerrier.toString());
    }
}
