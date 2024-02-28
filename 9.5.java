
public class RunClass {
    public static void main(String[] args){
        Animal dogAnimal = new DogClass();
        Animal bearAnimal = new BearClass();
        Animal duckAnimal = new DuckClass();
        Animal snakeAnimal = new SnakeClass();

        dogAnimal.sound();
        bearAnimal.sound();
        duckAnimal.sound();
        snakeAnimal.sound();
    }
}
