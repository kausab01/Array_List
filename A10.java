import java.util.ArrayList;
import java.util.Scanner;

public class A10 extends Thread{

	public static void main(String[] args) {
		  ArrayList<String> al=new ArrayList<String>();
			Scanner sc=new Scanner(System.in);
			/*0al.add("Red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
		    al.add("Black");
		    */
			String input;
			System.out.println("input ");
		
				    
			        while (!(input = sc.nextLine()).equalsIgnoreCase("ok")) {
			           al.add(input);
			        }
				
	
			   System.out.println(al.subList(0,2));
		    

	}

}
