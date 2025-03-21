package wgu.dansmithc195project.DOA;

import wgu.dansmithc195project.utils.JDBC;
import wgu.dansmithc195project.models.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**This class is connecting to the users database with SQL queries*/
public class UserDAOImpl {
    /**This method gets all users from SQL database
     * @return usersList
     */
    public static ObservableList<User> getAllUsers(){
        ObservableList<User> usersList = FXCollections.observableArrayList();
        try {
            String sql = "SELECT * FROM users";
            PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int userId = resultSet.getInt("User_ID");
                String userName = resultSet.getString("User_Name");
                String password = resultSet.getString("Password");
                User user = new User(userId, userName, password);
                usersList.add(user);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usersList;
    }
    /**This method authenticates the user (checks that password is correct)
     * @return usersList
     * @param inputUsername
     * @param inputPassword
     */
    public static ObservableList<User> authenticateUser(String inputUsername, String inputPassword){
        ObservableList<User> userLogin = FXCollections.observableArrayList();
        try {
            String sql = "SELECT * FROM users WHERE User_Name=? AND Password=?";
            PreparedStatement preparedStatement = JDBC.connection.prepareStatement(sql);
            preparedStatement.setString(1, inputUsername);
            preparedStatement.setString(2, inputPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int userId = resultSet.getInt("User_ID");
                String userName = resultSet.getString("User_Name");
                String password = resultSet.getString("Password");
                User user = new User(userId, userName, password);
                userLogin.add(user);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userLogin;
    }
}
