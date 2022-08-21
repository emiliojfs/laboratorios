package modulo002.clase001;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import modulo002.clase001.clases.Alumno;
import modulo002.clase001.clases.Carrera;

public class NuevoAlumnoController implements Initializable {

    private ObservableList<Carrera> carreraList;
    private ObservableList<Alumno> alumnoList;
    private ArrayList<String> errores;
    @FXML private ComboBox<Carrera> cboCarrera;
    @FXML private ListView<Alumno> lstAlumno;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtEdad;
    @FXML private TextField txtIdentidad;
    @FXML private TextField txtCuenta;
    @FXML private TextField txtPromedio;
    @FXML private TextField txtCentroRegional;
    @FXML private DatePicker dpFechaNacimiento;
    @FXML private ToggleGroup genero;
    @FXML private RadioButton rbtMasculino;
    @FXML private RadioButton rbtFemenino;
    @FXML private Button btnGuardar;
    @FXML private Button btnActualizar;
    @FXML private Button btnEliminar;

    public NuevoAlumnoController(){//En el constructor aun no existe los componentes del UI
        errores = new ArrayList<String>();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Metododo que se ejecuta cuando se instanciaron todos los componentes del FXML
        carreraList = FXCollections.observableArrayList();
        alumnoList = FXCollections.observableArrayList();

        carreraList.add(new Carrera(115,"Ing Sistemas",50));
        carreraList.add(new Carrera(120,"Ing Quimica",10));
        carreraList.add(new Carrera(135,"Ing Industrial",20));
        carreraList.add(new Carrera(150,"Ing Civil",30));

        cboCarrera.setItems(carreraList);
        lstAlumno.setItems(alumnoList);

        lstAlumno.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Alumno>() {
            @Override
            public void changed(ObservableValue<? extends Alumno> arg0, Alumno alumnoAnterior, Alumno alumnoSeleccionado) {

                if(alumnoSeleccionado!=null) {

                    System.out.println("Se selecciono un elemento de la lista");
                    System.out.println("Anterior: " + alumnoAnterior);
                    System.out.println("Nuevo: " + alumnoSeleccionado);

                    txtIdentidad.setText(alumnoSeleccionado.getIdentidad());
                    txtNombre.setText(alumnoSeleccionado.getNombre());
                    txtApellido.setText(alumnoSeleccionado.getApellido());
                    txtEdad.setText(String.valueOf(alumnoSeleccionado.getEdad()));
                    dpFechaNacimiento.setValue(LocalDate.parse(alumnoSeleccionado.getFechaNacimiento()));
                    cboCarrera.getSelectionModel().select(alumnoSeleccionado.getCarrera());
                    txtCentroRegional.setText(alumnoSeleccionado.getCentroRegional());

                    if (alumnoSeleccionado.getGenero().equals("MASCULINO"))
                        rbtMasculino.setSelected(true);
                    else
                        rbtFemenino.setSelected(true);

                    txtCuenta.setText(alumnoSeleccionado.getCuenta());
                    txtPromedio.setText(String.valueOf(alumnoSeleccionado.getPromedio()));

                    btnGuardar.setDisable(true);
                    btnActualizar.setDisable(false);
                    btnEliminar.setDisable(false);
                }
            }
        });
    }

    @FXML
    public void limpiar(){
        txtIdentidad.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEdad.setText(null);
        dpFechaNacimiento.setValue(null);
        cboCarrera.getSelectionModel().select(null);
        txtCentroRegional.setText(null);
        genero.selectToggle(null);
        txtCuenta.setText(null);
        txtPromedio.setText(null);

        btnGuardar.setDisable(false);
        btnActualizar.setDisable(true);
        btnEliminar.setDisable(true);
        lstAlumno.getSelectionModel().clearSelection();
    }

    @FXML
    public void guardar (){
        validar();
        if(errores.size()>0){
            String cadenaErrores;
        }

        alumnoList.add(
                new Alumno(
                        txtIdentidad.getText(),
                        txtNombre.getText(),
                        txtApellido.getText(),
                        Integer.parseInt(txtEdad.getText()),
                        dpFechaNacimiento.getValue().toString(),
                        cboCarrera.getSelectionModel().getSelectedItem(),
                        null,
                        txtCentroRegional.getText(),
                        ((RadioButton)genero.getSelectedToggle()).getText(),
                        txtCuenta.getText(),
                        Double.parseDouble(txtPromedio.getText())
                )
        );

        limpiar();
    }

    @FXML
    public void actualizar(){
        alumnoList.set(
                lstAlumno.getSelectionModel().getSelectedIndex(),
                new Alumno(
                        txtIdentidad.getText(),
                        txtNombre.getText(),
                        txtApellido.getText(),
                        Integer.parseInt(txtEdad.getText()),
                        dpFechaNacimiento.getValue().toString(),
                        cboCarrera.getSelectionModel().getSelectedItem(),
                        null,
                        txtCentroRegional.getText(),
                        ((RadioButton)genero.getSelectedToggle()).getText(),
                        txtCuenta.getText(),
                        Double.parseDouble(txtPromedio.getText())
                )
        );
        limpiar();
    }

    @FXML
    public void eliminar(){
        alumnoList.remove(lstAlumno.getSelectionModel().getSelectedIndex());
        limpiar();
    }

    public void validar(){
        if (txtCuenta.getText().isEmpty()){
            errores.add("El campo cuenta es obligatorio");
        }
        if (txtIdentidad.getText().isEmpty()){
            errores.add("El campo identidad es obligatorio");
        }
    }
}