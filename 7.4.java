package Ex7;

public class MainClass {
    public static void main(String[] args){
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        Dog.sleep();
        Dog.eat();
    }
}
