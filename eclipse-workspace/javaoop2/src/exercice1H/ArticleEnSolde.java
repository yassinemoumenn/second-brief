package exercice1H;

public class ArticleEnSolde extends Article{

    private int reduction;
   

    public ArticleEnSolde(String nom, int prix, int réduction) {
        super(nom, prix);
        this.reduction = réduction;
    }

    @Override
    public int afficher() {
        int percent = super.afficher()*reduction/100;
        return super.afficher() - percent;
    }
}


