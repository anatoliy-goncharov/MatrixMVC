package main.java.com.epam.matrix.controller;

import main.java.com.epam.matrix.model.*;
import main.java.com.epam.matrix.util.Constants;
import main.java.com.epam.matrix.view.Print;

import java.io.IOException;


/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class Multiply {
    private static int action = 3;

    public static void multiply() throws IOException {
        InputFilePath inputFilePath = new InputFilePath();
        String filename = inputFilePath.filePath();
        InputDataMatrix idm = new InputDataMatrix();

        System.out.println(Constants.ROWNUMBER);
        int rowFirst = idm.Row();
        System.out.println(Constants.COLUMNNUMBER);
        int columnFirst = idm.Column();

        System.err.println(Constants.ROWWARNING);
        System.err.flush();
        int rowSecond = columnFirst;
        System.out.println(Constants.COLUMNNUMBERSECOND);

        int columnSecond = idm.Column();

        Matrix first = new Matrix(rowFirst, columnFirst);
        FillMatrix.fillMatrix(first);
        Matrix second = new Matrix(rowSecond, columnSecond);
        FillMatrix.fillMatrix(second);
        Matrix result = new Matrix(rowFirst, columnSecond);

        for (int thisRow = 0; thisRow < rowFirst; ++thisRow) {
            for (int otherCol = 0; otherCol < columnSecond; ++otherCol) {
                int sum = 0;
                for (int thisCol = 0; thisCol < columnFirst; ++thisCol) {
                    sum += first.getElement(thisRow, thisCol) * second.getElement(thisCol, otherCol);
                }
                result.setElement(thisRow, otherCol, sum);
            }
        }
        SaveToFileResult.multiplySave(first, second, result, filename);
        Print.resultView(rowFirst, columnSecond, filename);
    }
}
