package wgu.dansmithc195project.models;

/**This class is for Contacts taken from the ERD. There is no email required anywhere in the requirements,
 * so I left it out of the constructor*/
public class Contact {
    /**customer contact ID*/
    private int contactId;
    /**customer contact name*/
    private String contactName;

    /**This is the Contacts constructor.
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

    /**@param contactId the customer contact ID to set*/
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    /**@return the contactName*/
    public String getContactName() {
        return contactName;
    }

    /**@param contactName the customer contact name to set*/
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
