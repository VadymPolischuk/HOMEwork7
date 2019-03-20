package com.company.Task1;

public class Car extends Vehicle {
    private String markCar;
    private int quantity;

    public String getMarkCar() {
        return markCar;
    }

    public void setMarkCar(String markCar) {
        this.markCar = markCar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Car() {
    }

    public Car(String coordinates, String price, String speed, int year, String markCar, int quantity) {
        super(coordinates, price, speed, year);
        this.markCar = markCar;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Plane" + "(" +
                "coordinates='" + super.getCoordinates() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", speed='" + getSpeed() + '\'' +
                ", year=" + getYear() + " " +
                this.markCar + '\''
                + this.quantity +
                ")" +
                '}';
    }
}
