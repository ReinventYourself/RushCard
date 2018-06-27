package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Withoutmain {

	public static void occurancechar  (String str)
	{
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray())
		{
			if(m.containsKey(c))
			{
				Integer value = m.get(c)+1;
				m.put(c, value);
			}
			else 
			m.put(c, 1);
		}
		
	//Set s = 	m.entrySet();
	
	for(Entry<Character, Integer> entry : m.entrySet())
		System.out.println(entry.getKey()+ "   " + entry.getValue());
		
		
		
	}
	
public static void main(String[] args) {
	occurancechar("Programming");
}
		
}

