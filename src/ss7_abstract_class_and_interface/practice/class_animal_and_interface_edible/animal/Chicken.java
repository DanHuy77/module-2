package ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal;

import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cheap cheap, expensive";
    }

    @Override
    public String howToEat() {
        return "nướng";
    }
}
