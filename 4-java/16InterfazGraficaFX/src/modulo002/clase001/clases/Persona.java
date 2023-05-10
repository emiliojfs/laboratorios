package modulo002.clase001.clases;

public abstract class Persona {
    protected String Identidad;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String fechaNacimiento;
    protected Carrera carrera;
    protected String clases[];
    protected String centroRegional;
    protected String genero;

    public Persona(String identidad, String nombre, String apellido, int edad, String fechaNacimiento, Carrera carrera, String[] clases, String centroRegional, String genero) {
        Identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.clases = clases;
        this.centroRegional = centroRegional;
        this.genero = genero;
    }

    public String getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(String identidad) {
        Identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String[] getClases() {
        return clases;
    }

    public void setClases(String[] clases) {
        this.clases = clases;
    }

    public String getCentroRegional() {
        return centroRegional;
    }

    public void setCentroRegional(String centroRegional) {
        this.centroRegional = centroRegional;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
