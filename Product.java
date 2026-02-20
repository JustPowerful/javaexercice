package org.example;

public class Product {
    String reference;
    String name;
    String type;
    Double priceExclVAT;
    Double Tax; // Pourcentage

    Product(String reference, String name, String type, Double priceExclVAT, Double Tax) {
        this.reference = reference;
        this.name = name;
        this.type = type;
        this.priceExclVAT = priceExclVAT;
        this.Tax = Tax;
    }

    double prixTTC() {
        return this.priceExclVAT + (this.priceExclVAT * this.Tax / 100);
    }

    void afficher() {
        System.out.println("Reference: " + this.reference + " Name: " + this.name + " Type: " + this.type + " Price VAT : " + this.priceExclVAT + " Tax : " + this.Tax);
    }
}
