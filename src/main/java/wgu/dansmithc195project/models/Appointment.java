package wgu.dansmithc195project.models;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
/**This class handles customer appointments, I left out the create and update attributes because they are not
 * part of the requirements*/
public class Appointment {
    /**The following variables and data types come from the Appointments Table in the ERD*/
    private int appointmentId;
    private String title;
    private String description;
    private String location;
    private String type;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int customerId;
    private int userId;
    private int contactId;

    /**This is the appointment constructor
     * @param appointmentId appointment ID
     * @param title appointment title
     * @param description appointment description
     * @param location appointment location
     * @param type appointment type
     * @param startDateTime appointment start date & time
     * @param endDateTime appointment end date & time
     * @param startDate appointment start date
     * @param endDate appointment end date
     * @param startTime appointment start time
     * @param endTime appointment end time
     * @param customerId customer ID
     * @param userId database user ID
     * @param contactId customer contact ID
     */
    public Appointment(int appointmentId, String title, String description, String location, String type,
                       LocalDateTime startDateTime, LocalDateTime endDateTime, LocalDate startDate, LocalDate endDate,
                       LocalTime startTime, LocalTime endTime, int customerId, int userId, int contactId){
        this.appointmentId = appointmentId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.startDate = startDate;
        this.endDate = endDate;
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

    /**@param appointmentId the appointment ID to set*/
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    /**@return the title*/
    public String getTitle() {
        return title;
    }

    /**@param title the appointment title to set*/
    public void setTitle(String title) {
        this.title = title;
    }

    /**@return the description*/
    public String getDescription() {
        return description;
    }

    /**@param description the appointment description to set*/
    public void setDescription(String description) {
        this.description = description;
    }

    /**@return the location*/
    public String getLocation() {
        return location;
    }

    /**@param location the appointment location to set*/
    public void setLocation(String location) {
        this.location = location;
    }

    /**@return the type*/
    public String getType() {
        return type;
    }

    /**@param type the appointment type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**@return the startDateTime*/
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**@param startDateTime the appointment start date and time to set*/
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**@return the endDateTime*/
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    /**@param endDateTime the appointment end date and time to set*/
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**@return the startDate*/
    public LocalDate getStartDate() {
        return startDate;
    }

    /**@param startDate the appointment start date to set*/
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**@return the endDate*/
    public LocalDate getEndDate() {
        return endDate;
    }

    /**@param endDate the appointment end date to set*/
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**@return the startTime*/
    public LocalTime getStartTime() {
        return startTime;
    }

    /**@param startTime the appointment (local) start time to set*/
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    /**@return the endTime*/
    public LocalTime getEndTime() {
        return endTime;
    }

    /**@param endTime the appointment (local) end time to set*/
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    /**@return the customerId*/
    public int getCustomerId() {
        return customerId;
    }

    /**@param customerId the customer ID to set*/
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**@return the userId*/
    public int getUserId() {
        return userId;
    }

    /**@param userId the database user ID to set*/
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**@return the contactId*/
    public int getContactId() {
        return contactId;
    }

    /**@param contactId the customer contact ID to set*/
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
}
