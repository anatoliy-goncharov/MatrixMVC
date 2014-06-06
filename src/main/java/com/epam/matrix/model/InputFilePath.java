package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;

import java.io.*;

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
                PrintWriter pw = new PrintWriter(filename);
                break;
            } catch (FileNotFoundException e) {
                System.err.println("Путь файла введен некорректно");

                continue;

            }


        }
        return filename;
    }
}
