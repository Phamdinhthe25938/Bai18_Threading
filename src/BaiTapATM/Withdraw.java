package BaiTapATM;

public class Withdraw extends Thread {
    Account account;

    public Withdraw(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        try {
            this.account.withdraw(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
