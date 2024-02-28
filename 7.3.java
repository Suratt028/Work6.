package Ex7;

public class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("A new Dog has been created!");
    }
    public void sleep(){
        System.out.println("A Dog sleeps...");
    }
    public void eat(){
        System.out.println("A Dog eats");
    }
}
