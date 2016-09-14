package seratic.talleres.capacitacion.org.tallerescapacitacion.model;

/**
 * Created by Personal on 13/09/2016.
 */
public class PeliculasVO {
    private String nombre;
    private String sinopsis;
    private String fecha;
    private String url;

    public PeliculasVO() {
    }

    public PeliculasVO(String nombre, String sinopsis, String fecha, String url) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.fecha = fecha;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
