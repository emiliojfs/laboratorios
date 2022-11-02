package modulo005.clase005;

public class Telefono {
    String telefono;

    public void setTelefono(String telefono) throws TelefonoException {
        if(telefono.length()!=6){
            throw new TelefonoException("Telefono tiene cantidad de digitos incorrectos");
        }
        for (int i=0;i<telefono.length();i++){
            if(!Character.isDigit(telefono.charAt(i))){
                throw new TelefonoException("Telefono solo debe contener numeros");
            }
        }
         this.telefono = telefono;
    }

}
