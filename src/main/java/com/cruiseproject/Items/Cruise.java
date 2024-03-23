package com.cruiseproject.Items;

public class Cruise implements Comparable<Cruise> {
    private int id;
    private static int nextId = 1;
    private String departureLocation;
    private String arrivalLocation;
    private String port;
    private int price;
    private int countPassengers;
    private int maxCountPassengers;

    public Cruise(){};

    public Cruise(String depart, String arrival, String port, int price, int countPassengers, int maxCountPassengers){
        if (depart.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (arrival.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (port.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректна ціна");
        }
        if (countPassengers < 0) {
            throw new IllegalArgumentException("Помилка. Некоректна кількість пасажирів");
        }
        if (maxCountPassengers <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректна максимальна кількість пасажирів");
        }

        this.id = nextId;
        nextId++;
        this.departureLocation = depart;
        this.arrivalLocation = arrival;
        this.port = port;
        this.price = price;
        this.countPassengers = countPassengers;
        this.maxCountPassengers = maxCountPassengers;
    }

    public Cruise(int id, String depart, String arrival, String port, int price, int countPassengers, int maxCountPassengers){
        if (id <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректний id");
        }
        if (depart.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (arrival.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (port.isEmpty()){
            throw new IllegalArgumentException("Помилка. Рядок пустий");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректна ціна");
        }
        if (countPassengers < 0) {
            throw new IllegalArgumentException("Помилка. Некоректна кількість пасажирів");
        }
        if (maxCountPassengers <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректна максимальна кількість пасажирів");
        }

        this.id = id;
        nextId++;
        this.departureLocation = depart;
        this.arrivalLocation = arrival;
        this.port = port;
        this.price = price;
        this.countPassengers = countPassengers;
        this.maxCountPassengers = maxCountPassengers;
    }

    public boolean buyTicket(){
        if ((this.countPassengers + 1) > this.maxCountPassengers){ return false; }
        else {
            this.countPassengers++;
            return true;
        }
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

    public String getPort() {
        return port;
    }

    public int getPrice() {
        return price;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
