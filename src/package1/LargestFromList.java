package package1;

import java.util.ArrayList;
import java.util.List;

public class LargestFromList {

	public static void main(String[] args) {
		
		List<Integer> lst  = new ArrayList<Integer>();
		
		lst.add(55);
		lst.add(58);
		lst.add(60);
		
		int largest = lst.get(0);
		
		for(int i = 1;i<lst.size();i++)
		{
			if(largest<lst.get(i))
			largest = lst.get(i);	
		}
		
		System.out.println(largest);
		
		//for(int list : lst)
			//System.out.println(list);
		
		

	}

}
