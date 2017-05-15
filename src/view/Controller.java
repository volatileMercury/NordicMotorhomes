package view;

import databaseConnection.Staff;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Employee;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    Staff staff= new Staff();
    Employee actor;
    @FXML
    Button signInButton;
    @FXML
    TextField signInTextField;
    @FXML
    PasswordField signInPasswordField;
    @FXML

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void signIn(Event event){
        String username = signInTextField.getText();
        int password = Integer.parseInt(signInPasswordField.getText());
        actor=staff.signIn(username, password);
        System.out.println(actor.toString());
    }
}
