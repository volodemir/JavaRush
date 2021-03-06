package main.java.org.javaRush.findFibonacci;

public class Fibonacci {
    public static int fibRecursion(int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        else {
            return fibRecursion(num - 2) + fibRecursion(num - 1);
        }
    }
    public static int fibForeach(int countOfNumbers){
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i<countOfNumbers; ++i){
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return num1;
    }

    public static void main(String[] args) {
        int countOfNumbers = 8;
        int fib = 0;
        System.out.print("Первые " + countOfNumbers + " чисел Фибоначи: ");
        //recursion
        for (int i = 0; i < countOfNumbers; i++){
            fib = fibRecursion(i);
            System.out.print(fib + " ");
        }
        System.out.print("\n");
        //foreach
        System.out.print("Первые " + countOfNumbers + " чисел Фибоначи: ");
        System.out.print(fibForeach(countOfNumbers));
    }
}
