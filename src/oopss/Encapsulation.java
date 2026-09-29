package oopss;

public class Encapsulation {

    private int accNo;
    private double bal;

    Encapsulation(int accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    public int getAcc() {
        return accNo;
    }

    public double getBal() {
        return bal;
    }

    public void dep(double amt) {
        if (amt > 0) {
            bal += amt;
        }
    }

    public void wit(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
        }
    }

    public static void main(String[] args) {

        Encapsulation e = new Encapsulation(12345678, 20000);
         
        System.out.println("Account No: " + e.getAcc());
        System.out.println("Balance: " + e.getBal());

        e.dep(5000);
        System.out.println("After Deposit: " + e.getBal());

        e.wit(3000);
        System.out.println("After Withdrawal: " + e.getBal());
    }
}