package dao;

import model.Account;
import model.Card;

import java.util.List;

public class CardDAO extends AbstractDAO<Card> {
    public Card findByAccountId(int accountId){
        List<Card> cards = findAll();
        if(cards != null){
            for(Card c:cards){
                if(c.isAccount_id() == accountId)
                    return c;
            }
        }
        return null;
    }
}
