package ss5_access_modifier_static_method_static_property.practice.car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("xe1","dc1");
        System.out.println(Car.numberOfCars);
        Car c2 = new Car("xe2","dc2");
        System.out.println(Car.numberOfCars);
        Car c3 = new Car("xe3","dc3");
        System.out.println(Car.numberOfCars);
        Car c4 = new Car("xe4","dc4");
        System.out.println(Car.numberOfCars);
        Car c5 = new Car("xe5","dc5");
        System.out.println(Car.numberOfCars);
        Car c6 = new Car("xe6","dc6");
        System.out.println(Car.numberOfCars);
    }
}
