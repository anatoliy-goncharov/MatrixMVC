package main.java.com.epam.matrix.util;

/**
 * Created by Anatoliy_Goncharov on 05.06.2014.
 */
public class Constants {

    public static final String BEGIN = "Выберите операцию над матрицей:\n\n" + "1 - Транспонирование матрицы\n" + "2 - Поворот матрицы на 90° по часовой стрелке\n" +
            "3 - Перемножить две матрицы\n" + "4 - Завершить выполнение программы\n\n" + "Введите номер операции: ";
    public static final String FILEPATH = "Введите путь текстового файла,\nдля сохранения результатов в следующем\nформате: d:/test.txt:";
    public static final String ROWNUMBER = "Введите целое число количества строк:";
    public static final String REPLYROWNUMBER = "Введите Повтороно целое число количества строк:";
    public static final String ROWWARNING = "ВНИМАНИЕ!!! Количество строк второй матрицы должно равняться количеству чисел в строке первой матрицы.\n" + "В связи с этим предыдущее введенное значение установлено для количества строк второй таблицы!";
    public static final String COLUMNNUMBER = "Введите количество столбцов:";
    public static final String REPLYCOLUMNNUMBER = "Введите повторно количество столбцов:";
    public static final String COLUMNNUMBERSECOND = "Введите количество столбцов для второй матрицы:";
    public static final String OUTOFMEMORY = "ВЫ ИЗДЕВАЕТЕСЬ???? Я отказываюсь работать с такой большой цифрой :-P";
    public  static  final String TRANSPOSE = "\nMatrix transpose: [";
    public  static  final String TURNON = "\nMatrix turn on 90°: [";
    public  static  final String MULTIPLY = "\nMatrix multiply: [";
    public  static  final String DIMENSIONS = "Matrix dimensions: [";
    public static final String SAVEINFO = "\nТакже результат сохранен в файл ";
    public static final String ONLYSAVEINFO = "Операция завершена. Из-за большого размера матрицы, результат сохранен в файл ";
    public static final String MATRIXDATAERROR = "Значение должно быть больше нуля и целым числом.";
    public static final Integer MAXACTIONS = 4;
    public static final String NOACTIONS = "Такое действие отсутствует.";
    public static final String REPLY = "Попытайтесь снова:";

}
