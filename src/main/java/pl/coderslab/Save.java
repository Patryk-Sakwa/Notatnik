package pl.coderslab;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {
    public static void save(String[][] tasks) {
        Path path = Paths.get("tasks.csv");
        try (FileWriter fileWriter = new FileWriter("tasks.csv", false)) {
            for (int i = 0; i < tasks.length; i++) {
                for (int j = 0; j < tasks[i].length; j++) {
                    if (j < 2) {
                        fileWriter.append(tasks[i][j] + ", ");
                    } else {
                        fileWriter.append(tasks[i][j] + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
