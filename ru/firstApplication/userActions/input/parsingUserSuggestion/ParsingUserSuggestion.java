package ru.firstApplication.userActions.input.parsingUserSuggestion;

public class ParsingUserSuggestion {

    public ParsingUserSuggestion(String userInput) {
        this.suggestion = parsingSuggestion(userInput);
    }

    public boolean suggestion;

    private boolean parsingSuggestion(String userInput) {

        if (userInput.contains("yes")) {
            return true;
        }
        if (userInput.contains("y")) {
            return true;
        }
        if (userInput.contains("no")) {
            return false;
        }
        if (userInput.contains("n")) {
            return false;
        }

        return false;
    }
}
