package main.java.com.epam.matrix.runner;

import main.java.com.epam.matrix.controller.CalculatorOperations;
import main.java.com.epam.matrix.model.*;
import main.java.com.epam.matrix.util.Constants;
import main.java.com.epam.matrix.view.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * Created by Anatoliy_Goncharov on 10.06.2014.
 */
public class Calculator {
    private static int action = 4;
    public void calc() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            InputDataCalculator idc = new InputDataCalculator();

            System.out.println(Constants.NUMBERONE);
            double first = idc.number();
            System.out.println(Constants.OPERAND);
            String operand = idc.operand();
            System.out.println(Constants.NUMBERTWO);
            double second = idc.number();
            CalculatorOperations operations = new CalculatorOperations();
            double resultAction = 0;
            if (operand.equals("*")) {
                resultAction = operations.mul(first, second);
            } else if (operand.equals("/")) {
                resultAction = operations.dev(first, second);
            } else if (operand.equals("+")) {
                resultAction = operations.sum(first, second);
            } else if (operand.equals("-")) {
                resultAction = operations.sub(first, second);
            }

            if (resultAction - Math.round(resultAction) == 0.0) {
                int result = (int) Math.round(resultAction);
                System.out.println(Constants.RESULTMESSAGE + result + "\n");
            } else {
                System.out.println(Constants.RESULTMESSAGE + resultAction + "\n");
            }

            System.out.println(Constants.CALCULATORREPLY);
            String reply = br.readLine();
            if (reply.equals("Да")) {
                continue;
            } else if (reply.equals("Нет")) {
                System.out.println(Constants.INFOCALCULATOR);
                String outputParam = br.readLine();
                if (outputParam.equals("Да")) {
                    Class clazz = CalculatorOperations.class;
                    getClassModifiers(clazz);
                } else if (outputParam.equals("нет")) {
                    break;
                }
                break;
            }else {
                    System.err.println(Constants.UNCOWNCOMAND);
                    System.err.flush();
                    break;
                }



        }
    }
    public static void getClassModifiers(Class a){
        System.out.println("Class methods:");
        Method[] methods = a.getMethods();
        for (Method method : methods){
            System.out.println(" Method name: " + method.getName());
            System.out.println(" Return type: " + method.getReturnType());
            Class[] paramTypes = method.getParameterTypes();
            System.out.println(" Parameters types: ");
            for (Class paramType : paramTypes){
                System.out.println("  param type: " + paramType.getName());
            }
        }

    }
}