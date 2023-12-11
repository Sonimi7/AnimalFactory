package animals.birds;

import animals.Animal;
import data.ColorData;

public class Duck extends Animal implements IFly{

    public Duck(int age, String name, int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    public void fly() {
        System.out.println("Я лечу");
    }
    @Override
    public void say() {

        System.out.println("Кря");
    }
}
