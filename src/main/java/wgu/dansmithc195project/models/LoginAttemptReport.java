package wgu.dansmithc195project.models;

/** This class is for the reports of # of appointments by month and type, and # of user login attempts by month */
public class LoginAttemptReport {
/**these variables are for the # of user login attempts by date*/
    private String userName;
    private String date;
    private int numLoginAttempts;

/**This is the reports constructor including the getters and setters*/
public LoginAttemptReport(String userName, String date, int numLoginAttempts){
    this.userName = userName;
    this.date = date;
    this.numLoginAttempts = numLoginAttempts;
}

    /**@return userName*/
    public String getUserName() {return userName;}
    /**@param userName username setter*/
    public void setUserName(String userName) {this.userName = userName;}

    /**@return date*/
    public String getDate() {return date;}

    /**@param date date setter*/
    public void setDate(String date) {this.date = date;}
    /**@return numLoginAttempts*/
    public int getNumLoginAttempts() {return numLoginAttempts;}

    /**@param numLoginAttempts # of login attempts setter*/
    public void setNumLoginAttempts(int numLoginAttempts) {this.numLoginAttempts = numLoginAttempts;}
}
