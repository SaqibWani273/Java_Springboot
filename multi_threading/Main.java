package multi_threading;

public class Main {
    public static void main(String[] args) {
        System.out.println(" MultiThreading ->");

        MyThread myThread = new MyThread("DaemonThread");
        myThread.setDaemon(true);//to set it to a non-user
        //thread which has low priority and runs in background
        myThread.start();
        var myThread1=new MyThread("NonDaemonThread");
        myThread1.start();
        System.out.println("main finished   ");
    }
}
