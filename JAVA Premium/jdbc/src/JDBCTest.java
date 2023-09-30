import java.sql.*;

public class JDBCTest {
    public static void main(String []args) throws SQLException {
        // establish connection
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "Admin@mlc#77";
        Connection con = DriverManager.getConnection(url, user, password);

        // prepare sql statement
        String rawQueryString = "select * from customer where name = ?";
        PreparedStatement ps = con.prepareStatement(rawQueryString);
        ps.setString(1, "dhirendra");

        // execute prepared statement
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2));
            System.out.println();
        }
    }
}