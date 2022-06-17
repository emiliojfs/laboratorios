package modulo002.clase001.clases;

import java.util.Arrays;

public class Alumno extends Persona {
    private String cuenta;
    private double promedio;

    public Alumno(String identidad, String nombre, String apellido, int edad, String fechaNacimiento, Carrera carrera, String[] clases, String centroRegional, String genero, String cuenta, double promedio) {
        super(identidad, nombre, apellido, edad, fechaNacimiento, carrera, clases, centroRegional, genero);
        this.cuenta = cuenta;
        this.promedio = promedio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "cuenta='" + cuenta + '\'' +
                ", promedio=" + promedio +
                ", Identidad='" + Identidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", carrera=" + carrera +
                ", clases=" + Arrays.toString(clases) +
                ", centroRegional='" + centroRegional + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
