package Clase006;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

public class ControlChoiceBox extends Application{
    Scene escena;
    Pane contenedor;
    ChoiceBox<String> ccbCarreras;
    Label lblPregunta, lblSeleccion, lblMensaje;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage escenario) throws Exception {
        lblPregunta = new Label("¿Qué carrera estas estudiando?: ");
        lblMensaje = new Label("Tú carrera es: ");
        lblSeleccion = new Label();
        ccbCarreras = new ChoiceBox<>();

        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        ccbCarreras.setTranslateX(20);
        ccbCarreras.setTranslateY(50);
        ccbCarreras.getItems().addAll("Ing. Sistemas","Ing. Software","Ing. Informatica");
        lblMensaje.setTranslateX(20);
        lblMensaje.setTranslateY(160);
        lblSeleccion.setTranslateX(100);
        lblSeleccion.setTranslateY(160);

        lblSeleccion.textProperty().bind(ccbCarreras.valueProperty());// OJO

        contenedor = new Pane();
        contenedor.getChildren().addAll(lblPregunta,ccbCarreras,lblMensaje,lblSeleccion);
        escena = new Scene(contenedor);
        escenario.setTitle("Ejemplo Control ChoiceBox");
        escenario.setMinWidth(450);
        escenario.setMinHeight(350);
        escenario.setScene(escena);
        escenario.show();
    }
}