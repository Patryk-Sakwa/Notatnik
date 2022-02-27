package pl.coderslab;

import static pl.coderslab.Menu.menu;
import static pl.coderslab.Tasks.tasks;


public class Main {

    public static void main(String[] args) {
        String[][] tasks = tasks();
        menu(tasks);
    }










}
