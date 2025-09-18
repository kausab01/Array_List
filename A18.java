import java.util.ArrayList;

public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list1=new ArrayList<String>();
			
			list1.add("Red");
			list1.add("Green");
			list1.add("Black");
			list1.add("White");
		    list1.add("Pink");
		    
		    System.out.println("OG list : "+list1);
		    System.out.println("\nChecking the above array list is empty or not! "+list1.isEmpty());
		    
		    list1.clear();
		    System.out.println("\nlist after removing elemennt : "+list1);
		    System.out.println("\nChecking the above array list is empty or not! "+list1.isEmpty());
	}

}
