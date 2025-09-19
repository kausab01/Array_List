import java.util.ArrayList;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> list1=new ArrayList<String>();
			
			list1.add("Red");
			list1.add("Green");
			list1.add("Black");
			list1.add("White");
		    list1.add("Pink");
		    
			System.out.println(list1);
			
           int s=list1.size();

			for(int i=0;i<s;i++)
			{
				System.out.println("position "+i+" : "+list1.get(i));
			}
			
	}

}
