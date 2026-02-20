package org.example;

public class Purchase {
    int id;
    Product product;
    int number;
    double reduction; // pourcentage de reduction

    Purchase(int id, Product product, int number, double reduction) {
        this.id = id;
        this.product = product;
        this.number = number;
        this.reduction = reduction;
    }

    double prixTotal() {
        double total = product.prixTTC() * number;
        return total - (total * reduction / 100);
    }

    void afficher() {
        System.out.println("Purchase ID: " + id);
        System.out.println("Product: " + product.name);
        System.out.println("Number: " + number);
        System.out.println("Reduction: " + reduction + "%");
        System.out.println("Total price: " + prixTotal());
    }
}
