package main.java.org.javaRush.lesson5;

public class CatInitialize {
    private String cat;

    public void initialize (String name){
        this.cat = name;
    }
    public void initialize (String name, int weight, int age){
        this.cat = name + weight + age;
    }
    public void initialize (String name, int age){
        this.cat = name + age;
    }
    public void initialize (int weight, String color){
        this.cat = weight + color;
    }
    public void initialize (int weight, String color, String address){
        this.cat = weight + color + address;
    }
    public void testInit (){
        CatInitialize cat = new CatInitialize();
        cat.initialize("Barsik");
        cat.initialize("Barsik", 4);
        cat.initialize("Barsik", 5,4);
        cat.initialize(5, "gray");
        cat.initialize(5, "gray", "Ekaterinburg");
    }
}
