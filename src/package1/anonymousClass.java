package package1;

interface age
{
	int x = 20;
	void getage();
}


public class anonymousClass {

	public static void main(String[] args) {

		age obj  = new age(){
			
			@Override
			public void getage()
			{
				
				
				System.out.println("Age = " + x);
			}
			
				};
				
			obj.getage();	
				
			
	}
		
		
}


