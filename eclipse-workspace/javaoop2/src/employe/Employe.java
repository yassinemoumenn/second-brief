package employe;

public class Employe {
	

		
		private String nom;
	    private String prenom;
	    private String adress;
	    private int anneeNaissance;
	    private int anneeEncours;

	    public int calculerAge(){
	        return anneeEncours-anneeNaissance;
	    }
	    public void afficherInfosClient(){
	        System.out.println("Nom est : "+nom+"\n" +"Prenom est :  "+prenom+"\n"+"Adress est : "+adress+"\n"+"Age est : "+calculerAge());
	    }

	    public Employe setNom(String nom) {
	        this.nom = nom;
	        return this;
	    }

	    public Employe setPrenom(String prenom) {
	        this.prenom = prenom;
	        return this;
	    }

	    public Employe setAdress(String adress) {
	        this.adress = adress;
	        return this;
	    }

	    public Employe setAnneeNaissance(int anneeNaissance) {
	        this.anneeNaissance = anneeNaissance;
	        return this;
	    }

	    public Employe setAnneeEncours(int anneeEncours) {
	        this.anneeEncours = anneeEncours;
	        return this;
	    }

	    public Employe (String nom, String prenom, String adress, int anneeNaissance, int anneeEncours) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adress = adress;
	        this.anneeNaissance = anneeNaissance;
	        this.anneeEncours = anneeEncours;
	    }
}
