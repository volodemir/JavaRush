package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.print("Введите имя: ");
        String name = sc.next();
        System.out.println("Имя: " + name);

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        System.out.println("Возраст: " + age);
        sc.close();

        isUnderage(age);
    }
    public static void isUnderage(int age){
        if (age < 18){
            System.out.println("Подрасти ещё");
        }
        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
