package classroom.day10.bankaccount;

public class Main {
    static int money=500;
    public static void main(String[] args) {
        Thread t1=new BankAccount(500);
        Thread t2=new BankAccount(100);
        Thread t3=new BankAccount(600);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(money);
    }
}
