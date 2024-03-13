package view;

import bll.BankAccountBll;
import bll.CardBll;
import bll.ClientBll;
import bll.TransactionBll;
import model.Account;
import model.Card;
import model.Client;
import model.Transaction;
import validator.Validators;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class Controller {
    private LogRegView logRegView;
    SendMoneyView sendMoneyView = new SendMoneyView();
    RegisterView registerView = new RegisterView();
    PinView pinView = new PinView();

    ClientBll c = new ClientBll();
    Client client;

    BankAccountBll a = new BankAccountBll();
    CardBll cardBll = new CardBll();

    TransactionBll transactionBll = new TransactionBll();
    Account account;
    Card card;
    AdminView adminView = new AdminView();


    MainView mainView = new MainView();
    Validators validators = new Validators();

    public Controller(LogRegView logRegView){
        this.logRegView = logRegView;
        logRegView.addRegisterButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logRegView.dispose();
                registerView.setVisible(true);
                System.out.println("ppp");

            }
        });
        registerView.addBackLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerView.dispose();
                logRegView.setVisible(true);
            }
        });

        logRegView.addLoginButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client = c.findByEmail(logRegView.getEmail());
                } catch (IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
                if(client == null){
                    logRegView.showError("No such email registered!");
                }
                else if(client.getPassword().equals(logRegView.getPassword())){
                    if(client.getEmail().equals("ADMIN")){
                        logRegView.dispose();
                        String s = client.isFirst_name() + " " + client.isLast_name();
                        List<Client> clients = c.findAll();
                        ArrayList<String> strings = new ArrayList<>();
                        for(Client c1: clients){
                            if(!c1.getEmail().equals("ADMIN")) {
                                strings.add(c1.getEmail());
                            }
                        }
                        adminView.setComboBox(strings);
                        adminView.setVisible(true);
                    }else {
                        logRegView.dispose();
                        mainView.setLabelFirstName(client.isFirst_name());
                        mainView.setLabelLastName(client.isLast_name());
                        mainView.setVisible(true);
                    }
                }
                else{
                    logRegView.showError("Incorrect password! Try again!");
                }

            }
        });

        adminView.addModifyBalanceListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField value = new JTextField();
                Object[] message = {"Balance:", value};
                int option = JOptionPane.showConfirmDialog(null, message, "Autentificare", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    double newBalance = 0;
                    try {
                        newBalance = Double.parseDouble(value.getText());
                        if (newBalance < 0) {
                            throw new Exception();
                        }
                    }catch (Exception exception){
                        JOptionPane.showMessageDialog(null, "Invalid balance!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try {
                        Client client1 = c.findByEmail(adminView.getComboBox());
                        Account account1 = a.findAccountByClientId(client1.isId());
                        ArrayList<String> field = new ArrayList<String>();
                        ArrayList<Object> values = new ArrayList<Object>();
                        field.add("balance");
                        values.add(newBalance);
                        values.add(account1.isId());
                        a.update(account1, field, values);
                        JOptionPane.showMessageDialog(null, "Success!!", "", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        adminView.addViewTransactionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client1 = null;
                try {
                     client1 = c.findByEmail(adminView.getComboBox());
                } catch (IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
                transactionsView(client1);
            }
        });

        adminView.addLogOutListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminView.dispose();
                logRegView.setVisible(true);
            }
        });

        mainView.addCheckBalanceListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                account = a.findAccountByClientId(client.isId());
                mainView.showError("Balance: " + account.getBalance() + " lei");

                }

        });

        registerView.addRegisterButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fName = registerView.getFirstName();
                String lName = registerView.getLastName();
                String password = registerView.getPassword();
                String confirmPass = registerView.getConfirmPassword();
                String email = registerView.getEmail();
                String phone = registerView.getPhoneNumber();

                List<Client> clients = new ArrayList<>();
                clients = c.findAll();
                if(!validators.phoneValidate(phone, clients)){
                    registerView.showError("Invalid phone!");
                    return;
                }
                if(!validators.passwordValidate(password, confirmPass)){
                    registerView.showError("Invalid password!");
                    return;
                }
                if(!validators.emailValidator(email,clients)){
                    registerView.showError("Invalid email!");
                    return;
                }

                    int id = 0;
                    for(Client cl:clients){
                        if(id<cl.isId()){
                            id = cl.isId();
                        }
                    }
                    client = new Client(id+1, fName, lName, email, phone, password);

                    try {
                        c.insert(client);
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }

                    List<Account> accounts = a.findAll();
                    int accountId = 0;
                    if(accounts != null){
                        for(Account acc:accounts){
                            if(acc.isId() > accountId){
                                accountId = acc.isId();
                            }
                        }
                    }
                    try {
                        a.insert(new Account(accountId+1, id+1, 0));
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }


                    String card_number = "";
                    for(int i=0;i<16;i++) {
                        Random rand = new Random();
                        int r = rand.nextInt(10);
                        card_number += String.valueOf(r);
                    }

                    List<Card> cards = cardBll.findAll();
                    int cardId = 0;
                    for(Card c:cards){
                        if(cardId < c.isId()){
                            cardId = c.isId();
                        }
                    }
                    LocalDate localDate = LocalDate.now().plusYears(4);

                    try {
                        cardBll.insert(new Card(cardId+1,card_number, accountId+1, "0000", localDate.toString()));
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }

                    registerView.dispose();
                    mainView.setVisible(true);
                    mainView.setLabelFirstName(client.isFirst_name());
                    mainView.setLabelLastName(client.isLast_name());
                }

        });

        mainView.addLogOutListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.dispose();
                logRegView.setVisible(true);
            }
        });
        mainView.addPersonalDataListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account account1 = a.findAccountByClientId(client.isId());
                Card card1 = cardBll.findByAccountId(account1.isId());
                JPasswordField passwordField = new JPasswordField();
                Object[] message = {"PIN:", passwordField};

                String detalii = "";
                detalii += "Name: " + client.isFirst_name() + " " + client.isLast_name() + '\n';
                detalii += "Phone number: " + client.isPhone_number() + '\n';
                detalii += "Email: " + client.getEmail() + '\n';
                detalii += "Card number: " + card1.isCard_number() + '\n';

                int option = JOptionPane.showConfirmDialog(null, message, "Autentificare", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    String enteredPassword = new String(passwordField.getPassword());
                    if (enteredPassword.equals(card1.isSecurity_code())) {
                        JOptionPane.showMessageDialog(null, detalii, "Personal data", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong PIN!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        });
        mainView.addChangePinListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pinView.setVisible(true);
            }
});
        pinView.addConfirmButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newPin = pinView.getNewPin();
                String currentPin = pinView.getCurrentPin();
                Account account1 = a.findAccountByClientId(client.isId());
                Card card1 = cardBll.findByAccountId(account1.isId());
                if(card1.isSecurity_code().equals(currentPin)){
                    ArrayList<String> field = new ArrayList<String>();
                    ArrayList<Object> value = new ArrayList<Object>();
                    field.add("security_code");
                    value.add(newPin);
                    value.add(card1.isId());
                    cardBll.update(card1, field, value);
                    pinView.dispose();

                }else{
                    mainView.showError("Wrong PIN!!");
                }
            }
        });
        mainView.addSendMoneyListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mainView.addTransactionLitener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transactionsView(client);
            }
        });

        mainView.addSendMoneyListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMoneyView.setVisible(true);
            }
        });

        sendMoneyView.addSendListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pin = sendMoneyView.getPin();
                String phone = sendMoneyView.getPhone();
                double amount = 0;
                Account ac1 = a.findAccountByClientId(client.isId());
                Card card1 = cardBll.findByAccountId(ac1.isId());
                Client client1 = null;
                List<Client> clients = c.findAll();
                boolean verif = false;
                for(Client c:clients){
                    if(c.isPhone_number().equals(phone)){
                        verif = true;
                        break;
                    }
                }
                try {
                    if(!verif){
                        throw new IllegalAccessException();
                    }
                    client1 = c.findByPhone(phone);
                    if(!pin.equals(card1.isSecurity_code())){
                        throw new Exception();
                    }
                    amount = sendMoneyView.getAmount();
                    if(amount < 5){
                        throw new NumberFormatException();
                    }
                    if(amount > ac1.getBalance()){
                        mainView.showError("Not enough money!");
                        return;
                    }
                } catch (IllegalAccessException ex) {
                    mainView.showError("Phone number does not exist!");
                    return;
                }catch (NumberFormatException ex){
                    mainView.showError("Invalid amount!");
                    return;
                } catch (Exception ex){
                    mainView.showError("PIN incorrect!");
                    return;
                }
                if(client1 != null) {
                    Account ac2 = a.findAccountByClientId(client1.isId());
                    ArrayList<String> field = new ArrayList<String>();
                    ArrayList<Object> value = new ArrayList<Object>();
                    field.add("balance");
                    value.add(String.valueOf(ac1.getBalance() - amount));
                    value.add(ac1.isId());
                    a.update(ac1, field, value);
                    value.clear();
                    value.add(String.valueOf(ac2.getBalance() + amount));
                    value.add(ac2.isId());
                    a.update(ac2, field, value);
                    String localDate = LocalDate.now().toString();

                    int transactionId = 0;
                    List<Transaction> transactions = transactionBll.findAll();
                    for(Transaction tr: transactions){
                        if(tr.isId() > transactionId){
                            transactionId = tr.isId();
                        }
                    }
                    Transaction transaction = new Transaction(transactionId + 1, ac1.isId(), ac2.isId(), amount, localDate);
                    try {
                        transactionBll.insert(transaction);
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                    sendMoneyView.dispose();
                }


         }
        });
    }
    private void transactionsView(Client client){
        List<Transaction> transactions = transactionBll.findAll();
        JFrame frame = new JFrame("Afisare Tranzactii");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Action");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Person");
        tableModel.addColumn("Phone");
        tableModel.addColumn("Date");

        for(Transaction transaction:transactions){
            double money = transaction.isAmount();
            String date = transaction.isDate();
            String action = "";
            String name = "";
            String phone = "";
            Account account1 = a.findAccountById(transaction.isAccount_id_r());
            Account account2 = a.findAccountById(transaction.isAccount_id_g());
            boolean ok = false;
            if(account1.isClient_id() == client.isId()){
                action = "Received";
                Client client2 = c.findClientById(account2.isClient_id());
                name = client2.isLast_name() + " " + client2.isFirst_name();
                phone = client2.isPhone_number();
                ok = true;
            }else if(account2.isClient_id() == client.isId()){
                action = "Sent";
                Client client1 = c.findClientById(account1.isClient_id());
                name = client1.isLast_name() + " " + client1.isFirst_name();
                phone = client.isPhone_number();
                ok = true;
            }
            if(ok) {
                tableModel.addRow(new Object[]{action, money, name, phone, date});
            }
        }


        JTable transactionTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(transactionTable);

        // Adăugare tabel la fereastra principală
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Configurare fereastră
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
