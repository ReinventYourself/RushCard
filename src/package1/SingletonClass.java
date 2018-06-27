package package1;

public class SingletonClass  {

	private static SingletonClass obj = null;
	
	private SingletonClass()
	{
		
	}

	
	public static SingletonClass getinstance()
	{
		if(obj==null)
         obj  = new SingletonClass();
		return obj;
	}
	
	
	public void sum()
	{
		System.out.println("Sum of two number");
		
	}

}
		
		

	

