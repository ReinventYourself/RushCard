package package1;

import java.io.File;
import java.io.IOException;

public class CheckFileExist {

	public static void main(String[] args) throws IOException {
		
		File f  = new File("C:\\Users\\gaurav.sharma1\\Desktop\\Projects\\gaurav.txt");

		if(f.createNewFile())
		 System.out.println("File Created");
		else 
			System.out.println("file not created");
		
		
		
		if(f.exists() && !f.isDirectory()) 
		 System.out.println("file is existing");
			else 
				System.out.println("Not Exist");
			
		}
		
	}


