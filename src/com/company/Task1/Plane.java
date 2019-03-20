package com.company.Task1;

public class Plane extends Vehicle {
    private String height;
    private int quantity;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Plane() {
        super();
    }

    public Plane(String coordinates, String price, String speed, int year, String height, int quantity) {
        super(coordinates, price, speed, year);
        this.height = "Height: " + height;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Plane" + "(" +
                "coordinates='" + super.getCoordinates() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", speed='" + getSpeed() + '\'' +
                ", year=" + getYear() +
                this.height + '\''
                + this.quantity +
                ")" +
                '}';
    }
}
