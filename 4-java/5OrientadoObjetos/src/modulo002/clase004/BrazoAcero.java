package modulo002.clase004;

//fabrica de muchos tipologias de 'brazos'
public class BrazoAcero implements Rotable {

    //rotar no es lo mismo que girar (funcionalidad de otros brazos)
    @Override
    public void rotar(){
        System.out.println("El brazo de acero rota a 70 v/m");
    }

}
