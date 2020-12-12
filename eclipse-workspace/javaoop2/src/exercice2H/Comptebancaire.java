package exercice2H;

import java.util.Scanner;

public class Comptebancaire {
	// Attributs Compte Bancaire
	
    private long numCompte;
    private double solde;
    
   

	// Constructeur création Compte bancaire
    public Comptebancaire(long numCompte, double solde ) {

        this.numCompte = numCompte;
        this.solde = solde;

        
    }

 // Getters et Setters
    public long getNumCompte() {
        return numCompte;
    }
    public void setNumCompte(long numCompte) {
        this.numCompte = numCompte;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
			this.solde = solde;
        
        
    }
  //Methode ajout
    public void ajouter(){
        Scanner ajoute = new Scanner(System.in);
        System.out.println("Add to the Account: ");
        double enter = ajoute.nextDouble();
        solde = solde + enter;
    }
      //Methode Retirer
        public void retirer(){
            Scanner retire = new Scanner(System.in);
            System.out.println("Combien vous voulez obtenir du compte: ");
            double take = retire.nextDouble();
            if (take<=solde){
                solde = solde - take;
            }else {
                System.out.println("Vous ne possédez pas beaucoup d'argent: ");
            }


        }
      //Methode d'Affichage
        public void afficher(){
            System.out.println("");
            System.out.println("Votre nouveau Solde est: " + solde + "DH");
            System.out.println("");

        }
    }


