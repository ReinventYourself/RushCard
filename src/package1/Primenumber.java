package package1;

public class Primenumber {

	public static void prime( int num)
	{   int i;
		for(i =2; i<num;i++)
		{
		if(num%i==0)
		{
			System.out.println("number is not prime");
		break;
		}
	}
		if(i ==num)
		System.out.println("Prime numner");
		
}
		
public static void main(String[] args) {
	
  prime(9);

}


}
