package ru.firstApplication.validator.validationUserInput.validationArgument;

public class ValidatorArgumentForCommand implements validationArgument{
    public boolean checkArgument(String argument) {

        if (argument.contains("...")) {
            return true;
        }
        return false;
    }
}
