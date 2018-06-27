package package1;

import java.sql.*;  

public class FirstClass {  


public static void main(String[] args) {  

      
     
	   
	String connectionUrl =  "jdbc:sqlserver://SEZ-10\\SQL2014:1433;databaseName=AdventureWorks2012;"
			+ "user=IND-DEL\\Gaurav.Sharma1;"
			//+ "password=P$upport70;"
			+ "integratedSecurity=true";
	
	

//	String connectionUrl =  "jdbc:sqlserver://10.2.6.22:1433;databaseName=Apply;"
//			+ "user=UNIRUSH\\gsharma;"
//			//+ "password=P$upport70;"
//			+ "integratedSecurity=true";
//	
	
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  
      ResultSetMetaData rsmd = null;

      try {  
         // Establish the connection.  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl);  

         // Create and execute an SQL statement that returns some data.  
         String SQL = "SELECT TOP 10 * FROM Person.person order by BusinessEntityID desc";  
         
         //String SQL = "Select top 1 * from apply.dbo.application";
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  
         rsmd = rs.getMetaData();
         int Columnnumber = rsmd.getColumnCount(); 
                  
        while (rs.next()) {  
        	 
        	 for(int i = 1;i<=Columnnumber;i++)
        		 	 {
        		// if(i>1) System.out.print(",");
           
           System.out.print(rs.getString(i) + " " );      
        	 
        		 	 
        		 	 }    
        	 
        	 System.out.println("");
        	 
         
         }
         
      } 
      
      

      // Handle any errors that may have occurred.  
      catch (Exception e) {  
         e.printStackTrace();  
      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
   }  
}  

