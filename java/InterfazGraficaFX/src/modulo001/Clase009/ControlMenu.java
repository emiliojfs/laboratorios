package modulo001.Clase009;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

import javafx.application.Platform;

public class ControlMenu extends Application{
    Scene escena;
    Pane contenedor;
    MenuBar menuBar;
    Menu mnArchivo, mnTutoriales;
    MenuItem mniAbrir, mniGuardar, mniSalir;
    MenuItem mniPhp, mniPython, mniGo;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage escenario) throws Exception {
        menuBar = new MenuBar();

        mnArchivo = new Menu("ARCHIVO");
        mniAbrir = new MenuItem("ABRIR");
        mniGuardar = new MenuItem("GUARDAR");
        mniSalir = new MenuItem("SALIR");
        mniSalir.setOnAction(e->Platform.exit());
        mnArchivo.getItems().addAll(mniAbrir,mniGuardar,new SeparatorMenuItem(),mniSalir);

        mnTutoriales = new Menu("TUTORIALES");
        mniPhp = new MenuItem("PHP");
        mniPython = new MenuItem("PYTHON");
        mniGo = new MenuItem("GO");
        mnTutoriales.getItems().addAll(mniPhp,mniPython,new SeparatorMenuItem(),mniGo);

        menuBar.getMenus().addAll(mnArchivo,mnTutoriales);

        contenedor = new Pane();
        contenedor.getChildren().addAll(menuBar);
        escena = new Scene(contenedor);

        escenario.setTitle("Ejemplo Control Menu");
        escenario.setMinWidth(500);
        escenario.setMinHeight(400);
        escenario.setScene(escena);
        escenario.show();
    }
}
