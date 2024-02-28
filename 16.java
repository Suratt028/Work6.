class Animal{
     int health = 100;
}
class Mammal extends Animal{ }

class Cat extends Mammal{
    public int catHealth = 25;
}
class dog extends Mammal{ }


public class Exam3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c);
        Mammal m = c;
        System.out.println(m);
        
        System.out.println(c.catHealth);
        System.out.println(m.catHealth);
    }
}
