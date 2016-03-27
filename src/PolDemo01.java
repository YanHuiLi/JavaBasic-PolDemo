/**
 * 对象多态性
 * Created by Archer on 2016/3/27.
 *
 * 向上转型：程序自动完成
 * 父类 父类对象=子类实例
 *
 * 向下转型：
 *
 * 子类 子类对象=（子类）父类实例
 */
public class PolDemo01 {
    public static void main(String[] args) {


        //向上转型
//        A a= new B();
//        a.tell1();//被复写的方法
//        a.tell2();

        //向下转型
//        A a =new B();
//        B b= (B)a;
//        b.tell2();
//        b.tell1();
//        b.tell3();

        //使用instanceof关键字
        A a=new A();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);

        A a1 =new B();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);



    }
}

class A{

    public void tell1(){
        System.out.println("Tell1 方法");
    }

    public void  tell2(){
        System.out.println("Tell2 方法");

    }
}
class B extends A{
    public void tell1(){
        System.out.println("B的tell1方法");

    }

    public void tell3(){

        System.out.println("B的tell3方法");
    }


}