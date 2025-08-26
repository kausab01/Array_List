import java.util.ArrayList;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		  ArrayList<String> al=new ArrayList<String>();
			
				al.add("Red");
				al.add("Green");
				al.add("Orange");
				al.add("White");
			    al.add("Black");
			    
			    System.out.println("search element : ");
			    String color=sc.nextLine();
			    if(al.contains(color)){
			    	 System.out.println("found the element ");
			    }
			   
	}

}
