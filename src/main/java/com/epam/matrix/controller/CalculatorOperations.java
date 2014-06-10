package main.java.com.epam.matrix.controller;

/**
 * Created by Anatoliy_Goncharov on 10.06.2014.
 */
public class CalculatorOperations {
    public static double result;
    public double mul(double first, double second, String operand){
        result = first * second;
        return result;
    }
    public double dev(double first, double second, String operand){
        result = first / second;
        return result;
    }
    public double sum(double first, double second, String operand){
        result = first + second;
        return result;
    }
    public double sub(double first, double second, String operand){
        result = first - second;
        return result;
    }
}
