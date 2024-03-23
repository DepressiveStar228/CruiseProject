package com.cruiseproject.Controllers;

import com.cruiseproject.ArrayList.ArrayListCruises;
import com.cruiseproject.Items.Cruise;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private ScrollPane scrollPane = new ScrollPane();

    @FXML
    protected void addCruiseItem(){
        ArrayList<Cruise> cruiseArrayList = ArrayListCruises.getArrayListOfCruises();
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

    }

    @FXML
    protected void onAddTicketClick(){
        AddTicketController.addTicket();
    }

    @FXML
    protected void onEditClick(){
        EditTicketController.editTicket();
    }

    @FXML
    protected void onFindClick(){
        FindTicketController.findTicket();
    }

    @FXML
    protected void onDeleteTicketClick() {
        DeleteTicketController.delTicket();
    }
}