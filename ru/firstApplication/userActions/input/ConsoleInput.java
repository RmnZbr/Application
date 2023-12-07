package ru.firstApplication.userActions.input;

import java.util.Scanner;

public class ConsoleInput implements UserInput {

    private final Scanner scanner = new Scanner(System.in);

    public String acceptUserInput() {
        return scanner.nextLine();
    }
}
