package wgu.dansmithc195project.models;

import java.time.*;

/**This class handles customer appointments, I left out the create and update attributes because they are not
 * part of the requirements*/
public class Appointment {
    /**The following variables and data types come from the Appointments Table in the ERD*/
    private int appointmentId;
    private String title;
    private String description;
    private String location;
    private String type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int customerId;
    private int userId;
    private int contactId;

    /**This is the constructor for the appointments table including getters and setters for variables above
     * @param appointmentId appointment ID
     * @param title appointment title
     * @param description appointment description
     * @param location appointment location
     * @param type appointment type
     * @param startTime appointment start time
     * @param endTime appointment end time
     * @param customerId customer ID
     * @param userId database user ID
     * @param contactId customer contact ID
     */
    public Appointment(int appointmentId, String title, String description, String location, String type,
                       LocalDateTime startTime, LocalDateTime endTime, int customerId, int userId, int contactId){
        this.appointmentId = appointmentId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.customerId = customerId;
        this.userId = userId;
        this.contactId = contactId;
    }

    /**@return the appointmentId*/
    public int getAppointmentId() {
        return appointmentId;
    }

    /**@param appointmentId the appointment ID setter*/
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    /**@return the title*/
    public String getTitle() {
        return title;
    }

    /**@param title the appointment title setter*/
    public void setTitle(String title) {
        this.title = title;
    }

    /**@return the description*/
    public String getDescription() {
        return description;
    }

    /**@param description the appointment description setter*/
    public void setDescription(String description) {
        this.description = description;
    }

    /**@return the location*/
    public String getLocation() {
        return location;
    }

    /**@param location the appointment location setter*/
    public void setLocation(String location) {
        this.location = location;
    }

    /**@return the type*/
    public String getType() {
        return type;
    }

    /**@param type the appointment type setter*/
    public void setType(String type) {
        this.type = type;
    }

    /**@return the startTime*/
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**@param startTime the appointment (local) start time setter*/
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**@return the endTime*/
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**@param endTime the appointment (local) end time setter*/
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**@return the customerId*/
    public int getCustomerId() {
        return customerId;
    }

    /**@param customerId the customer ID setter*/
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**@return the userId*/
    public int getUserId() {
        return userId;
    }

    /**@param userId the database user ID setter*/
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**@return the contactId*/
    public int getContactId() {
        return contactId;
    }

    /**@param contactId the customer contact ID setter*/
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
}
