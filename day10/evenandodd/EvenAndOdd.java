package classroom.day10.evenandodd;

public class EvenAndOdd {
    private static int ct=0;
    private final Object mutex=new Object();
    public static void main(String[] args) {
        EvenAndOdd print=new EvenAndOdd();
        Thread t1=new Thread(print::printEven);
        Thread t2=new Thread(print::printOdd);
        t1.start();
        t2.start();
    }
    public void printEven(){
        synchronized (mutex){
             while(ct<20){
                while (ct % 2 == 1) {
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                 System.out.println(ct++);
                 mutex.notify();
             }
        }
    }
    public void printOdd(){
        synchronized (mutex){
             while(ct<20){
                while (ct % 2 == 0) {
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                 System.out.println(ct++);
                 mutex.notify();
             }
        }
    }
}
