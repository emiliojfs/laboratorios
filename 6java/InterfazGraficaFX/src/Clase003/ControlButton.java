package Clase003;
import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.Lighting;

public class ControlButton extends Application{
    Scene miEscena;
    Pane contenedor;
    Button btnNuevo, btnGuardar,btnCancelar;
    Label lblmensaje;

    URL rutaNuevo, rutaGuardar, rutaCancelar;
    Image imgNuevo, imgGuardar, imgCancelar;

    DropShadow sombrear;
    Lighting iluminar;
    Reflection reflejar;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage miEsceneario){
        lblmensaje = new Label("Mensaje");
        btnNuevo = new Button("Nuevo");
        btnGuardar = new Button("Guardar");
        btnCancelar = new Button("Cancelar");

        btnNuevo.setMinWidth(100);
        btnNuevo.setMaxWidth(150);
        btnNuevo.setTranslateX(20);
        btnNuevo.setTranslateY(20);
        btnGuardar.setMinWidth(100);
        btnGuardar.setMaxWidth(150);
        btnGuardar.setTranslateX(120);
        btnGuardar.setTranslateY(20);
        btnCancelar.setMinWidth(100);
        btnCancelar.setMaxWidth(150);
        btnCancelar.setTranslateX(220);
        btnCancelar.setTranslateY(20);

        personalizarImagenesBoton();
        personalizarEfectosBoton();

        btnNuevo.setOnAction(e->ActionBtnNuevo());
        btnGuardar.setOnAction(e->ActionBtnGuardar());
        btnCancelar.setOnAction(e->ActionBtnCancelar());

        lblmensaje.setTranslateX(120);
        lblmensaje.setTranslateY(70);

        contenedor = new Pane();
        contenedor.getChildren().addAll(btnNuevo,btnCancelar,btnGuardar,lblmensaje);
        miEscena = new Scene(contenedor);
        miEsceneario.setTitle("ControlButton");
        miEsceneario.setMinWidth(350);
        miEsceneario.setMinHeight(150);
        miEsceneario.setScene(miEscena);
        miEsceneario.show();
    }
    public void ActionBtnGuardar(){
        lblmensaje.setText("Pulsaste el boton Guardar");
    }
    public void ActionBtnNuevo(){
        lblmensaje.setText("Pulsaste el boton Nuevo");
    }
    public void ActionBtnCancelar(){
        lblmensaje.setText("Pulsaste el boton Cancelar");
    }

    public void personalizarImagenesBoton(){
        rutaNuevo = getClass().getResource("add_32px.png");
        imgNuevo = new Image(rutaNuevo.toString(),32,32,false,true);
        btnNuevo.setGraphic(new ImageView(imgNuevo));

        rutaGuardar = getClass().getResource("save_32px.png");
        imgGuardar = new Image(rutaGuardar.toString(),32,32,false,true);
        btnGuardar.setGraphic(new ImageView(imgGuardar));

        rutaCancelar = getClass().getResource("cancel_32px.png");
        imgCancelar = new Image(rutaCancelar.toString(),32,32,false,true);
        btnCancelar.setGraphic(new ImageView(imgCancelar));
    }

    public void personalizarEfectosBoton(){
        sombrear = new DropShadow();
        reflejar = new Reflection();
        iluminar = new Lighting();

        btnNuevo.addEventHandler(MouseEvent.MOUSE_ENTERED,e->btnNuevo.setEffect(iluminar));
        btnNuevo.addEventHandler(MouseEvent.MOUSE_EXITED,e->btnNuevo.setEffect(null));
        btnGuardar.addEventHandler(MouseEvent.MOUSE_ENTERED,e->btnGuardar.setEffect(sombrear));
        btnGuardar.addEventHandler(MouseEvent.MOUSE_EXITED,e->btnGuardar.setEffect(null));
        btnCancelar.addEventHandler(MouseEvent.MOUSE_ENTERED,e->btnCancelar.setEffect(reflejar));
        btnCancelar.addEventHandler(MouseEvent.MOUSE_EXITED,e->btnCancelar.setEffect(null));

        btnNuevo.setStyle("-fx-font:14 Arial; -fx-base:#33A5FF");
        btnGuardar.setStyle("-fx-font:14 Arial; -fx-base:#2FD332");
        btnCancelar.setStyle("-fx-font:14 Arial; -fx-base:#D34D2F");
    }
}
