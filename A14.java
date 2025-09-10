import java.util.ArrayList;

public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> list1=new ArrayList<String>();
			
			list1.add("Red");
			list1.add("Green");
			list1.add("Black");
			list1.add("White");
		    list1.add("Pink");
		    
		    System.out.println("list before swapping : ");
		    
			for(String color : list1)
			{
				System.out.println(" : "+color);
			}
			
			int a=0,b=2;
			if(a>=0 && a< list1.size() && b>=0 && b<list1.size()){
				String change=list1.get(a);
				list1.set(a, list1.get(b));
				list1.set(b, change);
			}
			
			System.out.println("after Swapping : ");
			for(String color : list1)
			{
				System.out.println(" : "+color);
			}
			
	}

}
