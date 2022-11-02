package Clase002;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LabelTextfield extends Application{
    Scene miEscena;
    Pane contenedor;
    Label lblnombre,lblapellido;
    TextField txtnombre,txtapellido;

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){
        lblnombre = new Label("Nombres: ");
        lblapellido = new Label("Apellidos: ");
        txtnombre = new TextField();
        txtapellido = new TextField();

        lblnombre.setTranslateX(20);
        lblnombre.setTranslateY(20);
        txtnombre.setTranslateX(90);
        txtnombre.setTranslateY(20);

        lblapellido.setTranslateX(20);
        lblapellido.setTranslateY(60);
        txtapellido.setTranslateX(90);
        txtapellido.setTranslateY(60);

        contenedor = new Pane();
        contenedor.getChildren().addAll(lblnombre,lblapellido,txtnombre,txtapellido);
        miEscena = new Scene(contenedor);
        stage.setTitle("LabelTextfield");
        stage.setMinWidth(300);
        stage.setMinHeight(150);
        stage.setScene(miEscena);
        stage.show();
    }
}