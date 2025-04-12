/*
create table usertb(id number(10), name varchar2(200));


create or replace procedure usrinsert  (id IN NUMBER,  name IN VARCHAR2)  
is  
begin  
	insert into usertb values(id,name);  
end;  
/ 

*/

import java.sql.*;
import java.util.Scanner;  
public class procedure
{  
	public static void main(String[] args) throws Exception
	{   
        int id;String n;
  		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mca");  
  		CallableStatement stmt=con.prepareCall("{call usrinsert(?,?)}");  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id");
        id=s.nextInt();
        System.out.println("Enter name");s.nextLine();
        n=s.nextLine();
		stmt.setInt(1,id);  
		stmt.setString(2,n);  
		stmt.execute();  
  		System.out.println("success");  
	}  
}  
