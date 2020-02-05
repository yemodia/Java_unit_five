
public class Account {

    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance){
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.acctNum = (int)(Math.random() * 998) + 1;
    }

    public Account(){
        this("", "", 0);
    }

    public Account(Account dup) {
        this(dup.first, dup.last, dup.balance);

    }

    public String getFirst(){
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void deposit(double cash){
        balance += cash;
    }

    public boolean withdrawal(double cashWithdraw){
        if (cashWithdraw <= balance){
            balance -= cashWithdraw;
            return true;
        }
        else return false;

    }

    public String toString(){
        return "Customer Name: " + first + " " + last + "\nAccount #: " + acctNum + "\nCurrent Balance: " + "$" +balance;

    }




}




