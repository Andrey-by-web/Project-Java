package lesson3.CapabilitiesClass;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, "Палевый");

        dog.infoDog();
        dog.voice();
        dog.eat();
        dog.sleep();
    }
}
