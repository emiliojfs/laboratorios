package modulo006.clase001;

public class Sobre {
    private String colorSobre;
    private double precioSobre;
    private Galleta galleta;

    public Sobre(String colorSobre, double precioSobre, String saborGalleta, double precioGalleta) {
        this.colorSobre = colorSobre;
        this.precioSobre = precioSobre;
        this.galleta = new Galleta(saborGalleta,precioGalleta);
    }
    public String getColorSobre() {
        return colorSobre;
    }

    public void setColorSobre(String colorSobre) {
        this.colorSobre = colorSobre;
    }

    public double getPrecioSobre() {
        return precioSobre;
    }

    public void setPrecioSobre(double precioSobre) {
        this.precioSobre = precioSobre;
    }
    public double precioTotal(){
        return this.precioSobre + this.getPrecioGalleta();
    }

    //metodos delegados
    public String getSaborGalleta() {
        return galleta.getSaborGalleta();
    }

    public void setSaborGalleta(String saborGalleta) {
        galleta.setSaborGalleta(saborGalleta);
    }

    public double getPrecioGalleta() {
        return galleta.getPrecioGalleta();
    }

    public void setPrecioGalleta(double precioGalleta) {
        galleta.setPrecioGalleta(precioGalleta);
    }
}
