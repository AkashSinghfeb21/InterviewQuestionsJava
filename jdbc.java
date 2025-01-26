import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "Wrestlemania35";
        String query = "select * from book";

        Connection con = null;
        Statement st = null;

        try {
            // Load driver class
            Class.forName(driverClassName);

            // Obtain a connection
            con = DriverManager.getConnection(url, username, password);

            // Obtain a statement
            st = con.createStatement();

            // Execute the query
            ResultSet rs = st.executeQuery(query);

            // Process the results if needed
            while (rs.next()) {
                // Access columns like rs.getString("column_name")
                System.out.println(rs.getInt(1));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the statement
                if (st != null) {
                    st.close();
                }
                // Close the connection
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
