package lesson2.variebals;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число: ");
        int numberOne = sc.nextInt();
        System.out.println("введите второе число: ");
        int numberTwo = sc.nextInt();
        int sumResult = numberOne + numberTwo;
        System.out.println(sumResult);
        System.out.println("привет");
        System.out.println("количество рабочих дней в году: ");
        int worksDay = sc.nextInt();
        System.out.println(worksDay);
    }
}
