/**
 * Created by Archer on 2016/3/27.
 */
public class PolDemo02 {
    public static void main(String[] args) {


        say(new D1());


    }
    public static void say(A1 a1){
        a1.tell1();
    }

//    public static  void say(C1 c1){
//        c1.tell1();
//    }
}

class A1{
    public void tell1(){
        System.out.println("a1-->tell1");
    }



}

class B1 extends A1{
    public void tell2(){
        System.out.println("B1-->tell2");
    }
}
class D1 extends A1{

}

class C1 extends A1{
    public void tell3(){
        System.out.println("c1-->tell3");

    }
}
