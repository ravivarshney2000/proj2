public class main1 {

    public static void main(String[] args) {
        Runnable task1 = new task1();

        Runnable task2 = new task2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

    }
}

