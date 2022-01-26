package lab02;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeViewController implements Initializable {

    @FXML
    private ComboBox<String> floorsComboBox;

    @FXML
    private TextField colorField;

    @FXML
    private TextField descField;


    @FXML
    private TextField priceField;

    @FXML
    private Label msgLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msgLabel.setText("");
        floorsComboBox.getItems().addAll(Home.getFloors());
    }

    @FXML
    private void createHome() {

        String floors = floorsComboBox.getSelectionModel().getSelectedItem();
        String color = colorField.getText();
        String desc = descField.getText();


        double price = -1;
        try {
            price = Double.parseDouble(priceField.getText());
        } catch (Exception e) {
            msgLabel.setText("Price can be numbers only");
        }
        if (price != -1) {
            Home obj1 = new Home(floors,color, desc, price);
            msgLabel.setText(obj1.toString());
        }
    }
}