package ru.firstApplication.BodyOfApp;

import ru.firstApplication.appMessages.SuggestionToContinue.SuggestionToContinue;
import ru.firstApplication.appMessages.errorMessages.errorInputCommand.ErrorInputCommand;
import ru.firstApplication.appMessages.errorMessages.errorInputCommandArgument.ErrorInputCommandArgument;
import ru.firstApplication.commands.exit.Exit;
import ru.firstApplication.commands.predict.Predict;
import ru.firstApplication.commands.rate.Rate;
import ru.firstApplication.userActions.input.ConsoleInput;
import ru.firstApplication.userActions.input.parsingUserInput.ParsingUserInput;
import ru.firstApplication.userActions.input.parsingUserSuggestion.ParsingUserSuggestion;
import ru.firstApplication.validator.validationUserInput.validationArgument.ValidatorArgumentForCommand;
import ru.firstApplication.validator.validationUserInput.validationCommand.ValidatorUserCommand;

public class BodyOfApp {

    public void mainBodyOfApp() {

        ConsoleInput consoleInput = new ConsoleInput();
        String userInput = consoleInput.acceptUserInput();
        ParsingUserInput parsingUserInput = new ParsingUserInput(userInput);

        ValidatorUserCommand validationUserCommand = new ValidatorUserCommand();
        ValidatorArgumentForCommand validationArgumentForCommand = new ValidatorArgumentForCommand();

        while (!validationUserCommand.checkCommand(parsingUserInput.getCommand()) && !validationArgumentForCommand.checkArgument(parsingUserInput.getArgument())) {
            if (!validationUserCommand.checkCommand(parsingUserInput.getCommand())) {
                ErrorInputCommand errorCommand = new ErrorInputCommand();
                errorCommand.displayError();
                userInput = consoleInput.acceptUserInput();
            } else {
                ErrorInputCommandArgument errorArgument = new ErrorInputCommandArgument();
                errorArgument.displayError();
                userInput = consoleInput.acceptUserInput();
            }
        }

        switch (parsingUserInput.getCommand()) {
            case "rate":
                Rate rate = new Rate();
                rate.rate(parsingUserInput.getArgument());
                break;
            case "predict":
                Predict predict = new Predict();
                predict.predict(parsingUserInput.getArgument());
                break;
            case "exit":
                Exit exit = new Exit();
                exit.exit();
        }

        SuggestionToContinue suggestionToContinue = new SuggestionToContinue();
        suggestionToContinue.displaySuggestion();

        userInput = consoleInput.acceptUserInput();
        ParsingUserSuggestion parsingUserSuggestion = new ParsingUserSuggestion(userInput);
        while (!parsingUserSuggestion.isSuggestion()) {
            System.out.println("Вы ввели недопустимую команду, ответьте yes или no");
        }
        if (userInput.contains("yes") || userInput.contains("y")) {
            mainBodyOfApp();
        }
        if (userInput.contains("no") || userInput.contains("n")) {
            Exit exit = new Exit();
        }
    }
}

