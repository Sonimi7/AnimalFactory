package validation;

import data.CommandsData;

public class DataValidation {

    public boolean isValidation(String commandStr, Enum[] commandsData) {

        for (Enum command : CommandsData.values()) {
            if (command.name().equals(commandStr)) {
                return true;
            }
        }
        return false;

    }

}
