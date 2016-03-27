/**
 * Created by Archer on 2016/3/27.
 * 抽象类的运用
 */
public class AbsDemo01 {
    public static void main(String[] args) {

        Student student=new Student(10,"小明",100);
        student.want();

        Worker worker=new Worker(20,"小李",100+"");
        worker.want();


    }
}


abstract  class Person{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age ;
    private String name;

    //构造器
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract  void want();
}


class Student extends Person{

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int score;

    public Student(int age, String name, int score ) {
        super(age, name);
        this.score=score;
    }

    @Override
    public void want() {
        System.out.println("姓名"+getName()+"年龄"+getAge()+"成绩"+getScore());
    }
}


class Worker extends Person{
    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    private String Money;
    public Worker(int age, String name,String money) {
        super(age, name);
        this.Money=money;
    }

    @Override
    public void want() {
        System.out.println("姓名"+getName()+"年龄"+getAge()+"工资"+getMoney());

    }
}

