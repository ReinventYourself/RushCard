         package package1;
import java.util.HashMap;
//{P=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
import java.util.LinkedHashMap;
import java.util.Map;
public class FindtheCountofOccurancesOfEachCharacter {
 
public static void freqcount(String str)
{   	str = str.replace(" ", "");
	Map<Character, Integer> Stormap = new HashMap<Character, Integer>();
	 for(char ch : str.toCharArray())
	 {	  if (Stormap.containsKey(ch))
		 {
		 Integer value = Stormap.get(ch) +1; 
			Stormap.put(ch, value);}
	 else{
		
		Stormap.put(ch, 1);
	}
		 }
	 
	 System.out.println(Stormap);
}

public static void main(String arg[])

{
	
	FindtheCountofOccurancesOfEachCharacter.freqcount("Programming");
	
};

}
