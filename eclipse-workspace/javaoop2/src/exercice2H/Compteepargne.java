package exercice2H;


	import java.util.Scanner;

	public class Compteepargne extends Comptebancaire{

	    public Compteepargne(long numCompte, double solde) {
	        super(numCompte, solde);
	        if (solde<200){
	            setSolde(200);
	        }
	    }
	    public void tauxIntérêtAnnuel(){
	        Scanner tauxIn = new Scanner(System.in);
	        System.out.println("taux d'intérêt annuel: ");
	        double tauxAnn = tauxIn.nextDouble();
	        tauxAnn = tauxAnn/100;
	        System.out.println("Your new Solde is: " + (getSolde() - (getSolde()*tauxAnn)) + "DH");
	        
	    }


}
