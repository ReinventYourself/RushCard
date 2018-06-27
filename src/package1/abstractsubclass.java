package package1;

public class abstractsubclass extends AbstractClass {

	public static void main(String[] args) {

		abstractsubclass sb = new abstractsubclass();
sb.add(25, 10);sb.sub(40, 25);
		
	}

	@Override
	public void sub(int a, int b) {
		
 int result = a-b;
 
 System.out.println(result);
	
	}


	


}
