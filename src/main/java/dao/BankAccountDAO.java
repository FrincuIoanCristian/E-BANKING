package dao;

import model.Account;

import java.util.List;

public class BankAccountDAO extends AbstractDAO<Account> {
    public Account findByClientId(int clientId){
        List<Account> accounts = findAll();
        for(Account a:accounts){
            if(a.isClient_id() == clientId)
                return a;
        }
        return null;
    }
}
