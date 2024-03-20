package com.cruiseproject;

public class Cruise implements Comparable<Cruise> {
    private int id;
    private static int nextId = 0;
    private String departureLocation;
    private String arrivalLocation;
    private String airline;
    private int price;

    public Cruise(String depart, String arrival, String airline, int price){
        if (depart.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (arrival.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (airline.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректна ціна");
        }

        this.id = nextId++;
        nextId++;
        this.departureLocation = depart;
        this.arrivalLocation = arrival;
        this.airline = airline;
        this.price = price;
    }

    @Override
    public int compareTo(Cruise cruise) {
        return 0;
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob){
            return true;
        }
        if (!(ob instanceof Cruise cruise)){
            return false;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public String getAirline() {
        return airline;
    }

    public int getPrice() {
        return price;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
