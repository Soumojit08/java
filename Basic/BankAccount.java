package Basic;

class Bank{
    String name;
    int acc;
    double bal;

    Bank(String x, int y, double z){
        this.name = x;
        this.acc = y;
        this.bal = z;
    }

    void setAcc(){
        System.out.println("Acc Holder Name : " + this.name);
        System.out.println("Acc No : " + this.acc);
        System.out.println("Acc bal : " + this.bal);
    }

    void deposit(double amt){
        if (amt > 0){
            this.bal += amt;
        }
        System.out.println("Balance Deposit Successfully. Current Balance : " + this.bal);
    }

    void withdraw(double amt){
        if (this.bal >= amt){
            this.bal -=  amt;
        }
        System.out.println("Balance Withdraw Successfully. Current Balance : " + this.bal);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bl = new Bank("Soumojit Banerjee", 111222333, 100);
        bl.setAcc();
        bl.deposit(900);
        bl.withdraw(500);
    }
}
