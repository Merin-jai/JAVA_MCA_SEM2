import java.sql.*;  
class DBPrepared  {  
	public static void main(String args[])  {  
		try  {  
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mca");  
        PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");  
	stmt.setInt(1,20);//1 specifies the first parameter in the query  
	 	stmt.setString(2,"shiju"); 
		stmt.setInt(3,50);   
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
  		con.close();  
 		}
		catch(Exception e)  {
			 System.out.println(e);
		}  
	}  
}  
