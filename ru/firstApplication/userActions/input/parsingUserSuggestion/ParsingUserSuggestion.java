package ru.firstApplication.userActions.input.parsingUserSuggestion;

public class ParsingUserSuggestion {

    public ParsingUserSuggestion(String userInput) {
        this.isSuggestion = parsingSuggestion(userInput);
    }

    private boolean isSuggestion;

    public boolean isSuggestion() {
        return isSuggestion;
    }


    private boolean parsingSuggestion(String userInput) {

        if (userInput.contains("yes")) {
            return true;
        }
        if (userInput.contains("y")) {
            return true;
        }
        if (userInput.contains("no")) {
            return true;
        }
        if (userInput.contains("n")) {
            return true;
        }

        return false;
    }
}
