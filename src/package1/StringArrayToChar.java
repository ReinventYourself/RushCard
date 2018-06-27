package package1;

public class StringArrayToChar {

	public static void main(String[] args) {
	
		String s  = "this is new";		
   // System.out.println(s.length());
       /*String[] Arr = s.split(" ");
		for(int j =Arr.length-1;j>=0;j--)
       System.out.println(Arr[j]);*/
    	   
       char[] c = s.toCharArray();
       for(int i =c.length-1; i>=0;i--)
    	   System.out.println(c[i]);
       
       
		
		
		
	//System.out.println(Arr.length);	
				
		
	}

}
