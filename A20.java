import java.util.ArrayList;

public class A20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> al=new ArrayList<String>();
			
				al.add("Red");
				al.add("Green");
				al.add("Orange");
				
				System.out.println(al);
			
				al.ensureCapacity(6); 
				al.add("White");
				al.add("Pink");
				al.add("Blue");
				System.out.println(al);
		
	}

}
