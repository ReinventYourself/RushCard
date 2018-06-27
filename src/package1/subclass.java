package package1;

public class subclass extends AbstractClass {

	@Override
	public void sub(int a, int b) {
		
		int result = a-b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		subclass s = new subclass();
		s.add(20, 30);
		s.sub(20, 10);
	
	}

}
