/**
 * Created by Archer on 2016/3/27.
 */
public class InterDemo01  {
    public static void main(String[] args) {

         C.work(new Printer());
        C.work(new USBDisk());

    }
}

interface USB{
    //抽象方法abstract被省略了
    void start();
    void stop();

}

class C {
    public static void work(USB u) {
        u.start();

        System.out.println("工作中");

        u.stop();
    }
}

class USBDisk implements USB {
    @Override
    public void start() {
        System.out.println("U盘工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机器工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机器停止工作");
    }
}

