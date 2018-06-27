package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class BaseClass {
	
	static int a;	
	int b;
	public static void main(String[] args) {
	
		BaseClass obj = new BaseClass();
		BaseClass obj1 = new BaseClass();
		obj.a = 50;
		obj1.a=60;
		
		obj.b = 20;
		obj1.b = 50;
			System.out.println(obj.a);
		System.out.println(obj1.a);

		System.out.println(obj.b);
		System.out.println(obj1.b);
	}
	
}