package wgu.dansmithc195project.utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.*;
public class ApptTime {
    private static ZonedDateTime timeZone;
    private static ObservableList<LocalTime> startTime = FXCollections.observableArrayList();
    private static ObservableList<LocalTime> endTime = FXCollections.observableArrayList();
    /** This method is used to format the start and end time for combo boxes in the appointments section and to
     * manipulate the time so that the combo box only offers time slots during company business hours.
     */
    protected static void apptTimeFormatter(){
        ZonedDateTime startEST = ZonedDateTime.of(LocalDate.now(), LocalTime.of(8,0),ZoneId.of("America/New_York"));
        ZonedDateTime endEST = ZonedDateTime.of(LocalDate.now(), LocalTime.of(22,0),ZoneId.of("America/New_York"));
        ZonedDateTime start = startEST.withZoneSameInstant(ZoneId.systemDefault());
        ZonedDateTime end = endEST.withZoneSameInstant(ZoneId.systemDefault());

        while(start.isBefore(end)){
            startTime.add(start.toLocalTime());
            start = start.plusMinutes(30);
            endTime.add(start.toLocalTime());
        }
    }
    /** This method gets the start time by checking the size of startTime to see if it has any values. If it's 0,
     *  then it uses the apptTimeFormatter method to format the values.
     * @return localTimeStart
     */
    public static ObservableList<LocalTime> getStartTime(){
        if(startTime.size() == 0){
            apptTimeFormatter();
        }
        return startTime;
    }
    /** This method calls gets the end time by checking the size of endTime to see if it has any values. If it's 0,
     * then it calls apptTimeFormatter method to format the values.
     * @return endTime
     * */
    public static ObservableList<LocalTime> getEndTime(){
        if(endTime.size() == 0){
            apptTimeFormatter();
        }
        return endTime;
    }
}
