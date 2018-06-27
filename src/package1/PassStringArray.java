package package1;

import java.util.HashMap;
import java.util.Map;

public class PassStringArray {

	public static void  occuofeachword(String str)
	{
		
		//str = str.replace(" ", "");
		
	String[] arr =	str.split(" ");
		
	Map<String, Integer> MP = new HashMap<String, Integer>();
	for(String S : arr)
	{
		if(MP.containsKey(S))
		{
			Integer value = MP.get(S)+1;
			MP.put(S,value);
		}
		
		else 
			MP.put(S, 1);
		
	}
	
 System.out.println(MP);

	
	
	}
	
	
	
	public static void main(String[] args) {
      String str = new String("this is gaurav a a");
		
		PassStringArray.occuofeachword(str);
		
	
	
	
	}

}
