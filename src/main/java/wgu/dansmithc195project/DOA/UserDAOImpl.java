package wgu.dansmithc195project.DOA;

import wgu.dansmithc195project.utils.JDBC;
import wgu.dansmithc195project.models.User;
import wgu.dansmithc195project.models.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

/**This clas is connecting to the users database with SQL queries*/
public class UserDAOImpl {
    public static ObservableList<User> getAllUsers(){
        ObservableList<User> usersList = FXCollections.observableArrayList();
        try {
            String sql = "Select * from users";
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
}
