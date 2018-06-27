package package1;

public class SingletonClassuse {

	public static void main(String[] args) {

		SingletonClass obj =  SingletonClass.getinstance();
		obj.sum();
	
		SingletonClass obj1 =  SingletonClass.getinstance();
	    obj1.sum();
	
	}

}
