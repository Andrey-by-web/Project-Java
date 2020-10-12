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
//  void hungry() {
//     boolean isHungry = false;
//        int rand = 5;
//        int randValue = (int) (Math.random() * 10);
//        if (randValue <= rand)
//            isHungry = true;
//        else
//            isHungry = false;
 //       System.out.println("Собака голодная? " + isHungry);
   // }
    public boolean isSleep;

    public boolean isHungry;

//    void sleep() {
//        boolean sleepDog = false;
//        int randValue = (int) (Math.random() * 10);
//        if (randValue <= 3)
//            sleepDog = true;
//        else
//            sleepDog = false;
//       System.out.println("Собака спит? " + sleepDog);
 //   }
    public void sleepTrue(){
        this.isSleep = true;
    }

    public void sleepFalse(){
        this.isSleep = false;
    }

    public void hungryTrue(){
        this.isHungry = true;
    }

    public void hungryFalse(){
        this.isHungry = false;
    }

    void infoDog() {
        System.out.println("Кличка собаки: " + dogName);
        System.out.println("Возраст собаки: " + age);
        System.out.println("Цвет шерсти: " + color);
        System.out.println("Собака спит? " + isSleep);
        System.out.println("Собака голодная? " + isHungry);
    }
}
