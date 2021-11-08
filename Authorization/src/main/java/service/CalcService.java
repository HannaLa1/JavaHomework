package service;

public class CalcService {
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
}
