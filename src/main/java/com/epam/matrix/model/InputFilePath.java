package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anatoliy_Goncharov on 06.06.2014.
 */
public class InputFilePath {
    public static String filePath() throws IOException {
        String filename = null;
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(Constants.FILEPATH);
                filename = br.readLine();


            } catch (FileNotFoundException e) {
                System.err.println("Путь файла введен некорректно");
                continue;
            }
            return filename;
        }
    }
}
