package modulo005.clase001;

public class Persona {
   //atributos
   //acceso default
   String paisNacimiento;
   String regionNacimiento;

   //acceso publico
   public String nombre;
   public String apellidoM;
   public String apellidoP;

   //acceso protegido
   protected boolean estadoCivil;
   protected boolean donacionOrganos;

   //acceso privado
   private int edad;
   private int movil;

   //metodos
   //metodos publicos de acceso a atributos privados


   public int getMovil() {
      return movil;
   }
   public void setMovil(int movil) {
      this.movil = movil;
   }

   public int getEdad() {
      return edad;
   }
   public void setEdad(int edad) {
      validarEdad(edad);
   }

   //metodo privado
   private void validarEdad(int edad){
      if (edad<0 || edad>130){
         System.out.println("Edad invalida");
      }else{
         this.edad=edad;
      }
   }
}
