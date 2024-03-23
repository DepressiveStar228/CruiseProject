package com.cruiseproject.Items;

public class Ticket {
    private int id;
    private static int nextId = 1;
    private Cruise cruise;
    private int numbPlace;

    public Ticket(){}

    public Ticket(Cruise cruise, int numbPlace){
        if (numbPlace <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректне місце");
        }

        this.id = nextId;
        nextId++;
        this.cruise = cruise;
        this.numbPlace = numbPlace;
    }

    public Ticket(int id, Cruise cruise, int numbPlace){
        if (id <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректний id");
        }
        if (numbPlace <= 0) {
            throw new IllegalArgumentException("Помилка. Некоректне місце");
        }

        this.id = id;
        nextId++;
        this.cruise = cruise;
        this.numbPlace = numbPlace;
    }

    public int getId() {
        return id;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public int getNumbPlace() {
        return numbPlace;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public void setNumbPlace(int numbPlace) {
        this.numbPlace = numbPlace;
    }
}
