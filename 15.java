 class Animal4 {
    int health = 100;
}
class Mammal extends Animal4{}
class Cat extends Mammal{}
class dog extends Mammal{}

public class Test{
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.health);
        dog d = new dog();
        System.out.println(d.health);
        Mammal m = c;
        System.out.println(m);
    }
}
