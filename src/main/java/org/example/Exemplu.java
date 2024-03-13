package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplu {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createTransactionInterface();
        });
    }

    private static void createTransactionInterface() {
        JFrame frame = new JFrame("Afisare Tranzactii");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creare model de tabel
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Suma");
        tableModel.addColumn("Detalii");

        // Adăugare date de tranzacții fictive pentru exemplu
        List<Transaction> transactions = getSampleTransactions();

        for (Transaction transaction : transactions) {
            tableModel.addRow(new Object[]{transaction.getDate(), transaction.getAmount(), transaction.getDetails()});
        }

        // Creare tabel
        JTable transactionTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(transactionTable);

        // Adăugare tabel la fereastra principală
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Configurare fereastră
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static List<Transaction> getSampleTransactions() {
        // Aici poți obține tranzacțiile din sursa ta de date (baza de date, fișier, etc.)
        // Pentru exemplu, vom folosi tranzacții fictive
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("2022-01-01", 100.0, "Cumpărătură online"));
        transactions.add(new Transaction("2022-01-05", -50.0, "Plată factură utilități"));
        transactions.add(new Transaction("2022-01-10", 200.0, "Transfer de la alt cont"));
        return transactions;
    }

    // Clasa de tranzacții
    static class Transaction {
        private String date;
        private double amount;
        private String details;

        public Transaction(String date, double amount, String details) {
            this.date = date;
            this.amount = amount;
            this.details = details;
        }

        public String getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        public String getDetails() {
            return details;
        }
    }
}
