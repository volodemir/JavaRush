package main.java.org.javaRush.lesson2;

public class Task2 {
    Woman lolita = new Woman("Lolita", 19);
    Woman larisa = new Woman("Larisa", 22);
    Woman kris = new Woman("Kristina", 25);

    Dog max = new Dog("Max", lolita);
    Dog bella = new Dog("Bella", larisa);
    Dog jack = new Dog("Jack", kris);


    public static void main(String[] args) {
        System.out.println("Мне так плохо! Хочу, чтобы все *****!");
    }

    Cat catOne;
    Cat catTwo;
    Cat catThree;
    Cat catFour;
    Cat catFive;
    Cat catSix;
    Cat catSeven;
    Cat catEight;
    Cat catNine;
    Cat catTen;

    Cat barsik = new Cat(larisa, "barsik");
    Cat matroskin = new Cat(kris, "matroskin");
    Cat lusya = new Cat(lolita, "lusya");
    Cat muska = new Cat(larisa, "muska");
    Cat dimok = new Cat(kris, "dimok");
    Cat simka = new Cat(lolita, "simka");
    Cat basya = new Cat(larisa, "basya");
    Cat lakki = new Cat(kris, "lakki");

    Fish freddy = new Fish("freddy", larisa);

}

