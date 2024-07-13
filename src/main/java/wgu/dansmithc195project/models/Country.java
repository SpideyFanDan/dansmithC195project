package wgu.dansmithc195project.models;

/**This class is for Countries built from the ERD. I left out create and update attributes because they are not
 * part of the requirements for this project*/

public class Country {
    /**These variables and data types come directly from the Countries tables in the ERD*/
    private int countryId;
    private String country;

    /**This is the Country constructor with setters and getters for the variables above.
     * @param countryId country ID
     * @param country country
     */
    public Country(int countryId, String country) {
        this.countryId = countryId;
        this.country = country;
    }

    /**@return the countryId*/
    public int getCountryId() { return countryId; }

    /**@param countryId the country ID setter*/
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    /**@return the name of the country*/
    public String getCountry() {
        return country;
    }

    /**@param country the country name setter*/
    public void setCountry(String country) {
        this.country = country;
    }
}
