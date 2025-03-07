package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro < 0) {
            this.giro = 0;
            System.out.println("Giro değeri sıfırdan küçük olamaz!");
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index.");
            return;
        }
        if (developerNames[index] != null) {
            System.out.println("Bu index zaten dolu.");
        } else {
            developerNames[index] = name;
            System.out.println("Developer " + name + " eklendi.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro değeri sıfırdan küçük olamaz.");
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String toString() {
        String developerNamesStr = String.join(", ", developerNames);
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=[" + developerNamesStr + "]}";
    }
}