package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class SaveToFileResult {
    public static void save(Matrix first, Matrix second, String filename, int action) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(filename);
        pw.println(Constants.DIMENSIONS + first.getRowsNum() +  " x "  + first.getColumnsNum() + "]\n");
        for (int i = 0; i < first.getRowsNum(); i++) {
            for (int j = 0; j < first.getColumnsNum(); j++) {
                pw.printf("%2d ", first.getElement(i, j));
            }
            pw.println();
            pw.flush();
        }
        String message = null;
        switch (action) {
            case 1:
                message = Constants.TRANSPOSE;break;
            case 2:
                message = Constants.TURNON;break;
            case 3:
                message = Constants.MULTIPLY;break;
        }
        pw.println(message + second.getRowsNum() + " x " + second.getColumnsNum() + "]\n");
        for (int i = 0; i < second.getRowsNum(); i++) {
            for (int j = 0; j < second.getColumnsNum(); j++) {
                pw.printf("%2d ", second.getElement(i, j));
            }
            pw.println();
            pw.flush();
        }
    }

    public static void multiplySave(Matrix first, Matrix second, Matrix result, String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(filename);
        pw.println(Constants.DIMENSIONS + first.getRowsNum() +  " x "  + first.getColumnsNum() + "]\n");
        for (int i = 0; i < first.getRowsNum(); i++) {
            for (int j = 0; j < first.getColumnsNum(); j++) {
                pw.printf("%2d ", first.getElement(i, j));
            }
            pw.println();
            pw.flush();
        }
        pw.println();
        pw.println(Constants.DIMENSIONS + second.getRowsNum() +  " x "  + second.getColumnsNum() + "]\n");
        for (int i = 0; i < second.getRowsNum(); i++) {
            for (int j = 0; j < second.getColumnsNum(); j++) {
                pw.printf("%2d ", second.getElement(i, j));
            }
            pw.println();
            pw.flush();
        }
        pw.println(Constants.MULTIPLY + result.getRowsNum() + " x " + result.getColumnsNum() + "]\n");
        for (int i = 0; i < result.getRowsNum(); i++) {

            for (int j = 0; j < result.getColumnsNum(); j++) {
                pw.printf("%2d ", result.getElement(i, j));
            }
            pw.println();
            pw.flush();
        }
    }
}
