package service;

import repository.DBConnection;
import repository.UserDAO;
import entity.User;

public class AuthorizationService {
    private final UserDAO userDAO = new UserDAO();

    public void insertData(User user, DBConnection data) {
        userDAO.insertData(user, data);
    }

    public User getData(String log, String pass, DBConnection data) {
        return userDAO.getData(log, pass, data);
    }
}
