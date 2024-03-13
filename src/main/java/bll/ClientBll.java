package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import dao.ClientDAO;
import model.Client;

import validator.ClientEmailValidator;
import validator.Validate;


public class ClientBll {


    private List<Validate<Client>> validators;
    private ClientDAO clientDAO;

    public ClientBll() {
        validators = new ArrayList<Validate<Client>>();
        validators.add(new ClientEmailValidator());

        clientDAO = new ClientDAO();
    }

    public Client findClientById(int id) {
        Client st = clientDAO.findById(id);
        if (st == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");

        }
        return st;
    }

    public List<Client> findAll(){
        List<Client> c = new ArrayList<>();
        c = clientDAO.findAll();
        return c;
    }
    public Client insert(Client client) throws IllegalAccessException {
        Client c = clientDAO.insert(client);
        return c;
    }

    public Client delete(Client client, int i) throws IllegalAccessException {
        Client c = clientDAO.delete(i, client);
        return c;
    }
//    public Client update(Card card) throws IllegalAccessException {
//        Client c = clientDAO.update(card);
//        return c;
//    }
    public Client findByEmail(String email) throws IllegalAccessException{
        return clientDAO.findByEmail(email);
    }

    public Client findByPhone(String phone) throws IllegalAccessException{
        return clientDAO.findByPhone(phone);
    }


    /*public String[][] findAll(){
        List<Client> clients= clientDAO.findAll();
        int noOfFields = clientDAO.noOfFields();
        String[][] table = new String[clients.size()][noOfFields];
        int i = 0;
        for(Client e: clients){
            table[i][0] = String.valueOf(e.getId());
            table[i][1] = e.getName();
            table[i][2] = e.getAddress();
            table[i][3] = e.getEmail();
            table[i][4] = String.valueOf(e.getAge());
            i++;

        }
        return table;
    }*/

}
