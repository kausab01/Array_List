import java.util.ArrayList;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> al=new ArrayList<String>();
			
			al.add("Red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
		    al.add("Black");
		    
		    System.out.println(al);
		    al.set(2, "Yellow");
		    System.out.println("After change : \n"+al);
		    
		   
	}

}
