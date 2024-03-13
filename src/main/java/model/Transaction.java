package model;

public class Transaction {
    private int id;
    private int account_id_g;
    private int account_id_r;
    private double amount;
    private String date;

    public Transaction(int id, int accountIdG, int getAccountIdR, double amount, String date) {
        this.id = id;
        this.account_id_g = accountIdG;
        this.account_id_r = getAccountIdR;
        this.amount = amount;
        this.date = date;
    }
    public Transaction(){}

    public int isId() {
        return id;
    }

    public int isAccount_id_g() {
        return account_id_g;
    }

    public int isAccount_id_r() {
        return account_id_r;
    }

    public double isAmount() {
        return amount;
    }

    public String isDate() {
        return date;
    }

    public void setId(int transactionId) {
        this.id = transactionId;
    }

    public void setAccount_id_g(int accountIdG) {
        this.account_id_g = accountIdG;
    }

    public void setAccount_id_r(int getAccountIdR) {
        this.account_id_r = getAccountIdR;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + id +
                ", accountIdG=" + account_id_g +
                ", getAccountIdR=" + account_id_r +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
