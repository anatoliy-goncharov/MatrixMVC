package main.java.com.epam.matrix.view;

import main.java.com.epam.matrix.util.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class Print {

    //Метод вывода на консоль Меню приложения
    public static void beginer(){
        System.out.println(Constants.BEGIN);
    }

    /* Метод вывода на консоль содержимого файла,
     * если значения количества строк и чисел в строке <= 100,
     * иначе сохранение только в файл
     */
    public static void resultView(int row, int column, String filename) throws FileNotFoundException {
        if (row <= 100 && column <= 100) {
            Scanner sc = new Scanner(new FileInputStream(filename));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println(Constants.SAVEINFO + filename);
            sc.close();
        } else {
            System.out.println(Constants.ONLYSAVEINFO + filename);
        }
    }
}
