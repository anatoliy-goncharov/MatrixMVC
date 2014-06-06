package main.java.com.epam.matrix.model;

/**
 * Created by Anatoliy_Goncharov on 04.06.2014.
 */
public class Matrix {
    private final int[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        return matrix[row][column];
    }

    public int getRowsNum() {
        return matrix.length;
    }

    public int getColumnsNum() {
        return matrix[0].length;
    }

}
