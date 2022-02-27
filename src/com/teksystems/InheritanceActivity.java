package com.teksystems;

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager peter = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000L);
        System.out.println(peter.calculateSalary());

        Trainees jack = new Trainees(29846L, "Jack", "Mumbai India", 442085L, 45000L);
        System.out.println(jack.calculateSalary());
    }
}
