package dao;

import model.Client;

import java.util.List;

public class ClientDAO extends AbstractDAO<Client>{
    public Client findByEmail(String email){
        List<Client> clients = findAll();
        if(clients != null) {
            for (Client c : clients) {
                if (c.getEmail().equals(email))
                    return c;
            }
        }
        return null;
    }
    public Client findByPhone(String phone){
        List<Client> clients = findAll();
        if(clients != null) {
            for (Client c : clients) {
                if (c.isPhone_number().equals(phone))
                    return c;
            }
        }
        return null;
    }
}
