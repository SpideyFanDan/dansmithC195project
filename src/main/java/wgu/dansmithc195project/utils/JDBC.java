package wgu.dansmithc195project.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

/**This class handles the SQL database connection*/
public abstract class JDBC {
    /**these variables build the full JDBC URL*/
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//localhost/";
    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone = SERVER"; // LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
    private static String password = "Passw0rd!"; // Password
    public static Connection connection = null;  // Connection Interface

    public static Connection openConnection()
    {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
            System.out.println("Connection successful!");
        }
        catch(SQLException e) {
            //System.out.println("Error:" + e.getMessage());
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection(){
        return connection;
    }

    public static Connection closeConnection() {
        try {
            connection.close();
            }
        catch(Exception e)
        {
            //do nothing
        }
        return connection;
    }

//    public static Connection openConnection() {
//        try {
//            Class.forName(driver); // Locate Driver
//            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
//            System.out.println("Connection successful!");
//        }
//        catch(SQLException e) {
//            //System.out.println("Error:" + e.getMessage());
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e){
//            //System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        return connection;
//    }
//
//    public static Connection getConnection(){
//        return connection;
//    }
//    public static Connection closeConnection() {
//        try {
//            connection.close();
//        }
//        catch(Exception e)
//        {
//            //do nothing
//        }
//        return connection;
//    }

}
