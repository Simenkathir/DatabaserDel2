import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GucciMain {

    public static void main(String[] args) throws SQLException {
        //her må vi legge til logikk
        Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/piazza", "oskar", "abc123");
        PiazzaUser user1 = new PiazzaUser("Kai@gmail.com", "abc123", false);
        user1.createUser(connect);

    }

}
