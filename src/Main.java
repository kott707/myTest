import java.util.Scanner;

/*
Задача используя готовый код из задачи 3, вывести в константы "==" + "||", а также переменную scanner, упростив код
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = requireInt( "Enter rectangle's length: ");
        int width = requireInt( "Enter rectangle's width: ");
        scanner.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    final static String horizon = "==";
    final static String vertical = "||";
    final static Scanner scanner = new Scanner(System.in);



    static int requireInt( String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = " ";

        for (int i = 0; i < length; i++) {
            horizontalLine += horizon;
        }

        horizontalLine += " \n";

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = vertical;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += "  ";
        }

        verticalLinesUnit += (vertical+"\n");
        return verticalLinesUnit;
    }
}
