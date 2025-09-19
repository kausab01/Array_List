import java.util.ArrayList;

public class A21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> list1=new ArrayList<String>();
			
				list1.add("Red");
				list1.add("Green");
				list1.add("Black");
				
				System.out.println(list1);
				
				System.out.println("replace 2nd element with White");
				 list1.set(1, "White");
				for(String color : list1)
				{
					System.out.println(" : "+color);
				}
				
				
	}

}
