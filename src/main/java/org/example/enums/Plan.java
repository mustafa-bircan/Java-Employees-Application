package org.example.enums;
//Sağlık planlarının adlarını ve fiyatlarını tutacak..
public enum Plan {
    BASIC("BASIC", 100.0),
    ADVANCED ("ADVANCED", 200.0),
    PRO ("PRO", 200.0);

    private String name;
    private double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
