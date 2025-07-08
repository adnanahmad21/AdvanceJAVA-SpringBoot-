public class demo1 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread1 t2=new thread1();
        thread1 t3=new thread1();
        t1.setName("1st");
        
        t1.start();
        t1.setPriority(6);
        t2.setPriority(1);
        t3.setPriority(5);
        t2.start();
        t2.setName("2nd");
        t3.start();
        t3.setName("3rd");
        
        // for(int i=0;i<5;i++)
        // System.out.println("MAIN THREAD");

    }
}

class thread1 extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            
            // Thread.yield();
            System.out.println(Thread.currentThread());
         
        }
    }
}