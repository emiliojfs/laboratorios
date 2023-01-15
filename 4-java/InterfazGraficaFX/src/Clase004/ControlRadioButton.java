package Clase004;
import java.net.URL;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControlRadioButton extends Application{
    Scene escena;
    Pane panel;
    ToggleGroup tgEquipo;
    RadioButton rbAmerica, rbSportingCristal, rbColoColo;
    Label lblEquipo;
    Image imgsc,imgcc,imgam;
    URL rutasc,rutacc,rutaam;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage escenario) throws Exception {
        lblEquipo = new Label("Tu equipo favorito: ");
        tgEquipo =  new ToggleGroup();
        rbAmerica = new RadioButton("America");
        rbColoColo = new RadioButton("ColoColo");
        rbSportingCristal = new RadioButton("SportingCristal");

        lblEquipo.setTranslateX(10);
        lblEquipo.setTranslateY(10);

        rbAmerica.setTranslateX(20);
        rbAmerica.setTranslateY(40);
        rbAmerica.setToggleGroup(tgEquipo);
        rbSportingCristal.setTranslateX(20);
        rbSportingCristal.setTranslateY(90);
        rbSportingCristal.setToggleGroup(tgEquipo);
        rbColoColo.setTranslateX(20);
        rbColoColo.setTranslateY(140);
        rbColoColo.setToggleGroup(tgEquipo);

        asignarImagen();

        panel = new Pane();
        panel.getChildren().addAll(lblEquipo,rbAmerica,rbColoColo,rbSportingCristal);
        escena = new Scene(panel);

        escenario.setTitle("ControlRadioButton");
        escenario.setMinWidth(300);
        escenario.setMinHeight(250);
        escenario.setScene(escena);
        escenario.show();
    }

    public void asignarImagen(){
        rutasc = getClass().getResource("img_sc.png");
        imgsc = new Image(rutasc.toString(),32,32,false,true);
        rbSportingCristal.setGraphic(new ImageView(imgsc));

        rutaam = getClass().getResource("img_am.png");
        imgam = new Image(rutaam.toString(),32,32,false,true);
        rbAmerica.setGraphic(new ImageView(imgam));

        rutacc = getClass().getResource("img_cc.png");
        imgcc = new Image(rutacc.toString(),28,28, false,true);
        rbColoColo.setGraphic(new ImageView(imgcc));
    }
}
