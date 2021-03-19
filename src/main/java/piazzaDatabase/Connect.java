package piazzaDatabase;

import java.sql.*;
import java.util.Properties;

public abstract class Connect {
    protected Connection connect;
    public Connect() {

    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Properties for user and password.
            Properties p = new Properties();
            p.put("email", "myemail");
            p.put("passcode", "mypasscode");
            //            conn = DriverManager.getConnection("jdbc:mysql://mysql.ansatt.ntnu.no/sveinbra_ektdb?autoReconnect=true&useSSL=false",p);
            Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/piazza", "oskar", "abc123");
        } catch (Exception exc) {
            throw new RuntimeException("Unable to connect");
        }
    }
}
