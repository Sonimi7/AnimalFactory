import animals.Animal;
import animals.birds.IFly;
import data.AnimalsData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalsFactory;
import validation.DataValidation;
import validation.NumberValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalsList = new ArrayList<>();

        DataValidation commandValidation = new DataValidation();
        NumberValidation numberValidation = new NumberValidation();

        while (true) {
            System.out.println("Введите команду add/list/exit");
            String commandStr = scanner.next();

            if (!commandValidation.isValidation(commandStr, CommandsData.values())) {
                System.out.println("Вы ввели неверную команду");
                continue;
            }
        System.out.println("Good");

            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData) {
                case ADD:
                    String animalsTypeStr = "";
                    while(true) {
                        System.out.println("Введите тип животного: cat/dog/duck");
                        animalsTypeStr = scanner.next().toUpperCase().trim();

                        if (commandValidation.isValidation(animalsTypeStr, AnimalsData.values())) {
                            break;
                        }
                        System.out.println("Вы ввели неверный тип животного");
                    }


                    System.out.println("Введите имя животного");
                    String name = scanner.next();

                    System.out.println("Введите возраст животного");
                    int age = scanner.nextInt();

                    System.out.println("Введите вес животного");
                    int weight = scanner.nextInt();

                    System.out.println("Введите цвет животного: BLACK/BLUE/WHITE/RED");
                    String animalColorStr = scanner.next();

                    if (!commandValidation.isValidation(animalColorStr, ColorData.values())) {
                        System.out.println("Вы ввели неверный цвет животного");
                        continue;
                    }

                    AnimalsFactory animalsFactory = new AnimalsFactory(age, name, weight, ColorData.BLACK);
                    Animal animals = animalsFactory.create(AnimalsData.valueOf(animalsTypeStr));

                    animalsList.add(animals);

                    if(animals instanceof IFly) {
                        ((IFly) animals).fly();
                        animals.say();
                        animals.drink();
                        animals.eat();
                    } else {
                        animals.say();
                        animals.drink();
                        animals.eat();
                        animals.go();
                    }
                    
                case LIST:
                    if(animalsList.isEmpty()) {
                        System.out.println("Список с животными пуст. Создайте животного с помощью команды add");
                        continue;
                    }
                    for(Animal animalsObj: animalsList) {
                        System.out.println(animalsObj.toString());
                    }
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }
}