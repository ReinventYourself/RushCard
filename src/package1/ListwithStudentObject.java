package package1;

import java.util.ArrayList;

public class ListwithStudentObject {
	
	int StudentAge;
	String Location;

	public ListwithStudentObject(int studentAge, String location) {
	
	StudentAge = studentAge;
		Location = location;
	}

	@Override
	public String toString() {
		//return "StudentAge=" + StudentAge + " Location=" + Location ;
        return StudentAge + "  "+ Location;
	
		
	}
	
	
	public static void main(String[] args) {
		
		ListwithStudentObject obj  = new ListwithStudentObject(11, "Delhi");

		ListwithStudentObject obj1 = new ListwithStudentObject(12, "Mumbai");
		
	
		ArrayList<ListwithStudentObject>  lst = new ArrayList<ListwithStudentObject>();
		lst.add(obj);
		lst.add(obj1);
		
		for(ListwithStudentObject stu : lst)
		{
			
			System.out.println(stu);
			
		}
		
		
	}
	


}
