import java.util.ArrayList;
import java.util.HashSet;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		execrice1
	    ArrayList<String> months = new ArrayList<String>();
	    months.add("January");
	    months.add("February");
	    months.add("March");
	    months.add("April");
	    months.add("May");
	    months.add("June");
	    months.add("July");
	    months.add("September");
	    months.add("August");
	    months.add("October");
	    months.add("November");
	    months.add("December");
	    months.set(0, "AAAugust");

	    System.out.println(months);
	    
//		execrice2
	    
	    System.out.println(months.get(2));
//		execrice3

	    System.out.println(months.get(5));
//		execrice4

	    System.out.println(months.size());
//		execrice5
	    months.remove(2);
//		execrice9-10-11-12
	   
	    		ArrayList<String> clone = (ArrayList<String>) months.clone();
				ArrayList<String> months2 = clone;
			
	     System.out.println("ArrayList clonée: "+ months2);
	     System.out.println("ArrayList Originale: "+ months);


}}
