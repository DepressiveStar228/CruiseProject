package com.cruiseproject.Controllers;

import com.cruiseproject.ArrayList.ArrayListCruises;
import com.cruiseproject.ArrayList.ArrayListTickets;
import com.cruiseproject.Items.Cruise;
import com.cruiseproject.Items.Ticket;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReadFileController {
    private static String filenameCruises = "D:\\Projects\\lab1\\CruiseProject\\src\\main\\resources\\com\\cruiseproject\\DB_cruises.txt";
    private static String filenameTickets = "D:\\Projects\\lab1\\CruiseProject\\src\\main\\resources\\com\\cruiseproject\\DB_tickets.txt";

    public static ArrayList<Cruise> readCruises(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filenameCruises), StandardCharsets.UTF_8))) {
            String line;
            ArrayList<Cruise> arrayListCruises = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                int id = 0;
                String depart = "";
                String arrival = "";
                String port = "";
                int price = 0;
                int countPass = 0;
                int maxCountPass = 0;

                for (String part : parts) {
                    String[] keyValue = part.split(":");
                    String key = keyValue[0];
                    String value = keyValue[1];

                    switch (key) {
                        case "id":
                            id = Integer.parseInt(value);
                            break;
                        case "dep":
                            depart = value;
                            break;
                        case "arr":
                            arrival = value;
                            break;
                        case "port":
                            port = value;
                            break;
                        case "pr":
                            price = Integer.parseInt(value);
                            break;
                        case "cpass":
                            countPass = Integer.parseInt(value);
                            break;
                        case "maxcpass":
                            maxCountPass = Integer.parseInt(value);
                            break;
                        default:
                            break;
                    }
                }

                Cruise cruise = new Cruise(id, depart, arrival, port, price, countPass, maxCountPass);
                arrayListCruises.add(cruise);
            }

            return arrayListCruises;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Ticket> readTickets(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filenameTickets), StandardCharsets.UTF_8))) {
            String line;
            ArrayList<Ticket> arrayListTickets = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                int id = 0;
                int cruise = 0;
                int numbPlace = 0;

                for (String part : parts) {
                    String[] keyValue = part.split(":");
                    String key = keyValue[0];
                    String value = keyValue[1];

                    switch (key) {
                        case "id":
                            id = Integer.parseInt(value);
                            break;
                        case "cru":
                            cruise = Integer.parseInt(value);
                            break;
                        case "npl":
                            numbPlace = Integer.parseInt(value);
                            break;
                        default:
                            break;
                    }
                }

                Ticket ticket = new Ticket(id, ArrayListCruises.findCruiseById(cruise), numbPlace);
                arrayListTickets.add(ticket);
            }

            return arrayListTickets;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
