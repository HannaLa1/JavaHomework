package service;

import entity.Operation;
import repository.DBConnection;
import repository.OperationDAO;

import java.util.List;

public class CalcService {
    private final OperationDAO operationDAO = new OperationDAO();

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    public double doOperation(double num1, double num2, String operation){
        double result = 0;

        switch (operation) {
            case "+" ->
                result = sum(num1, num2);
            case "-" ->
                result = sub(num1, num2);
            case "*" ->
                result = mul(num1, num2);
            case "/" ->
                result = div(num1, num2);
        }

        return result;
    }

    public void insertData(Operation operation, DBConnection data) {
        operationDAO.insertData(operation, data);
    }

    public List<Operation> getData(int userId, DBConnection data) {
        return operationDAO.getData(userId, data);
    }

    public void deleteData(int id, DBConnection data){
        operationDAO.deleteData(id, data);
    }

    public void deleteByUserId(int id, DBConnection data) {
        operationDAO.deleteByUserId(id, data);
    }
}
