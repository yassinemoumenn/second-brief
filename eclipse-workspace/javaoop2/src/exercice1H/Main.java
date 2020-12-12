package exercice1H;

public class Main{
public static void main(String[] args) {
	
    Article phone = new Article("phone", 250);
    System.out.println(phone.afficher());

    System.out.println("phonessss");
    ArticleEnSolde iphone = new ArticleEnSolde("iphone", 1600, 20);
    System.out.println("The price with reduction is " + iphone.afficher());
}


}