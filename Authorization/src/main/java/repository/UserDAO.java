package repository;

import entity.Operation;
import entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final static String INSERT_DATA = "INSERT INTO user(login, password, userName, role) VALUES(?, ?, ?, ?)";
    private final static String SELECT_DATA = "SELECT * FROM user WHERE login=? AND password=?";
    private final static String SELECT_ALL_USERS = "SELECT * FROM user";
    private final static String DELETE_DATA = "DELETE FROM user WHERE userId = ?";
    private final static String UPDATE = "UPDATE user SET password = ? WHERE userId = ?";

    public void insertData(User user, DBConnection data) {
        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getUserName());
            preparedStatement.setString(4, user.getRole());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getData(String log, String pass, DBConnection data) {
        User user = new User();

        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DATA);
            preparedStatement.setString(1, log);
            preparedStatement.setString(2, pass);

            ResultSet resultSet = preparedStatement.executeQuery();

            initializeFieldsOfUser(resultSet, user);

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void deleteData(int id, DBConnection data) {
        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DATA);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers(DBConnection data) {
        List<User> users = new ArrayList<>();

        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);

            ResultSet resultSet = preparedStatement.executeQuery();

            initializeFieldsOfUsers(resultSet, users);

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public void update(int id, String password, DBConnection data) {
        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, password);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initializeFieldsOfUser(ResultSet resultSet, User user) throws SQLException {
        while (resultSet.next()){
            user.setId(resultSet.getInt("userId"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.setUserName(resultSet.getString("userName"));
            user.setRole(resultSet.getString("role"));
        }
    }

    private void initializeFieldsOfUsers(ResultSet resultSet, List<User> users) throws SQLException {
        while (resultSet.next()){
            User user = new User();

            user.setId(resultSet.getInt("userId"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.setUserName(resultSet.getString("userName"));
            user.setRole(resultSet.getString("role"));

            users.add(user);
        }
    }
}
