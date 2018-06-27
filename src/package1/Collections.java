package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;	
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<String>();
 		List<String> lst = new ArrayList<String>();
		lst.add("Gaurav");
		lst.add("Sourav");
		
		lst1.add("10");
		lst1.add("20");
	
		System.out.println("Array list size=" +lst.size());
		
		
		lst.addAll(lst1);
		
		
		for(int i =lst.size()-1;i>=0;i--)
		{
			System.out.println("Reverse order"+lst.get(i));
			
		}
	
		
		
		
		
		Iterator itr =  lst.iterator();
		
while(itr.hasNext())
{
System.out.println(itr.next());	
}

for(String element : lst)
{

	System.out.println("item in lst:- "  +element);
	
}

Set<Integer> st1 = new HashSet<Integer>();
Set<Integer> st =  new HashSet<Integer>();
st.add(1);
st.add(2);
st.add(3);
st1.add(50);
st1.add(60);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					

if(st.contains(1))
{
	st.remove(1);
st.add(70);

}




for(int element1:st)
{
	System.out.println("set element="+element1);
}

st.addAll(st1);


for(int element1:st)
{
	System.out.println("set element="+element1);
}

Iterator itr1 = st.iterator();

while(itr1.hasNext())
{
	System.out.println(itr1.next());
}


Map<String, Integer> mp = new HashMap<String,Integer>();

mp.put("ONE", 1);
mp.put("two", 2);
mp.put("Three", 3);




System.out.println("MAP:"+mp.entrySet());

 Set s = mp.entrySet();



 for(Map.Entry<String, Integer> entry :mp.entrySet())
 {
	 
	 System.out.println(entry.getKey()+ "  " + entry.getValue());
 }
 
 
 
 Iterator itr3 = s.iterator();

while(itr3.hasNext())
	System.out.println(itr3.next());

System.out.println(s);





}
}