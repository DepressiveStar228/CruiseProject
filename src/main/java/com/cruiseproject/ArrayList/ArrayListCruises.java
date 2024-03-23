//package com.cruiseproject.ArrayList;
//
//import com.cruiseproject.Items.Cruise;
//import com.cruiseproject.Controllers.ReadFileController;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//import java.util.ArrayList;
//
//public class ArrayListCruises {
//    private static ArrayList<Cruise> arrayListOfCruises = ReadFileController.readCruises();
//
//    public static Cruise findCruiseById(int id){
//        for (Cruise cruise : arrayListOfCruises){
//            if (cruise.getId() == id) { return cruise; }
//        }
//        return new Cruise();
//    }
//
//    public static ObservableList<String> getObservableListCruises(){
//        ArrayList<String> names = new ArrayList<>();
//
//        for (Cruise cruise : arrayListOfCruises){
//            String name = cruise.getDepartureLocation().toString() + " -> " + cruise.getArrivalLocation();
//            names.add(name);
//        }
//
//        ObservableList<String> list = FXCollections.observableArrayList(names);
//        return list;
//    }
//
//    public static void updateArrayListOfCruises(){
//        arrayListOfCruises.clear();
//        arrayListOfCruises = ReadFileController.readCruises();
//    }
//
//    public static ArrayList<Cruise> getArrayListOfCruises() {
//        updateArrayListOfCruises();
//        return arrayListOfCruises;
//    }
//}
