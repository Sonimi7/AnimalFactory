package animals;

import data.ColorData;
import validation.NumberValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Animal {

    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color = null;

    private NumberValidation numberValidation = new NumberValidation();

    public Animal(int age, String name, int weight, ColorData colorData) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = colorData;

    }
    public void say() {
        System.out.println("Я говорю");
    };

    public void drink() {
        System.out.println("Я пью");
    };

    public void eat() {
        System.out.println("Я ем");
    };

    public void go() {
        System.out.println("Я бегу");
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Scanner scanner) {
        int animalsAge = -1;
        //String ageStr = scanner.next();
        while(true) {
            String ageStr = scanner.next();
            if (numberValidation.isNumber(ageStr, Pattern.compile("^\\d+$"))) {
                animalsAge = Integer.parseInt(ageStr);
                if(animalsAge >50 || animalsAge <= 0) {
                    System.out.println("Ошибка возраста. Введите верный возраст.");
                    continue;
                }
                break;
            }
            System.out.println("Ошибка возраста. Введите верный возраст.");
        }
        this.age = animalsAge;

//        if(!numberValidation.isAgeAndWeight(ageStr, scanner)) {
//            this.age = Integer.parseInt(ageStr);
//        }

    }

    public void setWeight(Scanner scanner) {
        int animalsWeight = -1;
        while(true) {
            String weightStr = scanner.next();
            if (numberValidation.isNumber(weightStr, Pattern.compile("^\\d+$"))) {
                animalsWeight = Integer.parseInt(weightStr);
                if(animalsWeight >50 || animalsWeight <= 0) {
                    System.out.println("Ошибка веса");
                    continue;
                }
                break;
            }
            System.out.println("Ошибка веса");
        }
        this.weight = animalsWeight;
    }

    public void setColor(ColorData color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public ColorData getColor() {
        return color;
    }

    @Override
    public String toString() {

        String getCase = getCase();
        if(getCase == null) {
            return "Возраст введен неверно";
        }

        return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
                this.name,
                this.age,
                getCase(),
                this.weight,
                this.color.getName()
        );
    }

    private String getCase() {

        if(this.age <= 0 || this.age > 50) {
            this.age = -1;
        }

        if(this.age >=11 && this.age <=19) {
            return "лет";
        }

        int remainder = this.age % 10;
        if(remainder == 0 || remainder >= 5) {
            return "лет";
        }

        if(remainder == 1) {
            return "год";
        }

        return "года";
    }
}
