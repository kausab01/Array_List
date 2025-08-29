import java.util.ArrayList;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		
		  ArrayList<String> a=new ArrayList<String>();
		  
		  ArrayList<String> al=new ArrayList<String>();
		
    
		    a.add("1");
			a.add("2");
			a.add("3");
			a.add("4");  
		  
		    al.add("A");
			al.add("B");
			al.add("C");
			al.add("D");
			System.out.println("List 1: "+a);
			System.out.println("List 2: "+al);
			ArrayList<String> b=al;
			System.out.println("After Copy :\n");
		    System.out.println();
		    System.out.println("List 1: "+al);
			System.out.println("List 2: "+b);
		
		  

	}

}
