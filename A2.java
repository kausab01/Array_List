import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		al.add("yellow");
		al.add("Blue");
		 
		System.out.println("Input : "+al);
		
		for(String color : al)
		{
			System.out.println(" : "+color);
		}
		

	}


}
