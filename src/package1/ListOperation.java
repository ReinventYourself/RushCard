package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperation {

	public static void main(String[] args) {
		
List<String> L = new ArrayList<String>();
L.add("Ram");
L.add("Shyam");
L.add(null);
L.add(null);

// Using for Each loop
 for(String element :L )
  System.out.println(element);

 
 // Using Iterator32
 
 Iterator Iterator = L.iterator();
 while(Iterator.hasNext())
	System.out.println(Iterator.next());
 
 //for more list-specific, use a list iterator as shown below
 
 
 
 
 
	
 
 
 
}
	}
