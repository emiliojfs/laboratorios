package modulo004.clase004;

public class Ingeniero extends Persona {

    private String especialidad;
    private int anioExpericencia;
    private String skill;

    public Ingeniero(String nombre, String apellido, int anioNacimiento, String especialidad, int anioExpericencia, String skill) {
        super(nombre, apellido, anioNacimiento);
        this.especialidad = especialidad;
        this.anioExpericencia = anioExpericencia;
        this.skill = skill;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnioExpericencia() {
        return anioExpericencia;
    }

    public void setAnioExpericencia(int anioExpericencia) {
        this.anioExpericencia = anioExpericencia;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void correr(){
        System.out.println("Ingeniero: " + getNombre()+" "+getApellido()+" "+"corre a 5km/h");
    }
}
