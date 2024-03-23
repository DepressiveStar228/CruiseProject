//package com.cruiseproject.ArrayList;
//
//import com.cruiseproject.Controllers.ReadFileController;
//import com.cruiseproject.Items.Cruise;
//import com.cruiseproject.Items.Ticket;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//import java.util.ArrayList;
//
//public class ArrayListTickets {
//    private static ArrayList<Ticket> arrayListOfTickets = ReadFileController.readTickets();
//
//    public static Ticket findTicketById(int id){
//        for (Ticket ticket : arrayListOfTickets){
//            if (ticket.getId() == id) { return ticket; }
//        }
//        return null;
//    }
//
//    public static void updateArrayListOfTickets(){
//        arrayListOfTickets.clear();
//        arrayListOfTickets = ReadFileController.readTickets();
//    }
//
//    public static ObservableList<String> getObservableListTickets(){
//        ArrayList<String> names = new ArrayList<>();
//
//        for (Ticket ticket : arrayListOfTickets){
//            String name = ticket.getCruise().getDepartureLocation().toString() + " -> " + ticket.getCruise().getArrivalLocation();
//            names.add(name);
//        }
//
//        ObservableList<String> list = FXCollections.observableArrayList(names);
//        return list;
//    }
//
//    public static ArrayList<Ticket> getArrayListOfTickets() {
//        return arrayListOfTickets;
//    }
//}
