import piazzaDatabase.Connect;

import java.sql.*;
import java.util.*;

public class PiazzaUser extends Connect {
    public String Email;
    public String PassCode;
    public boolean IsInstructor;
    private PreparedStatement userStatment;

    public PiazzaUser(String Email, String PassCode, boolean IsInstructor) {
        connect();
        this.Email = Email;
        this.PassCode = PassCode;
        this.IsInstructor = IsInstructor;
    }

    public void createUser(Connection connect){
        try{
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select Email, PassCode, isInstructor from PiazzaUser where Email=" +Email);
            while(resultSet.next()){
                Email = resultSet.getString("Email");
                PassCode = resultSet.getString("PassCode");
                IsInstructor = resultSet.getBoolean("IsInstructor");
            }

        }
        catch (Exception e){
            System.out.println("database error during select of PiazzaUser="+e);
        }
    }

    public static void main(String[] args) throws SQLException {
        PiazzaUser user1 = new PiazzaUser("kai@mail.com", "hei", false);
        Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/piazza", "oskar", "abc123");
        Statement s = connect.createStatement();
        s.executeUpdate("INSERT INTO PiazzaUser values ('kai@mail.com', 'hei', false)");

    }


}
