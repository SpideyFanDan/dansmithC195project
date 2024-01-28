package wgu.dansmithc195project.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

/**This class handles the SQL database connection*/
public class DBConnection {
    /**these variables build the full JDBC URL*/
    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//wgudb.ucertify.com:3306/";
    private static final String dbName = "unknown";
    /**Full JDBC URL*/
    private static final String jdbcURL = protocol + vendorName + ipAddress + dbName;
    /**reference to JDBC driver interface that was imported*/
    private static final String MYSQLJDBCDriver = "com.mysql.jdbc.Driver";
    /**reference to connection interface*/
    //private static Connection conn = null;
    /**database username & password*/
    private static final String username = "unknown";
    private static final String password = "unknown";

}
