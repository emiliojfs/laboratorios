package modulo001.clase005;

public class Libro {
    private String titulo;
    private int totalPaginas;
    private int paginaActual=1;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    //SobreCarga
    public void avanzarPagina(){
        avanzarPagina(1);
    }

    public void avanzarPagina(int paginas){
        this.paginaActual=this.paginaActual+paginas;
    }

    public void avanzarCapitulo(){
        this.avanzarPagina(20);
    }
}
