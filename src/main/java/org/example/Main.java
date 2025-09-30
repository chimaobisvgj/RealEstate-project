package org.example;

public class Main {
    public static void main(String[] args) {
        // Create RealEstate objects
        RealEstate house = new RealEstate("Budapest", 1000, 120, 4, RealEstate.Genre.FAMILYHOUSE);
        RealEstate condo = new RealEstate("Debrecen", 900, 80, 3, RealEstate.Genre.CONDOMINIUM);
        RealEstate farm = new RealEstate("Miskolc", 700, 200, 5, RealEstate.Genre.FARM);

        // Print original data
        System.out.println("=== Original Properties ===");
        System.out.println(house);
        System.out.println(condo);
        System.out.println(farm);

        // Apply discount on house
        house.makeDiscount(10); // 10% discount on price per sqm
        System.out.println("\n=== After Discount on House ===");
        System.out.println(house);

        // Show total price
        System.out.println("\n=== Total Prices ===");
        System.out.println("House total price: " + house.getTotalPrice());
        System.out.println("Condo total price: " + condo.getTotalPrice());
        System.out.println("Farm total price: " + farm.getTotalPrice());

        // Show average sqm per room
        System.out.println("\n=== Average sqm per room ===");
        System.out.println("House avg sqm/room: " + house.averageSqmPerRoom());
        System.out.println("Condo avg sqm/room: " + condo.averageSqmPerRoom());
        System.out.println("Farm avg sqm/room: " + farm.averageSqmPerRoom());
    }
}