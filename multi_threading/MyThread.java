package multi_threading;

public class MyThread extends Thread{
    public MyThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Mythread -> "+Thread.currentThread().getName()+ i);
        }
    }
    
}
