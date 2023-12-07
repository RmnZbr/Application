package ru.firstApplication.userActions.input.parsingUserInput;

public class ParsingUserInput {

    private String command;
    private String argument;

    public ParsingUserInput(String userInput) {
        this.command = parsingCommand(userInput);
        this.argument = parsingArgument(userInput);
    }

    public String getArgument() {
        return argument;
    }

    public String getCommand() {
        return command;
    }
    private String parsingCommand(String userInput) {
        String[] parts = userInput.split(" ");
        String command = parts[0];
        String argument = parts[1];
        return command;
    }

    private String parsingArgument(String userInput) {
        String[] parts = userInput.split(" ");
        String command = parts[0];
        String argument = parts[1];
        return argument;
    }
}
