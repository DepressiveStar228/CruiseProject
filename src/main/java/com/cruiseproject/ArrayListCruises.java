package com.cruiseproject;

import java.util.ArrayList;

public class ArrayListCruises {
    private static ArrayList<Cruise> arrayListOfCruise = ReadFileController.getArrayListCruises();

    public static ArrayList<Cruise> getArrayListOfCruise() {
        return arrayListOfCruise;
    }

    public static void setArrayListOfCruise(ArrayList<Cruise> arrayListOfCruise) {
        ArrayListCruises.arrayListOfCruise = arrayListOfCruise;
    }
}
