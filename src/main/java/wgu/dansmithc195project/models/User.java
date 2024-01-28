package wgu.dansmithc195project.models;

/**This class is for the database users and their login credentials. This is built from the Users table
 * in the ERD*/
public class User {
    /**These variables and data types come directly from the Users table, but does not include the create and update
     * attributes since they are not included in the requirements*/
    private int userId;
    private String userName;
    private String password;

    /**This is the user constructor along with the getters and setters
     * @param userName user name
     * @param userId user ID
     * @param password user password
     */
    public User(int userId, String userName, String password){
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
    /**@return userID*/
    public int getUserId() {return userId;}

    /**@param userId user ID setter*/
    public void setUserId(int userId) {this.userId = userId;}

    /**@param userName user name setter*/
    public void setUserName(String userName) {this.userName = userName;}
    /**@return userName*/
    public String getUserName() {return userName;
    }

    /**@return password*/
    public String getPassword() {return password;}

    /**@param password user password setter*/
    public void setPassword(String password) {this.password = password;}
}
