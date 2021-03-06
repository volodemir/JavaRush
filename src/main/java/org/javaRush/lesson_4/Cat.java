package main.java.org.javaRush.lesson_4;

public class Cat {
    private String name;
    private static int catsCount = 0;
    private String fullName;

    public void setName(String name) {
        this.name = name;
    }

    public static void addNewCat()
    {
        catsCount++;
    }

    public static void setCatsCount(int catsCount)
    {
        Cat.catsCount = catsCount;
    }

    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        setCatsCount(3);
        Cat cat2 = new Cat();
        addNewCat();
        System.out.println("Cats count is " + Cat.catsCount);
    }
}
