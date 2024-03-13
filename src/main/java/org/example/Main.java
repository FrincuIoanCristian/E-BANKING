package org.example;

import view.Controller;
import view.LogRegView;

import java.util.logging.Logger;


public class Main {
    protected static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IllegalAccessException {
        LogRegView l = new LogRegView();
        Controller c = new Controller(l);
        l.setVisible(true);
//        AdminView adminView = new AdminView();
        }
    }

