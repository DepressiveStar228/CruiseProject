//package com.cruiseproject.Controllers;
//
//import com.cruiseproject.ArrayList.ArrayListCruises;
//import com.cruiseproject.ArrayList.ArrayListTickets;
//import com.cruiseproject.Items.Ticket;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.Pane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//
//public class FindTicketController {
//    public static void findTicket(){
//        ArrayListTickets.updateArrayListOfTickets();
//        Stage window = new Stage();
//        window.initModality(Modality.APPLICATION_MODAL);
//        Pane pane = new Pane();
//        Label labelCruise = new Label("Введіть ID квитка: ");
//        TextField textField = new TextField();
//        Button findButton = new Button("Знайти");
//
//        findButton.setOnAction(event -> {
//            String boxText = textField.getText();
//
//            if (boxText.isEmpty()){
//                Alert alert = new Alert(Alert.AlertType.WARNING);
//                alert.setTitle("Попередження");
//                alert.setHeaderText(null);
//                alert.setContentText("Ви не ввели ID квитка");
//                alert.showAndWait();
//            }
//            else {
//                try {
//                    Ticket ticket = ArrayListTickets.findTicketById(Integer.parseInt(textField.getText()));
//
//                    if (ticket != null){
//                        String selectedTicket = "Ваш квиток \nID: " + ticket.getId() + "\nШлях: " + ticket.getCruise().getDepartureLocation() + " -> " +
//                                ticket.getCruise().getArrivalLocation() + "\nПорт: " + ticket.getCruise().getPort() + "\nЦіна: " +
//                                ticket.getCruise().getPrice() + "грн\nМісце: " + ticket.getNumbPlace();
//                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                        alert.setTitle("Успішне знайдено");
//                        alert.setHeaderText(null);
//                        alert.setContentText(selectedTicket);
//                        alert.showAndWait();
//                        window.close();
//                    }
//                    else {
//                        String selectedTicket = "Квиток ID:" + textField.getText();
//                        Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setTitle("Помилка");
//                        alert.setHeaderText(null);
//                        alert.setContentText(selectedTicket + " не знайдено");
//                        alert.showAndWait();
//                    }
//                }
//                catch (NumberFormatException e) {
//                    Alert alert = new Alert(Alert.AlertType.ERROR);
//                    alert.setTitle("Помилка");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Некоректний формат ID квитка");
//                    alert.showAndWait();
//                }
//            }
//        });
//
//        labelCruise.relocate(20, 20);
//        textField.relocate(20, 40);
//        findButton.relocate(160, 250);
//        pane.getChildren().addAll(labelCruise, textField, findButton);
//
//        Scene scene = new Scene(pane, 400, 300);
//        window.setScene(scene);
//        window.setTitle("Знайти значення в Array List");
//        window.showAndWait();
//    }
//}
