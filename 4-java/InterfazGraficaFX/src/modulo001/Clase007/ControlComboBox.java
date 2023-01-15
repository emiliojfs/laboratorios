package modulo001.Clase007;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;//----------
import javafx.beans.value.ObservableValue;//----------
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;

public class ControlComboBox extends Application{
    Scene escena;
    Pane contenedor;
    Label lblPregunta, lblSeleccion;
    ComboBox<String> cmbCarreras;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage escenario) throws Exception {
        lblPregunta = new Label("¿Qué carrera estas estudiando?: ");
        lblSeleccion = new Label();
        cmbCarreras = new ComboBox<>();

        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        lblSeleccion.setTranslateX(100);
        lblSeleccion.setTranslateY(160);
        lblSeleccion.setText(cmbCarreras.getSelectionModel().getSelectedItem());

        cmbCarreras.setTranslateX(20);
        cmbCarreras.setTranslateY(60);
        cmbCarreras.getItems().addAll("Ing. Sistemas","Ing. Software","Ing. Informatica");

        cmbCarreras.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String anterior, String actual) {
                lblSeleccion.setText(actual);
            }
        });



        contenedor = new Pane();
        contenedor.getChildren().addAll(lblPregunta,lblSeleccion,cmbCarreras);
        escena = new Scene(contenedor);
        escenario.setTitle("Ejemplo Control ComboBox");
        escenario.setMinWidth(450);
        escenario.setMinHeight(350);
        escenario.setScene(escena);
        escenario.show();
    }
}