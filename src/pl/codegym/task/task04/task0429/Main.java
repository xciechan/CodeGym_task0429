package pl.codegym.task.task04.task0429;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-24

 The application checks number of positive and negative numbers.
 Entered numbers: 3
 */

public class Main {
    public static void main(String[] args) throws IOException {
        printSolution();
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static boolean isPositive (int number){
        return number > 0 ? true : false;
    }

    public static boolean isNegative (int number){
        return number < 0 ? true : false;
    }

    public static void printSolution () throws IOException {
        int numberOfNegativeNumbers = 0;
        int numberOfPositiveNumbers = 0;
        int number = 0;

        for (int i = 0; i < 3; i++) {
            number = readNumber();
            if (isNegative(number)) {
                numberOfNegativeNumbers++;
            }
            if (isPositive(number)) {
                numberOfPositiveNumbers++;
            }
        }

        System.out.println("Liczba liczb ujemnych: " + numberOfNegativeNumbers);
        System.out.println("Liczba liczb dodatnich: " + numberOfPositiveNumbers);
    }
}