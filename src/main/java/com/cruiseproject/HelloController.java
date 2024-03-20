package com.cruiseproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private ScrollPane scrollPane = new ScrollPane();
    private static ArrayList<Cruise> cruiseArrayList = ArrayListCruises.getArrayListOfCruise();

    @FXML
    protected void addCruiseItem(){
        Pane cruiseItem = new Pane();
        cruiseItem.setPrefWidth(scrollPane.getPrefWidth());

        Label label = new Label();
        label.setText(String.valueOf(cruiseArrayList.get(0).getId()));
        label.setLayoutX(10);
        label.setLayoutY(10);

        cruiseItem.getChildren().add(label);

        if (scrollPane.getContent() != null) {
            double newY = scrollPane.getVvalue() * 120;
            cruiseItem.setLayoutY(newY);

            ((AnchorPane) scrollPane.getContent()).getChildren().add(cruiseItem);
        }
        else {
            scrollPane.setContent(cruiseItem);
        }
    }

    @FXML
    protected void onPrintClick() {
        addCruiseItem();
    }
}