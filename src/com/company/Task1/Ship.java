package com.company.Task1;

public class Ship extends Vehicle {
    private int quantity;
    private int Port;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public Ship() {
    }

    public Ship(String coordinates, String price, String speed, int year, int quantity, int port) {
        super(coordinates, price, speed, year);
        this.quantity = quantity;
        Port = port;
    }

    @Override
    public String toString() {
        return  "Vehicle{" +
                "Plane" + "(" +
                "coordinates='" + super.getCoordinates() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", speed='" + getSpeed() + '\'' +
                ", year=" + getYear() + " " +
                this.Port +  " "
                + this.quantity +
                ")" +
                '}';
    }
}
