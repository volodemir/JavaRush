package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        Scanner sc = new Scanner(in);
        System.out.print("Введите число m: ");
        int m = sc.nextInt();
        System.out.println("Число m: " + m);

        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        System.out.println("Число n: " + n);


       for (int k = 0; k < m; k++) {
            for (int i = 0; i < n; i++) {
                System.out.print("8");
           }
           System.out.println();
        }
        System.out.println("\n");

       String eight = "";
       for (int i=0; i < 10; i++) {
           eight += "8";
           System.out.println(eight);
       }

       System.out.println("\n");
       for (int i=0; i<10; i++){
           System.out.print("8");
       }
        System.out.println();
        for (int i=0; i<10; i++){
            System.out.println("8");
        }

        System.out.print("Введите имя: ");
        String name = sc.next();
        System.out.println("Имя: " + name);
        for (int i=0; i<10; i++){
            System.out.println(name + " любит меня.");
        }
    }
}
