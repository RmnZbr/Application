package ru.firstApplication.validator.validationUserInput.validationCommand;

public class ValidatorUserCommand implements validationCommand{

    public boolean checkCommand(String command) {
        if (command.contains("rate")) {
            return true;
        }
        if (command.contains("predict")) {
            return true;
        }
        if (command.contains("exit")) {
            return true;
        }
        return false;
    }
}
