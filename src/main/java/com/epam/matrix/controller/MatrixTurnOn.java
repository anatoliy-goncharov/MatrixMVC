package main.java.com.epam.matrix.controller;

import main.java.com.epam.matrix.model.*;
import main.java.com.epam.matrix.util.Constants;
import main.java.com.epam.matrix.view.Print;
import java.io.*;

/**
 * Created by Anatoliy_Goncharov on 03.06.2014.
 */
public class MatrixTurnOn {
    public MatrixTurnOn() throws FileNotFoundException {}
    private static int action = 2;
    public void action() throws IOException {

        InputFilePath inputFilePath = new InputFilePath();
        String filename = inputFilePath.filePath();
        InputDataMatrix idm = new InputDataMatrix();

        System.out.println(Constants.ROWNUMBER);
        int row = idm.Row();
        System.out.println(Constants.COLUMNNUMBER);
        int column = idm.Column();

        try {
            Matrix test2 = new Matrix(row, column);
            FillMatrix.fillMatrix(test2);
            Matrix test4 = new Matrix(column, row);
            for (int i = 0; i < test4.getRowsNum(); ++i) {
                for (int j = 0; j < test4.getColumnsNum(); ++j) {

                    test4.setElement(i, j, test2.getElement(row - 1 - j, i));
                }
            }
            SaveToFileResult.save(test2, test4, filename, action);
            Print.resultView(row, column, filename);

        }catch (OutOfMemoryError e){
            System.out.println(Constants.OUTOFMEMORY);
        }
    }
}