package package1;

public class StaticClass extends Object {

	public  int n =10;
	
	public void add()
	{
		
		n=n+10;
		System.out.println(n);
	}
	
	public static void main(String[] args) {

		StaticClass s = new StaticClass();

		StaticClass s1 = new StaticClass();
		s.add();
		s1.add();
	}

	

	
	
}
