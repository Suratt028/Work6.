public class Animal2 {
    public Animal2(){
        System.out.println("I am an Animal2");
    }
    public void eat (){
        System.out.println("I can eat");
    }
}
    class dog extends Animal2{
        public dog(){
            super();
            System.out.println("I am a dog");
        }
        public void eat(){
            super.eat();
            System.out.println("I eat dog food");
        }
        public void bark(){
            System.out.println("I can bark");
        }
    }
    class Main  {
        public static void main(String[] args) {
            dog dog1 = new dog();
            
            dog1.eat();
            dog1.bark();

        }
    }
