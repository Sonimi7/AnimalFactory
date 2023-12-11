package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalsData;
import data.ColorData;

public class AnimalsFactory {

    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData colorData;


    public AnimalsFactory(int age, String name, int weight, ColorData colorData) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colorData = colorData;
    }

    public Animal create(AnimalsData animalsData) {
        switch(animalsData) {
            case CAT:
                return new Cat(age, name, weight, colorData);
            case DOG:
                return new Dog(age, name, weight, colorData);
            default:
                return new Duck(age, name, weight, colorData);
        }
    }

}
