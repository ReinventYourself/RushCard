
package package1;

import java.util.HashSet;
import java.util.Set;

public class DuplicatevalueinArrayUsingHashSet {

	public static void main(String[] args) {
		
		String[] S = {"Ram","Shyam","Ram", "Ram"};
		
		Set<String> st = new HashSet<String>();
		int count =0;
		for(String element : S)
		{
			if(st.add(element)==false)
			{
			  System.out.println("Duplicate value is availalbe in the array :" + element);
			count++;
			}
		}
		
		System.out.println(count);

	}

}
