package repository;

import entity.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperationDAO {
    private final static String INSERT_DATA = "INSERT INTO operation(userId, num1, operation, num2, result) VALUES(?, ?, ?, ?, ?)";
    private final static String SELECT_DATA = "SELECT * FROM operation WHERE userId=?";
    private final static String DELETE_DATA = "DELETE FROM operation WHERE operationId = ?";
    private final static String DELETE_BY_USER_ID = "DELETE FROM operation WHERE userId = ?";

    public void insertData(Operation operation, DBConnection data) {
        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA);
            preparedStatement.setInt(1, operation.getUserId());
            preparedStatement.setDouble(2, operation.getNum1());
            preparedStatement.setString(3, operation.getTypeOfOperation());
            preparedStatement.setDouble(4, operation.getNum2());
            preparedStatement.setDouble(5, operation.getResult());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Operation> getData(int userId, DBConnection data) {
        List<Operation> operationList = new ArrayList<>();

        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DATA);
            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            initializeFieldsOfOperation(resultSet, operationList);

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return operationList;
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

    public void deleteByUserId(int id, DBConnection data) {
        try {
            Connection connection = data.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_USER_ID);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initializeFieldsOfOperation(ResultSet resultSet,  List<Operation> operationList) throws SQLException {
        while (resultSet.next()){
            Operation operation = new Operation();

            operation.setId(resultSet.getInt("operationId"));
            operation.setUserId(resultSet.getInt("userId"));
            operation.setNum1(resultSet.getDouble("num1"));
            operation.setTypeOfOperation(resultSet.getString("operation"));
            operation.setNum2(resultSet.getDouble("num2"));
            operation.setResult(resultSet.getDouble("result"));

            operationList.add(operation);
        }
    }
}
