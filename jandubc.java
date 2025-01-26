import java.sql.*;

public class jandubc{

       public static void main(String[]args)throws Exception{
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                                                    "root","Wrestlemania35");
       Statement st = con.createStatement();

       ResultSet rs = st.executeQuery("select * from book");

       while(rs.next()){
        System.out.println("rs.getInt(1)");
       }  

       con.close();
  }
}