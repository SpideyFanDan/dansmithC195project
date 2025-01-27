package wgu.dansmithc195project.DOA;

import wgu.dansmithc195project.utils.JDBC;
import wgu.dansmithc195project.models.Appointment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;
import java.time.*;

/**This class is used to access appointment information from the mySQL database Appointments Table*/
public class ApptDAOImpl {
    /**This method gets all appointments from the database
     * @return appointmentsList
     */
    public static ObservableList<Appointment> getAllAppointments(){
        ObservableList<Appointment> appointmentsList = FXCollections.observableArrayList();
        try{
            String sql = "SELECT * from appointments";
            PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int appointmentId = resultSet.getInt("Appointment_ID");
                int contactId = resultSet.getInt("Contact_ID");
                int customerId = resultSet.getInt("Customer_ID");
                int userId = resultSet.getInt("User_ID");
                String title = resultSet.getString("Title");
                String description = resultSet.getString("Description");
                String location = resultSet.getString("Location");
                String type = resultSet.getString("Type");
                LocalDateTime startTime = resultSet.getTimestamp("Start").toLocalDateTime();
                LocalDateTime endTime = resultSet.getTimestamp("End").toLocalDateTime();
                Appointment appointment = new Appointment(appointmentId, title, description, location, type, startTime, endTime, customerId, userId, contactId);
                appointmentsList.add(appointment);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return appointmentsList;
    }

    /**This method adds a new appointment to the database
     * @param title
     * @param description
     * @param location
     * @param contactId
     * @param type
     * @param customerId
     * @param endDateTime
     * @param startDateTime
     * @param userId
     * @return rowsAffected
     */
    public static int addNewAppt(String title, String description, String location, String type, LocalDateTime startDateTime, LocalDateTime endDateTime, int customerId, int userId, int contactId) throws SQLException {
        String sql = "INSERT INTO appointments (Title, Description, Location, Type, Start, End, Customer_ID, User_ID, Contact_ID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2,description);
        preparedStatement.setString(3, location);
        preparedStatement.setString(4, type);
        preparedStatement.setTimestamp(5, Timestamp.valueOf(startDateTime));
        preparedStatement.setTimestamp(6, Timestamp.valueOf(endDateTime));
        preparedStatement.setInt(7, customerId);
        preparedStatement.setInt(8, userId);
        preparedStatement.setInt(9, contactId);
        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected;
    }

    /**This method updates an appointment already in the database
     * @param appointmentId
     * @param contactId
     * @param customerId
     * @param description
     * @param location
     * @param endDateTime
     * @param title
     * @param type
     * @param startDateTime
     * @param userId
     * @return rowsAffected
     */
    public static int updateAppt(int appointmentId, String title, String description, String location, String type, LocalDateTime startDateTime, LocalDateTime endDateTime, int customerId, int userId, int contactId) throws SQLException {
        String sql = "UPDATE appointments Set Title = ?, Description = ?, Location = ?, Type = ?, Start = ?, End = ?, Customer_ID = ?, User_ID = ?, Contact_ID = ? WHERE Appointment_ID = ?";
        PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2,description);
        preparedStatement.setString(3, location);
        preparedStatement.setString(4, type);
        preparedStatement.setTimestamp(5, Timestamp.valueOf(startDateTime));
        preparedStatement.setTimestamp(6, Timestamp.valueOf(endDateTime));
        preparedStatement.setInt(7, customerId);
        preparedStatement.setInt(8, userId);
        preparedStatement.setInt(9, contactId);
        preparedStatement.setInt(10, appointmentId);
        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected;
    }

    /**This method deletes an appointment from the database
     * @param appointmentId
     * @return rowsAffected
     */
    public static int deleteAppt(int appointmentId) throws SQLException {
        String sql = "DELETE FROM appointments WHERE Appointment_ID = ?";
        PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
        preparedStatement.setInt(1, appointmentId);
        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected;
    }

    /**This method gets all appointments by week*/
//    public static ObservableList<Appointment> getApptsByWeek(String week, String year){
//        ObservableList<Appointment> apptsList = FXCollections.observableArrayList();
//        try{
//            String sql = "SELECT * from appointments WHERE start = ?";
//        }
//    }

    /**This method gets all appointments by month*/

    /**This method gets all customers by month and type*/

    /**This method gets all customers by division and country*/

    /**This method determines whether any appointments overlap and deliver error alerts based on how they overlap*/
}
