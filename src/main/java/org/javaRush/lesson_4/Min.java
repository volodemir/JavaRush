package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class Min {
    public static void main(String[] args) {
    Scanner sc = new Scanner(in);
        System.out.print("Введите первое число: ");
        int number1 = sc.nextInt();
        System.out.println("Первое число: " + number1);

        System.out.print("Введите второе число: ");
        int number2 = sc.nextInt();
        System.out.println("Второе число: " + number2);
        sc.close();

        System.out.println("Минимальное среди приведенных чисел: " + findMin(number1,number2));
    }
    public static int findMin(int num1, int num2){
        if (num1 < num2) return num1;
        else return num2;
    }
}
