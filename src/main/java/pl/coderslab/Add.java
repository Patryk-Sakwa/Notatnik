package pl.coderslab;

import java.util.Scanner;

public class Add {
    public static String[][] add(String[][] tasks) {
        Scanner scan = new Scanner(System.in);
        String[] add = new String[(tasks.length * 3) + 3];
        System.out.println("Please add task description");
        add[add.length - 3] = scan.nextLine();
        System.out.println("Please add task due date");
        add[add.length - 2] = scan.nextLine();
        System.out.println("Is your task important? True / False");
        add[add.length - 1] = scan.nextLine();

        int number = 0;
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length; j++) {
                add[number] = tasks[i][j];
                number++;
            }
        }
        number = 0;
        String[][] result = new String[tasks.length + 1][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add[number];
                number++;
            }
        }

        return result;
    }
}
