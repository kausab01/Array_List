import java.util.ArrayList;

public class A15 {

	public static void main(String[] args) {
		 ArrayList<String> list1=new ArrayList<String>();
			
			list1.add("Red");
			list1.add("Green");
			list1.add("Black");
			list1.add("White");
		    list1.add("Pink");
		    
		    System.out.println("list 1 : "+list1);
		    ArrayList<String> list2=new ArrayList<String>();
			
			list2.add("Red");
			list2.add("Green");
			list2.add("Black");
		    list2.add("Pink");
		    
		    System.out.println("list 2 : "+list2);//program to join two array lists
		    
		    list1.addAll(list2);
		    System.out.println("New Array : "+list1);

	}

}
