package Clase001;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PrimerJavaFX extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){
        Text txt = new Text("Bienvenido a JAVAFX");

        VBox contenedor = new VBox();
        contenedor.getChildren().add(txt);
        contenedor.setMinSize(350,250);

        Scene scene = new Scene(contenedor);

        stage.setTitle("PrimeraJavaFX");
        stage.setMinHeight(500);
        stage.setMinWidth(500);
        stage.setScene(scene);
        stage.show();
    }
}
