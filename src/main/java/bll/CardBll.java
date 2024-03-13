package bll;



import dao.CardDAO;
import model.Card;
import model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CardBll {

    private CardDAO cardDAO;

    public CardBll() {


        cardDAO = new CardDAO();
    }

    public Card findCardById(int id) {
        Card st = cardDAO.findById(id);
        if (st == null) {
            throw new NoSuchElementException("The card with id =" + id + " was not found!");
        }
        return st;
    }



    public Card insert(Card card) throws IllegalAccessException {
        Card c = cardDAO.insert(card);
        return c;
    }

    public List<Card> findAll(){
        List<Card> c = new ArrayList<>();
        c = cardDAO.findAll();
        return c;
    }

    public Card findByAccountId(int id){
        return cardDAO.findByAccountId(id);
    }

    public void update(Card card, ArrayList<String> fields, ArrayList<Object> value){
        cardDAO.update(card, fields, value);
    }

}
