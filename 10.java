public class Exam {
    public static void main(String[] args) {
        Cat myCat = new Cat();
            Animal myAnimal = myCat;
            Animal.testClassMethod();
            myAnimal.testInstanceMethod();
    }
}
    class Animal {
        public static void testClassMethod() {
            System.out.println("The Static method in Animal");
        }
        public  void testInstanceMethod() {
            System.out.println("The instance method in Animal");
        }
    }
    class Cat extends Animal{
        public static void testClassMethod(){
            System.out.println("The Static method in cat");
        }
        public void testInstanceMethod(){
            System.out.println("The instance method in cat");
        }
    }
