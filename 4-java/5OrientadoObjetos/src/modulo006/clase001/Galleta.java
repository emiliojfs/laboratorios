package modulo006.clase001;

public class Galleta {
    private String saborGalleta;
    private double precioGalleta;

    public Galleta(String saborGalleta, double precioGalleta) {
        this.saborGalleta = saborGalleta;
        this.precioGalleta = precioGalleta;
    }

    public String getSaborGalleta() {
        return saborGalleta;
    }

    public void setSaborGalleta(String saborGalleta) {
        this.saborGalleta = saborGalleta;
    }

    public double getPrecioGalleta() {
        return precioGalleta;
    }

    public void setPrecioGalleta(double precioGalleta) {
        this.precioGalleta = precioGalleta;
    }
}
