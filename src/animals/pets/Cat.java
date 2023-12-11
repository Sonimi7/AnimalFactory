package animals.pets;

import animals.Animal;
import data.ColorData;

public class Cat extends Animal {

    public Cat(int age, String name, int weight, ColorData colorData) {

        super(age, name, weight, colorData);
    }

    @Override
    public void say() {

        System.out.println("Мяу");
    }

}
