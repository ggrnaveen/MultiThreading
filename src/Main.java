public class Main {
    public static void main(String[] args) {

        Display d = new Display();

        MyThread1 thread1 = new MyThread1(d,"Dhoni");
        MyThread2 thread2 = new MyThread2(d,"Yuvi");

        thread1.start();
        thread2.start();

    }
}