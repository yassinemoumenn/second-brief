package exercice2H;

public class Main {

	public static void main(String[] args) {
		Comptebancaire Comptef = new Comptebancaire(0, 200);
		Comptef.setSolde(100);
		System.out.println(Comptef.getSolde());
        Comptef.ajouter();
        System.out.println();
        Comptef.retirer();
        System.out.println();
        Comptef.afficher();
        System.out.println();
        System.out.println("Classe CompteEpargne Solution");
        System.out.println();
        Compteepargne Comptes = new Compteepargne(0, 100);
        Comptes.afficher();
        System.out.println();

        Comptes.tauxIntérêtAnnuel();
        System.out.println("");
        System.out.println("Classe CompteCourant Solution");
        System.out.println();

    }


}
