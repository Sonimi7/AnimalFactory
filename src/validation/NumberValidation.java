package validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {

    private int age = -1;
    //private NumberValidation numberValidation = new NumberValidation();

    public boolean isNumber(String numberStr, Pattern pattern) {
        Matcher matcher = pattern.matcher(numberStr);
        return matcher.find();
    }

//    public boolean isAgeAndWeight(String ageStr, Scanner scanner) {
//        int variableStr = -1;
//        while(true) {
//////            String ageStr = scanner.next();
//            if (numberValidation.isNumber(ageStr, Pattern.compile("^\\d+$"))) {
//                variableStr = Integer.parseInt(ageStr);
//                if(variableStr >50 || variableStr <= 0) {
//                    System.out.println("Ошибка ввода. Повторите ввод данных.");
//                    continue;
//                }
//                break;
//            }
//            System.out.println("Ошибка ввода. Повторите ввод данных.");
//        }
//        int variableStrResult = variableStr;
//        return true;
//    }

}
