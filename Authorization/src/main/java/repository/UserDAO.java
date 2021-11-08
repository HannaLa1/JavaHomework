package repository;

import entity.User;

import java.sql.*;

public class UserDAO {
    public void insertData(User user, DBConnection data) {
        String INSERT_DATA = "INSERT INTO user(login, password, userName) VALUES(?, ?, ?)";

        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getUserName());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getData(String log, String pass, DBConnection data) {
        User user = new User();
        String SELECT_DATA = "SELECT * FROM user WHERE login=? AND password=?";

        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DATA);
            preparedStatement.setString(1, log);
            preparedStatement.setString(2, pass);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                user.setUserId(resultSet.getInt("userId"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setUserName(resultSet.getString("userName"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
