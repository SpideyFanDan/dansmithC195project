package wgu.dansmithc195project.models;

/**This class is for Contacts built from the ERD. There is no email required anywhere in the requirements,
 * so I left it out of the constructor*/
public class Contact {
    /**These variables and data types come directly from the Contacts table in the ERD*/
    private int contactId;
    private String contactName;

    /**This is the Contacts constructor with getters and setters for each variable above.
     * @param contactId customer contact ID
     * @param contactName customer contact name
     */
    public Contact(int contactId, String contactName) {
        this.contactId = contactId;
        this.contactName = contactName;
    }

    /**@return the contactId*/
    public int getContactId() {
        return contactId;
    }

    /**@param contactId the customer contact ID setter*/
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    /**@return the contactName*/
    public String getContactName() {
        return contactName;
    }

    /**@param contactName the customer contact name setter*/
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
