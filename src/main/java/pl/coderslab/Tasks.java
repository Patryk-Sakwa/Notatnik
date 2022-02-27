package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static String[][] tasks() {
        String fileName = "tasks.csv";
        Path path = Paths.get(fileName);
        String[] tasks = new String[1];
        if (Files.exists(path)) {
            int row = 0, length = 1;
            File file = new File("tasks.csv");
            try (Scanner scan = new Scanner(file);) {
                while (scan.hasNextLine()) {
                    tasks = Arrays.copyOf(tasks, length);
                    length++;
                    tasks[row] = scan.nextLine();
                    row++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Nie znaleziono pliku");
                System.exit(0);

            }
        } else {
            try {
                Files.createFile(path);
                tasks();
            } catch (IOException e) {
                System.out.println("Nie można tutaj utworzyć pliku");
                System.exit(0);
            }
        }
        int i = 0;
        String[][] result = new String[tasks.length][3];
        for (int j = 0; j < tasks.length; j++) {
            String[] parts = tasks[i].split(", ");
            result[j][0] = parts[0];
            result[j][1] = parts[1];
            result[j][2] = parts[2];
            i++;
        }

        return result;
    }
}
