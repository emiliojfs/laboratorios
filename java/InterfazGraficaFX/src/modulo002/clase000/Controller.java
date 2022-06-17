package modulo002.clase000;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {


    @FXML
    private Label lblNombre;

    @FXML
    private Label lblApellido;

    @FXML
    private Label lblEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEdad;

    @FXML
    private Button btnGuardar;

    @FXML
    void ver(ActionEvent event) {
        System.out.println(txtNombre.getText());
        System.out.println(txtApellido.getText());
        System.out.println(txtEdad.getText());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
