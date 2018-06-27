package package1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

String s  = "gar";
StringBuffer sb = new StringBuffer(s).reverse();
 System.out.println(s);
 System.out.println(sb);
if(s.equals(sb.toString()))
	System.out.println("Pallindrom");
else 
	System.out.println("Not");
}
/*int flag =0;

int length = s.length();

	for(int i=0;i<length/2;i++)
	{  
	if(s.charAt(i)!= s.charAt(length-i-1) )
	{
		flag =0;
		break;
	}
	else 
	{
	 flag = 1;
	
	}
	
	}
	
	if(flag==1)
		System.out.println("Pallindrom");
	else
		System.out.println("Not Pallindrom");
	
	}*/



}

