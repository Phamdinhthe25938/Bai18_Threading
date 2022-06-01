package BaiTapATM;

public class main{

    public static void main(String[] args) {
        Account account = new Account(20);
        Runnable t1= new Withdraw(account);
        Runnable t2= new Withdraw(account);
        Thread task1= new Thread(t1);
        Thread task2= new Thread(t2);
        task1.start();
        task2.start();
    }
}
