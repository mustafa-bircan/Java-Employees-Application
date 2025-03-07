package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runMain();
    }

    public static void runMain() {
        Healthplan basicPlan = new Healthplan(1, "Basic Plan", Plan.BASIC);
        Healthplan advancedPlan = new Healthplan(2, "Advanced Plan", Plan.ADVANCED);
        Healthplan proPlan = new Healthplan(2, "PRO Plan", Plan.PRO);

        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", new String[3]);
        employee.addHealthPlan(0, basicPlan.getName());
        employee.addHealthPlan(1, advancedPlan.getName());

        Company company = new Company(1, "Tech Corp", 50000, new String[5]);
        company.addEmployee(0, employee.getFullName());

        System.out.println(basicPlan);
        System.out.println(advancedPlan);
        System.out.println(proPlan);
        System.out.println(employee);
        System.out.println(company);
    }

}