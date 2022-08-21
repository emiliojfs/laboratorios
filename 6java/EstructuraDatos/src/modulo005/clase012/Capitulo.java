package modulo005.clase012;

import java.util.Objects;

public class Capitulo {
    private String titulo;
    private int paginas;

    public Capitulo(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capitulo capitulo = (Capitulo) o;
        return paginas == capitulo.paginas &&
                titulo.equals(capitulo.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, paginas);
    }
}
