package lesson3.CapabilitiesClass;

public class Dog {
    private String dogName;
    private int age;
    private String color;

    public Dog(String dogName, int age, String color) {
        this.dogName = dogName;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Команда голос: гав-гав");
    }

    void eat() {
        boolean isHungry;
        int rand = 5;
        int randValue = (int) (Math.random() * 10);
        if (randValue <= rand)
            isHungry = true;
        else
            isHungry = false;
        System.out.println("Собака голодная? " + isHungry);
    }

    void sleep() {
        boolean sleepDog;
        int randValue = (int) (Math.random() * 10);
        if (randValue <= 3)
            sleepDog = true;
        else
            sleepDog = false;
        System.out.println("Собака спит? " + sleepDog);
    }

    void infoDog() {
        System.out.println("Кличка собаки: " + dogName);
        System.out.println("Возраст собаки: " + age);
        System.out.println("Цвет шерсти: " + color);
    }
}
