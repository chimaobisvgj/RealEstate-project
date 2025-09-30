package org.example;

// Question 1, 2, 3 combined solution

// PropertyInterface
interface PropertyInterface {
    void makeDiscount(int percent);       // reduce price per sqm
    int getTotalPrice();                  // total price with city modifiers
    double averageSqmPerRoom();           // sqm / numberOfRooms
    String toString();                    // listing property details
}

// RealEstate class
public class RealEstate implements PropertyInterface {
    protected String city;
    protected double price;          // price per sqm
    protected int sqm;               // area in sqm
    protected double numberOfRooms;
    protected Genre genre;

    // enum Genre
    public enum Genre {
        FAMILYHOUSE, CONDOMINIUM, FARM
    }

    // constructor
    public RealEstate(String city, double price, int sqm, double numberOfRooms, Genre genre) {
        this.city = city;
        this.price = price;
        this.sqm = sqm;
        this.numberOfRooms = numberOfRooms;
        this.genre = genre;
    }

    // makeDiscount
    @Override
    public void makeDiscount(int percent) {
        price -= price * percent / 100.0;
    }

    // getTotalPrice (with city modifiers)
    @Override
    public int getTotalPrice() {
        double basePrice = price * sqm;
        switch (city.toLowerCase()) {
            case "budapest":
                basePrice *= 1.30;
                break;
            case "debrecen":
                basePrice *= 1.20;
                break;
            case "nyíregyháza":
                basePrice *= 1.15;
                break;
            default:
                // no modifier for other cities
        }
        return (int) Math.round(basePrice);
    }

    // averageSqmPerRoom
    @Override
    public double averageSqmPerRoom() {
        if (numberOfRooms == 0) return 0;
        return (double) sqm / numberOfRooms;
    }

    // toString
    @Override
    public String toString() {
        return "RealEstate {" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", sqm=" + sqm +
                ", numberOfRooms=" + numberOfRooms +
                ", genre=" + genre +
                ", totalPrice=" + getTotalPrice() +
                ", avgSqmPerRoom=" + String.format("%.2f", averageSqmPerRoom()) +
                '}';
    }
}

// PanelInterface
interface PanelInterface {
    boolean hasSameAmount(RealEstate other);   // compare total price
    int roomPrice();                           // avg cost per room (ignoring modifiers)
}

