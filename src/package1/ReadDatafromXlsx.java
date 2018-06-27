package package1;

import java.util.HashMap;
import java.util.Map;

public class ReadDatafromXlsx {

	public static void main(String[] args) {

	Map<Character,Integer> mp  = new HashMap<Character,Integer>();
mp.put('A', 1); 
mp.put('B', 2);
mp.put('C', 3);


System.out.println(mp);
	
int s =  mp.put('A', 10);

System.out.println(s);

System.out.println(mp);



	
	}
 
 
}
