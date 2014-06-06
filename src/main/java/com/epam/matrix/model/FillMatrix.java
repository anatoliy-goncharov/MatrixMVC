package main.java.com.epam.matrix.model;

/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class FillMatrix {

    public static void fillMatrix(Matrix matrix){
        for (int i = 0; i < matrix.getRowsNum(); i++) {
            for (int j = 0; j < matrix.getColumnsNum(); j++) {

                matrix.setElement(i, j, (int) (Math.random() * 10));
            }
        }
    }
}
