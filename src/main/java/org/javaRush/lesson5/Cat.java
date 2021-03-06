package main.java.org.javaRush.lesson5;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    static Cat cat1 = new Cat("Murzik", 6, 4, 8); //192
    static Cat cat2 = new Cat("Barsik", 8, 5, 6); //240
    static Cat cat3 = new Cat("Lusya", 3, 3, 4); //36

    public static void test(){
        System.out.println("Бой Мурзика vs Барсика " + fight(cat1, cat2));
        System.out.println("Бой Мурзика vs Люси " + fight(cat1, cat3));
        System.out.println("Бой Барсика vs Люси " + fight(cat2, cat3));
    }
    public static boolean fight(Cat cat, Cat anotherCat){
        if (cat.age * cat.weight * cat.strength >
                anotherCat.age * anotherCat.weight * anotherCat.strength){
            return true;}
        else
        return false;
    }

    public static void main(String[] args) {
        Cat.test();
    }
}
