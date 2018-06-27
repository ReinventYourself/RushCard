package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		File	file = new File("C:\\Users\\gaurav.sharma1\\Desktop\\test.txt");
	    FileReader reader = new FileReader(file);
	    BufferedReader bufferreader = new BufferedReader(reader) ;
	    String line;
	    while(( line = bufferreader.readLine())!=null)
		   {
		   System.out.println(line);
		  
	       }
	    
	       bufferreader.close(); 
	   
	  }

}
