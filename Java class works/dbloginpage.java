import java.io.*;
import java.util.*;
import java.sql.*;
class dbloginpage
{
    public static void main(String args[])
    {
        int ch=0;
        Connection conn;
        Statement st;
        ResultSet rs;
        String name,pass;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sample", "root", "");
            st=conn.createStatement();
            while(ch!=3)
            {
                System.out.println("\t1.Login\n\t2.Register\n\t3.Exit");
                System.out.println("Enter your choice ");
                ch=s.nextInt();
                switch(ch)
                {
                   case 1 :  System.out.println("Enter Username : ");
                             s.nextLine();
                             name=s.nextLine();
                             System.out.println("Enter password : ");
                              pass=s.nextLine();
                             String str="Select * from login where uname= '";
                             str=str+name+"' and password ='"+pass+"'";
                             // System.out.println(str);
                             rs=st.executeQuery(str);
                             if(rs.next())
                             {
                                System.out.println(" WELCOME");
                                System.out.println("1. Change Password");
                                System.out.println("2.Logout");
                                System.out.println("Enter your choice ");
                                int c=s.nextInt();
                                String opass,npass,cpass;
                                switch(c)
                                {
                                    case 1 : System.out.println("Old password : ");
                                              opass=s.nextLine();
                                             System.out.println("New password : ");
                                             npass=s.nextLine();
                                             System.out.println("New password : ");
                                             cpass=s.nextLine();
                                             if(opass.equals(pass)&&npass.equals(cpass))
                                             {
                                                 str = "update login set password='";
                                                str = str + name +" where uname=" + name;
                                                System.out.println(str);
                                                st.executeUpdate(str);
                                             }
                                             
                                    case 2 : break;
                                }
                             }
                             else
                                System.out.println("Invalid username or password");break;
                             case 2 :
                             case 3 : System.exit(0);
                }
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}