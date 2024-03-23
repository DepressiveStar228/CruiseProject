//package com.cruiseproject.Controllers;
//
//import com.cruiseproject.ArrayList.ArrayListCruises;
//import com.cruiseproject.ArrayList.ArrayListTickets;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.Label;
//import javafx.scene.layout.Pane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//
//public class AddTicketController {
//
//    public static void addTicket(){
//        ArrayListTickets.updateArrayListOfTickets();
//        Stage window = new Stage();
//        window.initModality(Modality.APPLICATION_MODAL);
//        Pane pane = new Pane();
//        Label labelCruise = new Label("Виберіть круїз");
//        ComboBox<String> comboBoxCruises = new ComboBox<String>();
//        comboBoxCruises.setItems(ArrayListCruises.getObservableListCruises());
//        Button orderButton = new Button("Замовити");
//        orderButton.setVisible(false);
//
//        comboBoxCruises.setOnAction(event -> {
//            if (comboBoxCruises.getValue() != null) {
//                orderButton.setVisible(true);
//            } else {
//                orderButton.setVisible(false);
//            }
//        });
//
//        orderButton.setOnAction(event -> {
//            String selectedCruise = comboBoxCruises.getValue();
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Успішне замовлення");
//            alert.setHeaderText(null);
//            alert.setContentText("Замовлення " + selectedCruise + " успішно оформлено.");
//            alert.showAndWait();
//            window.close();
//        });
//
//        labelCruise.relocate(20, 20);
//        comboBoxCruises.relocate(20, 40);
//        orderButton.relocate(160, 250);
//        pane.getChildren().addAll(labelCruise, comboBoxCruises, orderButton);
//
//        Scene scene = new Scene(pane, 400, 300);
//        window.setScene(scene);
//        window.setTitle("Додати значення до Array List");
//        window.showAndWait();
//    }
//}
