package model;

public class Deposit {
    private int depositId;
    private int accountId;
    private double amount;
    private String date;

    public Deposit(int depositId, int accountId, double amount, String date) {
        this.depositId = depositId;
        this.accountId = accountId;
        this.amount = amount;
        this.date = date;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDepositId() {
        return depositId;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositId=" + depositId +
                ", accountId=" + accountId +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
