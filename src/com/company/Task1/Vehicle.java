package com.company.Task1;

public class Vehicle {
    private String coordinates;
    private String price;
    private String speed;
    private int year;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle() {
    }


    public Vehicle(String coordinates, String price, String speed, int year) {
        this.coordinates = coordinates;
        this.price = "Price: " + price;
        this.speed = speed + "km";
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "coordinates='" + coordinates + '\'' +
                ", price='" + price + '\'' +
                ", speed='" + speed + '\'' +
                ", year=" + year +
                '}';
    }
}
