package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anatoliy_Goncharov on 10.06.2014.
 */
public class InputDataCalculator {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static double number;
    public static String operator;

    public double number() {
        while (true) {
            try {
                number = Double.parseDouble(br.readLine());
                break;
            } catch (IOException e) {
                System.err.flush();
                continue;
            } catch (NumberFormatException e) {
                System.err.println(Constants.NUMBERERROR);
                System.err.flush();
                System.out.println(Constants.REPLY);
                continue;
            }
        }
        return number;
    }

    public String operand() throws IOException {
        while (true) {

            operator = br.readLine();
            if (operator.equals("*") || operator.equals("/") || operator.equals("+") || operator.equals("-")) {
                break;
            } else {
                System.err.println(Constants.OPERANDERROR);
                System.err.flush();
                System.out.println(Constants.REPLY);
                continue;
            }
        }
        return operator;
    }
}
