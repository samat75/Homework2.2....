package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Bug");
        createObject("Grasshopper");
        createObject("Butterfly");
    }

    public static Insects createObject(String className) {
        switch (className) {
            case "Bug":
                System.out.println("_______________________");
                Bug bug = new Bug(6, "brown", "Jack", 5);
                bug.print();
                System.out.println("_______________________");
                return bug;
            case "Grasshopper":
                Grasshopper grasshopper = new Grasshopper(2, "green", 2, 15);
                grasshopper.print();
                System.out.println("_______________________");
                return grasshopper;
            case "Aleks":
                Butterfly butterfly = new Butterfly(6, "rainbow", "non-venomous monarch", 15);
                butterfly.print();
                System.out.println("_______________________");
                return butterfly;
            default:
                return null;
        }
    }
}
