package Account;

public class Account {
    
    private int number;
    private String holder;
    private double balance;
    
    public Account() {
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getholder() {
        return holder;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance 
                + "\n");
    }
}
