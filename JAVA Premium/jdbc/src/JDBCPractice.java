import java.sql.*;
public class JDBCPractice {
    public static void main(String [] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "Admin@mlc#77";
        Connection con = DriverManager.getConnection(url, username, password);

        String query = "select * from customer where id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, 3);
        ResultSet result = ps.executeQuery();

        while(result.next()) {
            int id = result.getInt(1);
            String name = result.getString(2);
            System.out.println("id = " + id + " name = " + name);
        }
    }
}
