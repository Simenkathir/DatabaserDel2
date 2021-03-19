package piazzaDatabase;


import java.sql.*;
import java.util.*;

    public class test extends Connect {
        private int brikkeNr;
        private static final int INGEN_BRIKKE = -1;
        private PreparedStatement regStatement;

        public test() {
            brikkeNr = INGEN_BRIKKE;
        }

        public void startReg(int brikkeNr) {
            this.brikkeNr = brikkeNr;
            try {
                regStatement = connect.prepareStatement("INSERT INTO Reg VALUES ( (?), (?), (?), (?))");
            } catch (Exception e) {
                System.out.println("db error during prepare of insert into Reg");
            }
        }

        public void regPost(int sekvNr, int postNr, int tid) {

        }
    }