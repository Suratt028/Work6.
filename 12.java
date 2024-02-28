public class Exam2 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
        Vehicle V1 = new Vehicle();
        V1.move();
    }
}
    class Vehicle{
        public void move(){
            System.out.println("Vehicle can move");
        }
    }
    class Bike extends Vehicle{
        public void move(){
            System.out.println("Bike can move and accelerate too");
        }
    }
