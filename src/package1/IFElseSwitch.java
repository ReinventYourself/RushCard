package package1;

public class IFElseSwitch {

	public static void main(String[] args) {

		Methodifelse(2);

	}

	
	public static void Methodifelse(int x)
	{
		if(x==1)
			System.out.println("Monday");
		else if(x==2)
		System.out.println("Tuesday");
		else if(x==2)
			System.out.println("Thursday");
		else if (x==3)
			System.out.println("Wednesday");
		
		
  }
	
	
	public static void SwitchMethod(int x)
	{
		
		switch(x)
		{
		
		case 1 :
		System.out.println("Monday");
		//break;
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			

		case 4:
			System.out.println("Thursday");
			break;
			
		default :
			
			System.out.println("Invalid day");
		}
		
		
		
	}
	
	
}
