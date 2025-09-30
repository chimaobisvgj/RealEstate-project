package org.example;

public class Main {
    public static void main(String[] args) {
        // Create one property
        RealEstate house = new RealEstate("Budapest", 1000, 100, 4, RealEstate.Genre.FAMILYHOUSE);

        // Print the property
        System.out.println(house);

        // Print the total price
        System.out.println("Total price: " + house.getTotalPrice());

        // Print average sqm per room
        System.out.println("Average sqm per room: " + house.averageSqmPerRoom());

        // Apply a 10% discount and print again
        house.makeDiscount(10);
        System.out.println("After 10% discount:");
        System.out.println(house);
    }
}