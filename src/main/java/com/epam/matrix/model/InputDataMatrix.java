package main.java.com.epam.matrix.model;

import main.java.com.epam.matrix.util.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class InputDataMatrix {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int first;
    private int second;
    public int row;
    private int column;
    public int Row(){
        while (true) {
            try {

                if ((first = Integer.parseInt(br.readLine())) > 0) {
                    row = first;
                    break;
                } else {
                    System.out.println(Constants.REPLYROWNUMBER);
                    System.err.println(Constants.MATRIXDATAERROR);
                    continue;
                }
            } catch (IOException e) {
                System.out.println(Constants.REPLYROWNUMBER);
                System.err.println(Constants.MATRIXDATAERROR);
                continue;
            } catch (NumberFormatException e) {
                System.out.println(Constants.REPLYROWNUMBER);
                System.err.println(Constants.MATRIXDATAERROR);
                continue;
            }
        }
        return row;
    }
    public int Column(){
        while (true) {
            try {
                if ((second = Integer.parseInt(br.readLine())) > 0) {
                    column = second;
                    break;
                } else {
                    System.out.println(Constants.REPLYCOLUMNNUMBER);
                    System.err.println(Constants.MATRIXDATAERROR);
                    continue;
                }
            } catch (IOException e) {
                System.out.println(Constants.REPLYCOLUMNNUMBER);
                System.err.println(Constants.MATRIXDATAERROR);
                continue;
            } catch (NumberFormatException e) {
                System.out.println(Constants.REPLYCOLUMNNUMBER);
                System.err.println(Constants.MATRIXDATAERROR);
                continue;
            }
        }
        return column;
    }
}
