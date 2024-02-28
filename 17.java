class Animal{
     int health = 1     ;
}
class Mammal extends Animal{ 
    int health =2;
}

class Cat extends Mammal{
    int health = 3;
}
class dog extends Mammal{
    int health = 4 ;
 }


public class Exam3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Mammal m = c;
        Animal a =m;
        
        System.out.println(c.health);
        System.out.println(m.health);
        System.out.println(a.health);
    }
}
