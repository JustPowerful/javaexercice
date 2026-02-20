package org.example;

public class Invoice {
    int id;
    String date;
    Purchase[] purchaseTable;
    int numberOfPurchases;

    Invoice(int id, String date, Purchase[] purchaseTable, int numberOfPurchases) {
        this.id = id;
        this.date = date;
        this.purchaseTable = purchaseTable;
        this.numberOfPurchases = numberOfPurchases;
    }

    double montantTotal() {
        double total = 0;
        for (Purchase purchase : purchaseTable) {
            total += purchase.prixTotal();
        }
        return total;
    }

    void afficher() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("Number of purchases: " + numberOfPurchases);
        System.out.println("------ Purchases ------");

        for (int i = 0; i < numberOfPurchases; i++) {
            purchaseTable[i].afficher();
            System.out.println("-----------------------");
        }

        System.out.println("Total invoice amount: " + montantTotal());
    }
}
