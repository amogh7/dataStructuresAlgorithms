package oops;

public class Bank {//Abstraction used to hide implementaton detail and encapsulation is used to hide the data and data hiding is also encapsulation
    private int bankbalance;

    public int getBankbalance() {
        return bankbalance;
    }

    public void setBankbalance(int bankbalance) {
        this.bankbalance = bankbalance;
    }
}
