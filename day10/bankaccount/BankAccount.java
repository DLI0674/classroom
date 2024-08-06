package classroom.day10.bankaccount;

public class BankAccount extends Thread{
    private int amount;
    private final Object mutex=new Object();
    BankAccount(int x){
        this.amount=x;
    }
    private void withdraw(){
        if(amount<=Main.money){
            synchronized (mutex){
                if(amount<=Main.money){
                    Main.money-=amount;
                    System.out.println(amount+" Withdrawn");
                }
            }
        }
        else{
            System.out.println("Insuffucient Money.");
        }
    }
    public void run(){
        withdraw();
    }
}
