package wgu.dansmithc195project.models;

/**This class is for Customer built from the ERD. There is no create or update attributes required anywhere in the requirements,
 * so I left them out of the constructor*/

public class Customer {
    /**These variables and data types come directly from the Customers table in the ERD*/
    private int customerId;
    private String customerName;
    private String address;
    private String postalCode;
    private String phone;
    private int divisionId;
    private String division;
    private int countryId;
    private String country;

    /**This is the constructor for the customers table including getters and setters
     * @param customerId customer ID
     * @param customerName customer name
     * @param divisionId division ID
     * @param division division
     * @param countryId country ID
     * @param country country
     * @param address address
     * @param postalCode postal code
     * @param phone phone
     */
    public Customer(int customerId, String customerName, int divisionId, String  division, int countryId, String country,
                    String address, String postalCode, String phone){
        this.customerId = customerId;
        this.customerName = customerName;
        this.divisionId = divisionId;
        this.division = division;
        this.countryId = countryId;
        this.country = country;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
    }
    /**@return customerID*/
    public int getCustomerId(){return customerId;}

    /**@param customerId customer ID setter*/
    public void setCustomerId(int customerId){this.customerId = customerId;}

    /**@return customerName*/
    public String getCustomerName() {return customerName;}

    /**@param customerName customer name setter*/
    public void setCustomerName(String customerName) {this.customerName = customerName;}

    /**@return divisionID*/
    public int getDivisionId(){return divisionId;}

    /**@param divisionId division ID setter*/
    public void setDivisionId(int divisionId){this.divisionId = divisionId;}

    /**@return division*/
    public String getDivision() {return division;}

    /**@param division division setter*/
    public void setDivision(String division) {this.division = division;}

    /**@return countryId*/
    public int getCountryId(){return countryId;}

    /**@param countryId country ID setter*/
    public void setCountryId(int countryId){this.countryId = countryId;}

    /**@return country*/
    public String getCountry() {return country;}

    /**@param country country setter*/
    public void setCountry(String country) {this.country = country;}

    /**@return address*/
    public String getAddress() {return address;}

    /**@param address address setter*/
    public void setAddress(String address) {this.address = address;}

    /**@return postalCode*/
    public String getPostalCode() {return postalCode;}

    /**@param postalCode postal code setter*/
    public void setPostalCode(String postalCode) {this.postalCode = postalCode;}

    /**@return phone*/
    public String getPhone() {return phone;}

    /**@param phone phone setter*/
    public void setPhone(String phone) {this.phone = phone;}
}
