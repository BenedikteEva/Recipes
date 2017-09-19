package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    private Connection con;
    private static DB instance;
    private static PreparedStatement stmt;
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "138.197.181.3";
    private static String USER = "henriksen";
    private static String PASSWORD = "tryl";

//    Til Thomas løsning
    private static Connection conn = null;

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);  // The connection will be released upon program 

        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }

        return con;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    } 
//     public static Connection getConnection() {
//        if (conn == null) {
//            try { 
//                Class.forName(DRIVER);
//                conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
//            } catch (SQLException ex) {
//                //se hele sekvenst til det gik galt. Dette kan skrives til logfil. 
//                ex.printStackTrace();
//            } 
//        } 
//        return conn;
//    } 
// 
//    public static void main(String[] args) {
//        //Test connection 
//        try { 
//            String sql = "SELECT * FROM recipe where id=1";
//            ResultSet rs = getConnection().prepareStatement(sql).executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString("FirstName")+" has no: "+rs.getString("phone.number"));
//            } 
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } 
//    } 
//    private Connection connection = null;
//    private static final String IP = "138.197.181.3"
//            + "";
//    private static final String PORT = "3306";
//    private static final String DATABASE = "part1";
//    private static final String USERNAME = "henriksen"; //lokal"root";
//    private static final String PASSWORD = "tryl"; //lokal"tauranbo2";      	
//
//    public DB() throws Exception {
//        Class.forName("com.mysql.jdbc.Driver").newInstance();
//        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
//        this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
//    }
//
//    public Connection getConnection() {
//        return this.connection;
//    }
//
//    public void close() {
//        try {
//            connection.close();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
