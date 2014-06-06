package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;

import java.io.*;

/**
 * Created by Anatoliy_Goncharov on 06.06.2014.
 */
public class InputFilePath {
    public static String filePath() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Constants.FILEPATH);
        String filename = br.readLine();
        return filename;
    }
}
