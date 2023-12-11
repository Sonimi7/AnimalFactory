package animals.pets;

import animals.Animal;
import data.ColorData;

public class Dog extends Animal {

    public Dog(int age, String name, int weight, ColorData colorData) {

        super(age, name, weight, colorData);
    }
    @Override
    public void say() {

        System.out.println("Гав");
    }
}
