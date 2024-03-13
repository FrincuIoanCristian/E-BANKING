package bll;



import dao.CardDAO;
import dao.DepositDAO;
import model.Card;
import model.Deposit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DepositBll {

    private DepositDAO depositDAO;

    public DepositBll() {


        depositDAO = new DepositDAO();
    }

    public Deposit findDepositById(int id) {
        Deposit st = depositDAO.findById(id);
        if (st == null) {
            throw new NoSuchElementException("The deposit with id =" + id + " was not found!");
        }
        return st;
    }



    public Deposit insert(Deposit deposit) throws IllegalAccessException {
        Deposit d = depositDAO.insert(deposit);
        return d;
    }

    public List<Deposit> findAll(){
        List<Deposit> d = new ArrayList<>();
        d = depositDAO.findAll();
        return d;
    }

}
