package modulo001.Clase008;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControlListView extends Application{
    Scene escena;
    Pane contenedor;
    Label lblPregunta, lblSeleccion;
    Button btnNuevo, btnAgregar, btnEliminar;
    TextField txtElemento;
    ListView<String> lstLenguajes;
    String[] arrayLenguajes={"Java","c++","PHP","C#"};

    @Override
    public void start(Stage escenario) throws Exception {
        lblPregunta = new Label("Que lenguaje de programación prefieres?: ");
        lblSeleccion=new Label("Aun no elegiste :(");
        lstLenguajes=new ListView<>();
        btnNuevo = new Button("Nuevo");
        btnAgregar = new Button("Agregar");
        btnEliminar = new Button("Eliminar");
        txtElemento = new TextField();

        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        lblSeleccion.setTranslateX(20);
        lblSeleccion.setTranslateY(270);
        lstLenguajes.setTranslateX(20);
        lstLenguajes.setTranslateY(40);
        lstLenguajes.setMaxSize(200,200);
        btnNuevo.setTranslateX(300);
        btnNuevo.setTranslateY(50);
        btnNuevo.setPrefSize(120,30);
        txtElemento.setTranslateX(300);
        txtElemento.setTranslateY(100);
        txtElemento.setVisible(false);
        btnAgregar.setTranslateX(300);
        btnAgregar.setTranslateY(150);
        btnAgregar.setPrefSize(120,30);
        btnEliminar.setTranslateX(300);
        btnEliminar.setTranslateY(200);
        btnEliminar.setPrefSize(120,30);


        lstLenguajes.getItems().addAll(arrayLenguajes);
        lstLenguajes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String anterior, String actual) {
                lblSeleccion.setText("Has seleccionado : "+actual);
            }
        });

        btnNuevo.setOnAction(e->nuevo());
        btnAgregar.setOnAction(e->agregar());
        btnEliminar.setOnAction(e->eliminar());

        contenedor = new Pane();
        contenedor.getChildren().addAll(lblPregunta,lblSeleccion,lstLenguajes,btnNuevo,btnAgregar,btnEliminar,txtElemento);
        escena = new Scene(contenedor);

        escenario.setTitle("Ejemplo Control ListView");
        escenario.setMinWidth(500);
        escenario.setMinHeight(400);
        escenario.setScene(escena);
        escenario.show();
    }

    private void nuevo(){
        txtElemento.setVisible(true);
        btnAgregar.setDisable(false);
    }
    private void agregar(){
        if(txtElemento.getText().equals("")) {
            lblSeleccion.setText("El texto esta vacio");
        }else{
            lstLenguajes.getItems().add(txtElemento.getText());
            txtElemento.setText("");
            txtElemento.setVisible(false);
            btnAgregar.setDisable(true);
        }

    }
    private void eliminar(){
        int indice;
        indice = lstLenguajes.getSelectionModel().getSelectedIndex();

        if (indice!=-1){
            lstLenguajes.getItems().remove(indice);
            lstLenguajes.getSelectionModel().select(-1);
        }
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}