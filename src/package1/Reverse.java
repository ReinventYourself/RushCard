package package1;

public class Reverse {
	
	public static void reverseNumber(String input)
	  {
		
		//String S = input;
		//String S = String.valueOf(input);
        StringBuffer SB=  new StringBuffer(input).reverse();
	  System.out.println(SB);
	  }
	
	
	public static void reverseusingforloop(String str)
	{
		String	reverse = "";
		
	for(int i = str.length()-1;i>=0;i--)
     reverse = reverse+ str.charAt(i);
     System.out.println(reverse);
		
	}
	
	
	
	public static void reversestringbyconvertingintoCharArray( String str)
	{
		
		String reverse = "";
		char [] arr = str.toCharArray();
		
		for(int i =arr.length-1;i>=0;i--)
			reverse = reverse + arr[i];
	System.out.println(reverse);	
	}
	
	
	
	public static void reversestringwordbyword(String str)
	{
	String[] arr1 = str.split(" ");

	for(int i = 0;i<arr1.length;i++)
	{	
		char [] ch = arr1[i].toCharArray();
		
		for(int j = ch.length-1;j>=0;j--)
		{
			
			System.out.print(ch[j]);
			
		}
			
		System.out.print(" ");
	}
	
	
	}
	
	
	public static void removeSpace(String str)
	{
	String S1 =	str.replaceAll(" ", "");
		
		System.out.println(S1);
		
		
	}
	
	
	
	
	
      public static void main(String[] args) {
	    reverseNumber("RAM");
        reverseusingforloop("ketan kumar ");
	    reversestringbyconvertingintoCharArray("Programming");
	    
	    
	    reversestringwordbyword("he is a programmin");

	    removeSpace("this is new ");
      }	
	
      
      
	

}
