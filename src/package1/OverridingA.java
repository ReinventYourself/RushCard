package package1;

public class OverridingA {

	public static void main(String[] args) {
	
	
    String s = "ram";
    /*char[] arr = 	s.toCharArray();
	
   for(int i= arr.length-1;i>=0;i--)
   {
   System.out.print(arr[i]);
   }*/
		
	StringBuffer sb  = new StringBuffer(s);
	System.out.println(sb.reverse());
	
	

	
	
}
}