package bll;



import dao.BankAccountDAO;
import model.Account;
import model.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BankAccountBll {

    private BankAccountDAO bankAccountDAO;

    public BankAccountBll() {


        bankAccountDAO = new BankAccountDAO();
    }

    public Account findAccountById(int id) {
        Account st = bankAccountDAO.findById(id);
        if (st == null) {
            throw new NoSuchElementException("The Bank Account with id =" + id + " was not found!");
        }
        return st;
    }



    public Account insert(Account ba) throws IllegalAccessException {
        Account bankAccount = bankAccountDAO.insert(ba);
        return bankAccount;
    }

    public List<Account> findAll(){
        return bankAccountDAO.findAll();
    }

    public Account findAccountByClientId(int id){
        return bankAccountDAO.findByClientId(id);
    }

    public void update(Account account, ArrayList<String> fields, ArrayList<Object> value){
        bankAccountDAO.update(account, fields, value);
    }
}
