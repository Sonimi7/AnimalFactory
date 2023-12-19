package validation;

import data.CommandsData;

import java.util.Locale;

public class DataValidation {

    public boolean isValidation(String commandStr, Enum[] commandsData) {

        for (Enum command : commandsData) {
            if (command.name().equals(commandStr.toUpperCase(Locale.ROOT).trim())) {
                return true;
            }
        }
        return false;
    }


}
