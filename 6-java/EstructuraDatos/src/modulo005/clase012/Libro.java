package modulo005.clase012;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    //relacion entre ambas clases
    private List<Capitulo> listCapitulo;

    public List<Capitulo> getListCapitulo() {
        return listCapitulo;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.listCapitulo = new ArrayList<Capitulo>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean contieneCapitulo(Capitulo c){
        return listCapitulo.contains(c);
    }

    public boolean cambiarCapitulo(Capitulo viejo, Capitulo nuevo){
        int posicion = listCapitulo.indexOf(viejo);
        listCapitulo.set(posicion,nuevo);
        if(posicion!=-1){
            return true;
        }else {
            return false;
        }
    }

    public void addCapitulo(Capitulo c){
        //pertenece al interface collection
        listCapitulo.add(c);
    }

    public int totalCapitulos(){
        //pertenece al interface collection
        return listCapitulo.size();
    }

    public int totalPaginas(){
        int totalPaginas=0;
        //recorre cada objeto almacenado en "listCapitulo"
        for(Capitulo c:listCapitulo){
            totalPaginas=totalPaginas+c.getPaginas();
        }
        return totalPaginas;
    }
}
