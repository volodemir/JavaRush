package main.java.org.javaRush.lesson5;

public class Friend {
    private String friend;

    public void initialize (String name){
        this.friend = name;
    }
    public void initialize (String name, int age){
        this.friend = name + age;
    }
    public void initialize (String name, int age, String gender){
        this.friend = name + age + gender;
    }
    public void testInit(){
        Friend fr = new Friend();
        fr.initialize("Игорь");
        fr.initialize("Игорь", 25);
        fr.initialize("Игорь", 25, "мужской");
    }

}
