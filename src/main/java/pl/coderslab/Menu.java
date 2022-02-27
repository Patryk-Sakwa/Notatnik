package pl.coderslab;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pl.coderslab.Add.add;
import static pl.coderslab.Remove.remove;
import static pl.coderslab.Save.save;

public class Menu {
    public static String[][] menu(String[][] tasks) {
        System.out.println(ConsoleColors.BLUE + "Please select an option");
        System.out.println(ConsoleColors.RESET + "1. add\n2. remove\n3. list\n4. exit");
        int choice = 5;
        Scanner scan = new Scanner(System.in);
        while (choice <= 0 || choice > 4) {
            System.out.println("Provide a number from 0 to 4");
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The input is incorrect");
                menu(tasks);
            }
        }
        switch (choice) {
            case 1:
                menu(add(tasks));
                break;
            case 2:
                menu(remove(tasks));
                break;
            case 3:
                int number = 0;
                for (int i = 0; i < tasks.length; i++) {
                    System.out.println(number + " : " + tasks[i][0] + " " + tasks[i][1] + " " + tasks[i][2]);
                    number++;
                }
                menu(tasks);
                break;
            case 4:
                System.out.println(ConsoleColors.RED + "Bye,bye...");
                save(tasks);
                break;
        }
        return tasks;
    }
}
