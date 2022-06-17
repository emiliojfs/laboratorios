package modulo001.Clase005;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;

public class ControlCheckbox extends Application{
    Scene escena;
    Pane panel;
    Label lblCarta, lblOrden;
    CheckBox chkCafe, chkTe, chkAgua, chkLeche;
    Button btnOrdenar;
    String orden;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage escenario) throws Exception {
        lblCarta = new Label("Que desea Tomar su mesa");
        lblOrden = new Label("");
        chkAgua = new CheckBox("Agua");
        chkCafe = new CheckBox("Café");
        chkLeche = new CheckBox("Leche");
        chkTe=new CheckBox("Té");
        btnOrdenar = new Button("Ordenar");

        lblCarta.setTranslateX(20);
        lblCarta.setTranslateY(20);
        chkAgua.setTranslateX(20);
        chkAgua.setTranslateY(50);
        chkCafe.setTranslateX(20);
        chkCafe.setTranslateY(80);
        chkLeche.setTranslateX(20);
        chkLeche.setTranslateY(110);
        chkTe.setTranslateX(20);
        chkTe.setTranslateY(140);
        btnOrdenar.setTranslateX(20);
        btnOrdenar.setTranslateY(200);
        lblOrden.setTranslateX(20);
        lblOrden.setTranslateY(250);

        btnOrdenar.setOnAction(e->mostrarOrden(chkAgua,chkCafe,chkLeche,chkTe));

        panel = new Pane();
        panel.getChildren().addAll(lblCarta,chkAgua,chkCafe,chkLeche,chkTe,btnOrdenar,lblOrden);
        escena = new Scene(panel);

        escenario.setTitle("ControlCheckBox");
        escenario.setMinWidth(300);
        escenario.setMinHeight(500);
        escenario.setScene(escena);
        escenario.show();
    }

    private void mostrarOrden(CheckBox chkAgua, CheckBox chkCafe, CheckBox chkLeche, CheckBox chkTe) {
        orden="Tú orden es: ";

        if(chkAgua.isSelected())
            orden=orden+"Agua--->";
        if(chkCafe.isSelected())
            orden=orden+"Café--->";
        if(chkLeche.isSelected())
            orden=orden+"Leche--->";
        if(chkTe.isSelected())
            orden=orden+"Té--->";
        if (!chkAgua.isSelected() && !chkCafe.isSelected() && !chkLeche.isSelected() && !chkTe.isSelected())
            orden="No ordenaste nada :(";
        lblOrden.setText(orden);
    }
}
