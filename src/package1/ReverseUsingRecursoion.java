package package1;

public class ReverseUsingRecursoion {

	public static void  reverse (int num)
	{
		if(num<10)
		{
			System.out.print(num);
			
		}
		else 
		{
			
			System.out.print(num%10);
			reverse(num/10);
			
		}
		
	}
	
	public static String  reverse (String Str)
	{
		  if (Str.isEmpty())
		  return Str;
		  else 
		   return reverse(Str.substring(1))
		    + Str.charAt(0);	
	}
	
	
	
	public static void main(String[] args) {
		
	  String S =  reverse("rohit");
	System.out.println(S);
	
	//String S1 = "Rohit";
	
	//System.out.println(S1.substring(1)+ S1.charAt(0));
	
	
	
	}



}
