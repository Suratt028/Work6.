package Ex14;

public class Exam {
    public static void main(String[] args){
        Flower f = new Flower();
        Rose r = new Rose();

        f.Smell();
        r.Smell();

        f = r;
        f.Smell();

        r = (Rose) f;
        r.Smell();
    }
}
class Flower{
    public void Smell(){
        System.out.println("All flowers give smell");
    }
}
class Rose extends Flower{
    public void Smell(){
        System.out.println("Rose gives rosy smell");
    }
}
