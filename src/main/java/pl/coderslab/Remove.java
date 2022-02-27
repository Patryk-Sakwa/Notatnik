package pl.coderslab;

import java.util.Scanner;

public class Remove {
    public static String[][] remove(String[][] tasks) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which task would you like to remove?");
        int number = scan.nextInt();
        for (int i = number; i < tasks.length - 1; i++) {
            tasks[i][0] = tasks[i + 1][0];
            tasks[i][1] = tasks[i + 1][1];
            tasks[i][2] = tasks[i + 1][2];

        }
        String[][] result = new String[tasks.length - 1][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = tasks[i][j];
            }
        }
        return result;
    }
}
