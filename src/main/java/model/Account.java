package model;

public class Account {
    private int id;
    private int client_id;
    private double balance;

    public Account(int id, int client_id, double balance) {
        this.id = id;
        this.client_id = client_id;
        this.balance = balance;
    }
    public Account(){

    }

    public int isId() {
        return id;
    }

    public int isClient_id() {
        return client_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int accountId) {
        this.id = accountId;
    }

    public void setClient_id(int clientId) {
        this.client_id = clientId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + id +
                ", clientId=" + client_id +
                ", balance=" + balance +
                '}';
    }
}
