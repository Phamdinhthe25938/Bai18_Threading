package BaiTapATM;

public class Account {
    int currentAmount;
    public Account(int currentAmount) {
        this.currentAmount=currentAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
     public synchronized void withdraw(int moneyWithdraw) throws InterruptedException {
        if(currentAmount>moneyWithdraw){
            Thread.sleep(1000);
            this.setCurrentAmount(currentAmount-moneyWithdraw);
            System.out.println(this.getCurrentAmount());
        }
        else {
            System.out.println("Not enough money!");
        }
    }
}
