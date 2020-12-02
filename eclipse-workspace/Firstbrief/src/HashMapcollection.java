import java.util.HashMap;

public class HashMapcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //exercice 18
	    HashMap<String, String> payeofplayers = new HashMap<String, String>();	
	payeofplayers.put("ronaldo", "portogal");
	payeofplayers.put("messi", "argentine");
	payeofplayers.put("ziyach", "morocco");
	payeofplayers.put("kross", "germany");
	
    //exercice 19
	System.out.println("Taille des éléments: " + payeofplayers.size());
	
	//exercice 20
	HashMap<String, String> payeofplayers2 = new HashMap<String, String>();
	payeofplayers2.putAll(payeofplayers);
    System.out.println(payeofplayers);
    
  //exercice 21
    
    payeofplayers2.clear();
    System.out.println(payeofplayers2);
}}
