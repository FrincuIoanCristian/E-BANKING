package bll;



import dao.CardDAO;
import dao.TransactionDAO;
import model.Card;
import model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TransactionBll {

    private TransactionDAO transactionDAO;

    public TransactionBll() {


        transactionDAO = new TransactionDAO();
    }

    public Transaction findTransactionById(int id) {
        Transaction st = transactionDAO.findById(id);
        if (st == null) {
            throw new NoSuchElementException("The transaction with id =" + id + " was not found!");
        }
        return st;
    }



    public Transaction insert(Transaction transaction) throws IllegalAccessException {
        Transaction t = transactionDAO.insert(transaction);
        return t;
    }

    public List<Transaction> findAll(){
        List<Transaction> c = new ArrayList<>();
        c = transactionDAO.findAll();
        return c;
    }

}
