package service;

import repository.DBConnection;
import repository.UserDAO;
import entity.User;

import java.util.List;

public class AuthorizationService {
    private final UserDAO userDAO = new UserDAO();

    public void insertData(User user, DBConnection data) {
        userDAO.insertData(user, data);
    }

    public User getData(String log, String pass, DBConnection data) {
        return userDAO.getData(log, pass, data);
    }

    public void deleteData(int id, DBConnection data) {
        userDAO.deleteData(id, data);
    }

    public List<User> getAllUsers(DBConnection data) {
        return userDAO.getAllUsers(data);
    }

    public void update(int id, String password, DBConnection data) {
        userDAO.update(id, password, data);
    }
}
