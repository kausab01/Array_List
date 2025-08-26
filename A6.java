import java.util.ArrayList;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> al=new ArrayList<String>();
			
			al.add("Red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
		    al.add("Black");
		    
		    System.out.println(al);
		    al.remove(2);
		    System.out.println("After removing 3rd element : \n"+al);
	}

}
