package main.java.com.epam.matrix.runner;

import main.java.com.epam.matrix.util.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Anatoliy_Goncharov on 10.06.2014.
 */
public class DraftCalculator {
    private static int action = 5;

    public void draftCalc() throws IOException {

        double[] doubles = new double[0];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите простейшее выражение с необходимой операцией для двух чисел в формате \"2+2\":");
        while (true) {
            String input = br.readLine().replace(" ", "");
            //char[] chars = input.toCharArray();
            //System.out.println(chars.length);

           String[] expression = input.split("[-,+/*=]");
           String[] operators = input.split("[^-+*/]");


           /* String[] operator = new String[input.length()];
            int j = 0;
            for (int i = 0; i <chars.length ; i++) {
                if (chars[i] == '/'){
                    operator[j] = "/";
                    j++;
                }else if (chars[i] == '*'){
                  operator[j] = "*";
                  j++;
                }else if (chars[i] == '+'){
                    operator[j] = "+";
                    j++;
                }else if (chars[i] == '*'){
                    operator[j] = "-";
                    j++;
                }
            }*/


            if (expression.length == 2) {
                doubles = new double[expression.length];
                for (int i = 0; i < expression.length; i++) {
                    Double number = Double.parseDouble(expression[i]);
                    doubles[i] = number;
                }
                if (operators[1].equals("-")) {
                    double sum = doubles[0] - doubles[1];
                    if (sum - Math.round(sum) == 0.0) {
                        int result = (int) Math.round(sum);
                        System.out.println(Constants.RESULTMESSAGE + result + "\n");
                    } else{
                        System.out.println("Результат: " + sum + "\n");}
                } else if (operators[1].equals("+")) {
                    double sum = doubles[0] + doubles[1];
                    if (sum - Math.round(sum) == 0.0) {
                        int result = (int) Math.round(sum);
                        System.out.println("Результат: " + result + "\n");

                    } else{
                        System.out.println("Результат: " + sum + "\n");}
                } else if (operators[1].equals("*")) {
                    double sum = doubles[0] * doubles[1];
                    if (sum - Math.round(sum) == 0.0) {
                        int result = (int) Math.round(sum);
                        System.out.println("Результат: " + result + "\n");
                    } else{
                        System.out.println("Результат: " + sum + "\n");}
                } else if (operators[1].equals("/")) {
                    double sum = doubles[0] / doubles[1];
                    if (sum - Math.round(sum) == 0.0) {
                        int result = (int) Math.round(sum);
                        System.out.println("Результат: " + result + "\n");
                    } else{
                        System.out.println("Результат: " + sum + "\n");}
                }
                break;
            } else if (expression.length != 2){
                System.err.println("Введено более двух чисел.Попытайтесь снова:");
                continue;
            }
        }
    }
}
