package maddux.firstscreen;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPartFormController implements Initializable {
    public RadioButton inHouse;
    public RadioButton outsourced;
    public Label MachineId;

    public TextField PartIdTextField;

    public void onInHouse(ActionEvent actionEvent) {
        MachineId.setText("Machine Id");

    }

    public void onOutsourced(ActionEvent actionEvent) {
        MachineId.setText("Company Name");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    // @Override
   /* public void initialize(URL url, ResourceBundle resourceBundle) {
        PartIdTextFeild.setText(String.valueOf(Inventory));

    } */
}