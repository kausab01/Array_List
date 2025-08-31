import java.util.ArrayList;
import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
	
		  ArrayList<String> al=new ArrayList<String>();
			
				al.add("Red");
				al.add("Green");
				al.add("White");
			    al.add("Black");
	    
	    System.out.println("OG list 1 : "+al);
	    

	    
	    Scanner s=new Scanner(System.in);
	    ArrayList<String> al2=new  ArrayList<String>();
		al2.add("Red");
		al2.add("Green");
		al2.add("Orange");
		al2.add("White");
	    al2.add("Black");
	    al2.add("pink");
	    System.out.println("OG list 2 : "+al2);
	    ArrayList<String> al3=new  ArrayList<String>();
	    for(String a : al2)
	    {
	    	if(al.contains(a))
	    	{
	    		al3.add("YES");
	    		
	    	}
	    	else
	    	{
	    		al3.add("NO");
	    	}
	    	
	    }
	    
	    System.out.println(al3);
	    
	   /* for(int i=0;i<al.size();i++)
	    {
	    	for(int j=0;j<al2.size();j++)
	    	{
	         if()
	         {
	        	 list3.add(i, "Yes");
	         //	System.out.println("YES");
	         }
	         else{
	        	 list3.add(i, "No");
	    	 // System.out.println("NO");
	         }
	    	}
	    }*/
	    
	}

}
