package org.example.enums;
//Sağlık planlarının adlarını ve fiyatlarını tutacak..
public enum Plan {
    BASIC("BASIC", 100),
    ADVANCED ("ADVANCED", 200),
    PRO ("PRO", 200);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
