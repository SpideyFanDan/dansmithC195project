package wgu.dansmithc195project.models;

/** This class is for the reports of # of appointments by month and type, and # of user login attempts by month */
public class NumApptsReport {
/**these variables are for the # of appointments by month and type*/
    private String month;
    private String type;
    private int apptsCount;

/**This is the reports constructor including the getters and setters*/
public NumApptsReport(String month, String type, int apptsCount){
    this.month = month;
    this.type = type;
    this.apptsCount = apptsCount;
}

    /**@return month*/
    public String getMonth() {return month;}

    /**@param month month setter*/
    public void setMonth(String month) {this.month = month;}

    /**@return type*/
    public String getType() {return type;}

    /**@param type type of appointment setter*/
    public void setType(String type) {this.type = type;}

    /**@return apptsCount*/
    public int getApptsCount() {return apptsCount;}

    /**@param apptsCount # of appointments by date setter*/
    public void setApptsCount(int apptsCount) {this.apptsCount = apptsCount;}
}
