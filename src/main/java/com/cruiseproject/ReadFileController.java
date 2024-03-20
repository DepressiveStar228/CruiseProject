package com.cruiseproject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReadFileController {
    private static String filename = "D:\\Projects\\lab1\\CruiseProject\\src\\main\\resources\\com\\cruiseproject\\DB_cruises.txt";
    private static ArrayList<Cruise> arrayListCruises = new ArrayList<>();

    private static void readCruises(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                String depart = "";
                String arrival = "";
                String airline = "";
                int price = 0;

                for (String part : parts) {
                    String[] keyValue = part.split(":");
                    String key = keyValue[0];
                    String value = keyValue[1];

                    switch (key) {
                        case "dep":
                            depart = value;
                            break;
                        case "arr":
                            arrival = value;
                            break;
                        case "air":
                            airline = value;
                            break;
                        case "pr":
                            price = Integer.parseInt(value);
                            break;
                        default:
                            break;
                    }
                }

                Cruise cruise = new Cruise(depart, arrival, airline, price);
                arrayListCruises.add(cruise);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cruise> getArrayListCruises() {
        readCruises();
        return arrayListCruises;
    }

    public static void setNameFile(String filename) {
        ReadFileController.filename = filename;
    }
}
