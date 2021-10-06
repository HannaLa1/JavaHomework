import java.sql.*;

public class DAOService implements IDAOService, DBInfo{
    @Override
    public void insertData(Login login) {
        String INSERT_DATA = "INSERT INTO login VALUES(?, ?, ?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA);
            preparedStatement.setString(1, login.getUserId());
            preparedStatement.setString(2, login.getPassword());
            preparedStatement.setString(3, login.getUserName());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Login getData(String userId, String pass) {
        Login login = new Login();
        String SELECT_DATA = "SELECT * FROM login WHERE userId=? AND password=?";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DATA);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, pass);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
              login.setUserId(resultSet.getString(1));
              login.setPassword(resultSet.getString(2));
              login.setUserName(resultSet.getString(3));
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return login;
    }
}
