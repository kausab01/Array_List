import java.util.ArrayList;

public class A12 {

	public static void main(String[] args) {


		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
	    al.add("Black");
	    
	    System.out.println("OG list : "+al);
	    
	    System.out.println("\nList of first 3 element : "+al.subList(0, 3));
	}

}
