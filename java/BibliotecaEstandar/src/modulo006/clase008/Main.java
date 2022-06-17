package modulo006.clase008;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException {
        String path="C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\archivoencriptado.txt";
        //encriparFichero(path);
        desencriparFichero(path);
    }

    public static void encriparFichero(String path) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException {

        KeyGenerator generador = KeyGenerator.getInstance("DES");
        generador.init(56,new SecureRandom());
        Key clave = generador.generateKey();

        System.out.println(Base64.getEncoder().encodeToString(clave.getEncoded()));

        Cipher cifrador = Cipher.getInstance("DES");
        cifrador.init(Cipher.ENCRYPT_MODE,clave);

        String mensaje = "Este es un mensaje confidencial";

        FileOutputStream salida = new FileOutputStream(path);
        CipherOutputStream salidaCifrada = new CipherOutputStream(salida, cifrador);
        BufferedWriter salidaTexto = new BufferedWriter(new OutputStreamWriter(salidaCifrada));
        salidaTexto.write(mensaje);
        salidaTexto.close();
    }

    public static void desencriparFichero(String path) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        String claveTexto = "/VjBB1LfmFE=";//clave que genera encriptarFichero()

        byte[] clave = Base64.getDecoder().decode(claveTexto);
        Key key = new SecretKeySpec(clave, "DES");
        Cipher cifrador = Cipher.getInstance("DES");
        cifrador.init(Cipher.DECRYPT_MODE,key);
        InputStream in;
        BufferedReader lector = new BufferedReader(new InputStreamReader(new CipherInputStream(new FileInputStream(path),cifrador)));
        System.out.println(lector.readLine());
    }
}
