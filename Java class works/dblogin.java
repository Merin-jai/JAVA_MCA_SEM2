import java.io.*;
import java.util.*;
import java.sql.*;
class dblogin
{
    public static void main(String args[])
    {
        Connection conn;
        Statement st;
        ResultSet rs;
        String name,pass;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sample", "root", "");
            st=conn.createStatement();
            System.out.println("Enter Username : ");
            name=s.nextLine();
            System.out.println("Enter password : ");
            pass=s.nextLine();
            String str="Select * from login where uname= '";
            str=str+name+"' and password ='"+pass+"'";
            // System.out.println(str);
            rs=st.executeQuery(str);
            if(rs.next())
               System.out.println(" Valid user");
            else
               System.out.println("Invalid user");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}