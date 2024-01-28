package wgu.dansmithc195project.models;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
/**This model handles appointment getters*/
public class Appointment {
    private Integer appointmentID;
    private String title;
    private String description;
    private String location;
    private String type;
    private Timestamp startDateTime;
    private Timestamp endDateTime;
    private Timestamp createDate;
    private String createdBy;
    private Timestamp lastUpdate;
    private String lastUpdatedBy;
    private Integer customerID;
    private Integer userID;
    private Integer contactID;
    private String contactName;

    /**
     * Appointment constructor
     * @param inputAppointmentID appointment ID (PK)
     * @param inputContactID  contact ID (FK)
     * @param inputContactName name of contact
     * @param inputCreatedBy name of user who created the appointment
     * @param inputCreateDate appointment creation date
     * @param inputCustomerID customer ID (FK)
     * @param inputDescription appointment description
     * @param inputEndDateTime appointment end date and time
     * @param inputLastUpdatedBy last person to update the appointment
     * @param inputLastUpdate time and date of last update
     * @param inputLocation appointment location
     * @param inputStartDateTime Start date and time of appointment
     * @param inputTitle appointment title
     * @param inputType appointment Type
     * @param inputUserID user ID(FK)
     */
    public Appointment(Integer inputAppointmentID, String inputTitle, String inputDescription, String inputLocation,
                       String inputType, Timestamp inputStartDateTime, Timestamp inputEndDateTime,
                       Timestamp inputCreateDate, String inputCreatedBy, Timestamp inputLastUpdate,
                       String inputLastUpdatedBy, Integer inputCustomerID, Integer inputUserID, Integer inputContactID,
                       String inputContactName) {

        appointmentID = inputAppointmentID;
        title = inputTitle;
        description = inputDescription;
        location = inputLocation;
        type = inputType;
        startDateTime = inputStartDateTime;
        endDateTime = inputEndDateTime;
        createDate = inputCreateDate;
        createdBy = inputCreatedBy;
        lastUpdate = inputLastUpdate;
        lastUpdatedBy = inputLastUpdatedBy;
        customerID = inputCustomerID;
        userID = inputUserID;
        contactID = inputContactID;
        contactName = inputContactName;

    }
    /** Appointment ID getter
     * @return ID of the appointment
     */
    public Integer getAppointmentID() {
        return appointmentID;
    }
    /** title getter
     * @return title of the appointment
     */
    public String getTitle() {
        return title;
    }
    /** description getter
     * @return description of appointment
     */
    public String getDescription() {
        return description;
    }

    /** location getter
     * @return location of appointment
     */
    public String getLocation() {
        return location;
    }

    /** type getter
     * @return type of the appointment
     */
    public String getType() {
        return  type;
    }
    /** start date & time getter
     * @return start date & time of appointment
     */
    public Timestamp getStartDateTime() {
        return startDateTime;
    }
    /** end date & time getter
     * @return end datetime of appointment
     */
    public Timestamp getEndDateTime() {
        return endDateTime;
    }
    /** create date & time getter
     * @return create date of appointment
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /** created by getter
     * @return who created appointment
     */
    public String getCreatedBy() {
        return createdBy;
    }
    /** last update getter
     * @return last update date & time of appointment
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /** last updated by getter
     * @return who last updated the appointment
     */
    public String getLastUpdateBy() {
        return lastUpdatedBy;
    }

    /** customer ID getter
     * @return customer ID
     */
    public Integer getCustomerID() {
        return customerID;
    }

    /** user ID getter
     * @return user ID
     */
    public Integer getUserID() {
        return userID;
    }

    /** contact ID getter
     * @return contact ID
     */
    public Integer getContactID() {
        return contactID;
    }

    /** contact name getter
     * @return name of contact
     */
    public String getContactName() {
        return contactName;
    }
}
