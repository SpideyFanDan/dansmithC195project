package wgu.dansmithc195project.models;

/**This class is for Countries taken from the ERD. I left out create and update attributes because they are not
 * part of the requirements for this project*/

public class Country {
    /**Country ID*/
    private int countryId;
    /**Country name*/
    private String countryName;
    /**This is the Country constructor.
     * @param countryId country ID
     * @param countryName country name
     */
    public Country(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    /**@return the countryId*/
    public int getCountryId() {
        return countryId;
    }

    /**@param countryId the country ID to set*/
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    /**@return the country name*/
    public String getCountryName() {
        return countryName;
    }

    /**@param countryName the country name to set*/
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
