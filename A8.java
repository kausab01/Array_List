import java.util.ArrayList;

public class A8 {

	public static void main(String[] args) {


		  ArrayList<String> al=new ArrayList<String>();
			
			al.add("Red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
		    al.add("Black");
			    int j=0;
			    System.out.println("List before Sort : "+al);
			   /* al.sort(null);
			    System.out.println("list after Sort : \n"+al);*/
			    int n=al.size();
			    
			    for(int i=0;i<n-1;i++)
			    {
			    	for(j=i;j<n;j++)
			    	{
			    		String s1=al.get(i);
			    		String s2=al.get(j);
			    		if(s1.compareToIgnoreCase(s2)>0)
			    		{
			    		        
		                        al.set(i, s2);
		                        al.set(j, s1);
			    		}
			    	}
			    }
		          System.out.println("list after sorting : " +al);
			    
			    
	}

}

/*
 
    public class SortWithoutSortMethod {
        public static void mysort(ArrayList<Integer> list) {
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        // Swap elements
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
           al.add(5);
           al.add(2);
            al.add(8);
            al.add(1);
           al.add(9);

            System.out.println("Original ArrayList: " + al);
            mySort(al);
            System.out.println("Sorted ArrayList (Bubble Sort): " + numbers);
        }
    } 
 
 */
