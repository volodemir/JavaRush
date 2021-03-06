package main.java.org.javaRush.lesson_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Sorting {
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
        sc.close();

        System.out.print("Приведенные числа в порядке убывания: ");
        sortDescending(number1, number2, number3);
    }

    private static void sortDescending(int num1, int num2, int num3) {
        int[] mass = {num1, num2, num3};
        int min = 0;
        for (int i = mass.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (mass[j] < mass [j+1]){
                    min = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = min;
               }
            }
        }
        for (int i=0;i<mass.length;i++){
            System.out.print(mass[i] + " ");
        }
    }
}
