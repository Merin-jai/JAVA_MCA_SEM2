import java.io.*;
import java.util.*;
import java.sql.*;
class dbi 
{
    public static void main(String args[])
    {
        Connection conn;
        Statement st;
        int no; 
        String name;
        float sal;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sample", "root", "");
            st=conn.createStatement();
            System.out.println("Enter no name and salary");
            no=s.nextInt();s.nextLine();
            name=s.nextLine();
            sal=s.nextFloat();
            String str="insert into emp values(";
            str=str+ no +",'";
            str=str+ name+"',";
            str=str+sal+")";
            System.out.println(str);
            st.executeUpdate(str);
            System.out.println("one record inserted");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}