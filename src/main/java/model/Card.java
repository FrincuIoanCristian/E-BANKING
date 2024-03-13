package model;

import java.time.LocalDate;

public class Card {

    private int id;
    private String card_number;
    private int account_id;
    private String security_code;

    private String exp_date;
    public Card(int id, String cardNumber, int accountId, String securityCode, String expirationDate){
        this.id = id;
        this.card_number = cardNumber;
        this.account_id = accountId;
        this.security_code = securityCode;
        this.exp_date = expirationDate;
    }

    public Card(){
    }

    public void setId(int id){
        this.id = id;
    }
    public int isId(){
        return this.id;
    }
    public void setCard_number(String cardNumber) {
        this.card_number = cardNumber;
    }

    public void setAccount_id(int accountId) {
        this.account_id = accountId;
    }

    public void setSecurity_code(String securityCode) {
        this.security_code = securityCode;
    }

    public void setExp_date(String expirationDate) {
        this.exp_date = expirationDate;
    }

    public String isCard_number() {
        return card_number;
    }

    public int isAccount_id() {
        return account_id;
    }

    public String isSecurity_code() {
        return security_code;
    }

    public String isExp_date() {
        return exp_date;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + card_number + '\'' +
                ", accountId=" + account_id +
                ", securityCode='" + security_code + '\'' +
                ", expirationDate='" + exp_date + '\'' +
                '}';
    }
}
