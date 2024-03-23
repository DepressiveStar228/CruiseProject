package com.cruiseproject.Controllers;

import com.cruiseproject.ArrayList.ArrayListTickets;
import com.cruiseproject.Items.Ticket;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EditTicketController {
    private static Stage window = new Stage();
    private static Pane pane = new Pane();
    private static Label labelCruiseId = new Label("Введіть ID квитка: ");
    private static TextField textField = new TextField();
    private static Button findButton = new Button("Знайти");
    private static Button editButton = new Button("Редагувати");
    private static Label labelNumbPlace = new Label("Місце");
    private static Label labelPrice = new Label("Місце");
    private static Label labelResult = new Label("");
    private static TextField textFieldNumbPlace = new TextField();
    private static TextField textFieldPrice = new TextField();

    private static void printFindTicket(Ticket ticket){
        String selectedTicket = "Ваш квиток \nID: " + ticket.getId() + "\nШлях: " + ticket.getCruise().getDepartureLocation() + " -> " +
                ticket.getCruise().getArrivalLocation() + "\nПорт: " + ticket.getCruise().getPort() + "\nЦіна: " +
                ticket.getCruise().getPrice() + "грн\nМісце: " + ticket.getNumbPlace();
        labelResult.setText(selectedTicket);
        labelResult.setVisible(true);
        editButton.setVisible(true);
        labelCruiseId.setVisible(false);
        textField.setVisible(false);
    }

    public static void editTicket(){
        ArrayListTickets.updateArrayListOfTickets();
        window.initModality(Modality.APPLICATION_MODAL);
        hide();

        findButton.setOnAction(event -> {
            hide();
            String boxText = textField.getText();

            if (boxText.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Попередження");
                alert.setHeaderText(null);
                alert.setContentText("Ви не ввели ID квитка");
                alert.showAndWait();
            }
            else {
                try {
                    Ticket ticket = ArrayListTickets.findTicketById(Integer.parseInt(textField.getText()));

                    if (ticket != null){
                        printFindTicket(ticket);
                    }
                    else {
                        String selectedTicket = "Квиток ID:" + textField.getText();
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Помилка");
                        alert.setHeaderText(null);
                        alert.setContentText(selectedTicket + " не знайдено");
                        alert.showAndWait();
                    }
                }
                catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Помилка");
                    alert.setHeaderText(null);
                    alert.setContentText("Некоректний формат ID квитка");
                    alert.showAndWait();
                }
            }
        });

        /*editButton.setOnAction(event -> {
            String boxText = textField.getText();

            if (boxText.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Попередження");
                alert.setHeaderText(null);
                alert.setContentText("Ви не ввели ID квитка");
                alert.showAndWait();
                window.close();
            }
            else {
                try {
                    Ticket ticketBox = ArrayListTickets.findTicketById(Integer.parseInt(textField.getText()));

                    if (ticketBox != null){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Успішне знайдено");
                        alert.setHeaderText(null);
                        alert.setContentText(selectedTicket);
                        alert.showAndWait();
                        window.close();
                    }
                    else {
                        String selectedTicketBox = "Квиток ID:" + textField.getText();
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Помилка");
                        alert.setHeaderText(null);
                        alert.setContentText(selectedTicketBox + " не знайдено");
                        alert.showAndWait();
                    }
                }
                catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Помилка");
                    alert.setHeaderText(null);
                    alert.setContentText("Некоректний формат ID квитка");
                    alert.showAndWait();
                }
            }
        }); */

        labelCruiseId.relocate(20, 20);
        labelResult.relocate(20,20);
        textField.relocate(20, 40);
        textFieldNumbPlace.relocate(60, 80);
        editButton.relocate(180, 250);
        findButton.relocate(120, 250);
        pane.getChildren().addAll(labelCruiseId, labelResult, labelPrice, labelNumbPlace, textField, textFieldNumbPlace, findButton, editButton);

        Scene scene = new Scene(pane, 400, 300);
        window.setScene(scene);
        window.setTitle("Редагувати значення в Array List");
        window.showAndWait();
    }

    private static void hide(){
        labelNumbPlace.setVisible(false);
        labelPrice.setVisible(false);
        labelResult.setVisible(false);
        textFieldNumbPlace.setVisible(false);
        textFieldPrice.setVisible(false);
        editButton.setVisible(false);
    }
}
