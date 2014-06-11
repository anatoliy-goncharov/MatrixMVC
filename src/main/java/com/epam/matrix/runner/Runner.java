package main.java.com.epam.matrix.runner;


import main.java.com.epam.matrix.controller.MatrixTurnOn;
import main.java.com.epam.matrix.controller.TransposeMatrix;
import main.java.com.epam.matrix.controller.Multiply;
import main.java.com.epam.matrix.util.Constants;
import main.java.com.epam.matrix.view.Print;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anatoliy_Goncharov on 04.06.2014.
 */

public class Runner {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int action;

        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Print.beginer();
            while (true) {
                try {
                    action = Integer.parseInt(br.readLine());
                    if (action <= Constants.MAXACTIONS && action > 0)
                    break;
                    else{
                        System.err.println(Constants.NOACTIONS + " " + Constants.REPLY);
                        System.err.flush();
                        continue;
                    }
                }catch (NumberFormatException e) {
                    System.err.println(Constants.MATRIXDATAERROR + " " + Constants.REPLY);
                    System.err.flush();
                    continue;
                }
            }
            if (action == 1) {
                TransposeMatrix transposeMatrix = new TransposeMatrix();
                transposeMatrix.action();
                continue;
            } else if (action == 2) {
                MatrixTurnOn matrixTurnOn = new MatrixTurnOn();
                matrixTurnOn.action();
                continue;
            } else if (action == 3){
                Multiply multiply = new Multiply();
                multiply.multiply();
                continue;
            } else if (action ==4){
                Calculator сalculator = new Calculator();
                сalculator.calc();
                continue;
            } else if (action ==5){
                DraftCalculator draftCalculator = new DraftCalculator();
                draftCalculator.draftCalc();
                continue;
            } else if (action == 6){
                break;
            }
        }
    }
}
