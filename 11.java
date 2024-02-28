package Ex11;

public class Exam {
    public static void main(String[] args){
        X x = new X();
        Y y = new Y();
        y.m2();
        x.m1();
        y.m1();
        x = y;
        x.m1();

    }
}
class X{
    private int a;
    int b;
    public void m1(){
        System.out.println("This is method m1 of class X");
    }
}
class Y extends X{
    int c;
    public void m1(){
        System.out.println("This is method m1 of class Y");
    }
    public void m2(){
        super.m1();
        System.out.println("This is method m2");
    }
}
