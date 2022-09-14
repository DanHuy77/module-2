package ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.Test;

import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruits.Fruit;
import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruits.fruitssub.Apple;
import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruits.fruitssub.Orange;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
