package Ex13;

public class Exam {
    public static void main(String[] args){
        Super obj = new Super();
        obj.Sample();
    }   
}
class Super{
    void Sample(){
        System.out.println("method of super class");
    }
}
class Sub extends Super{
    void Sample(){
        System.out.println("method of subclass");
    }
}
