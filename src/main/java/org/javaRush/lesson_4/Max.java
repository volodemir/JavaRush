package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.print("Введите первое число: ");
        int number1 = sc.nextInt();
        System.out.println("Первое число: " + number1);

        System.out.print("Введите второе число: ");
        int number2 = sc.nextInt();
        System.out.println("Второе число: " + number2);

        System.out.print("Введите третье число: ");
        int number3 = sc.nextInt();
        System.out.println("Третье число: " + number3);

        System.out.print("Введите четвертое число: ");
        int number4 = sc.nextInt();
        System.out.println("Четвертое число: " + number4);
        sc.close();

        System.out.println("Максимальное среди приведенных чисел: " + findMax(number1,number2,number3,number4));
    }
    public static int findMax(int num1, int num2, int num3, int num4){
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        if (num4 > max){
            max = num4;
        }
        return max;
    }
}
