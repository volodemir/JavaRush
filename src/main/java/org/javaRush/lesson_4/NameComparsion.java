package main.java.org.javaRush.lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class NameComparsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.print("Введите любое имя: ");
        String name1 = sc.next();
        System.out.println("Первое имя: " + name1);

        System.out.print("Введите второе имя: ");
        String name2 = sc.next();
        System.out.println("Второе имя: " + name2);

        comparsion(name1,name2);
    }

    public static void comparsion(String name1, String name2){
        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }
        else if(name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
