package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        while (i <= 10 && i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("\n");

        Scanner sc = new Scanner(in);
        System.out.print("Введите строку: ");
        String str = sc.next();
        System.out.println("Строка: " + str);

        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Число: " + n);
        sc.close();
        int j = 0;
        while (j < n) {
            j++;
            System.out.println(str);
        }

        i = 0;
        j = 0;
        String s = "";
        while (j < 10){
            while (i < 10) {
                s += "S";
                i++;
            }
            System.out.println(s);
            j++;
        }

        //таблица умножения
        i = 1;
        j = 1;

        while (j < 10) {
            while (i < 10) {
                System.out.print(i*j + " ");
                i++;
            }
            System.out.println();
            j++;
            i = 1;
        }
    }
}
