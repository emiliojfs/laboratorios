package clase007;

public class SentenciaSaltoContinue {
    public static void main(String[] args) {
       int x=0;
       String resultado="";

       do{
           x=x+1;
           if(x==3){
               System.out.println("Saltando iteracion actual");
                continue;
           }
            resultado = "Iteracion: "+ x;
           System.out.println("Resultado: "+resultado);
        }while (x<10);


        //La sentencia continue únicamente puede aparecer en una estructura de repetición.
        // Cuando se ejecuta un continue, se deja de ejecutar el resto del bloque de sentencias
        // de la estructura iterativa para ---volver al inicio--- de ésta.
    }
}
