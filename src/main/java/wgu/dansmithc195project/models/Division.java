package wgu.dansmithc195project.models;

/**This class is for first-level divisions built from the First-Level Divisions table in the ERD*/
public class Division {
    /**These are the variables and data types for each of the attributes in the first-level divisions table, but
     * there is no create or update attributes since the requirements do not need them*/
    private int divisionId;
    private String division;
    private int countryId;
    private String country;

    /**This is the divisions constructor including getters and setters
     * @param divisionId first-level division ID
     * @param division first-level division
     * @param countryId counrtry ID
     * @param country country
     */
    public Division(int divisionId, String division, int countryId, String country){
        this.divisionId = divisionId;
        this.division = division;
        this.countryId = countryId;
        this.country = country;
    }

    /**@return divisionId*/
    public int getDivisionId() {return divisionId;}

    /**@param divisionId first-level division ID setter*/
    public void setDivisionId(int divisionId) {this.divisionId = divisionId;}

    /**@return division*/
    public String getDivision() {return division;}

    /**@param division division setter*/
    public void setDivision(String division) {this.division = division;}

    /**@return countryId*/
    public int getCountryId() {return countryId;}

    /**@param countryId country ID setter*/
    public void setCountryId(int countryId) {this.countryId = countryId;}

    /**@return country*/
    public String getCountry() {return country;}

    /**@param country country setter*/
    public void setCountry(String country) {this.country = country;}
}
