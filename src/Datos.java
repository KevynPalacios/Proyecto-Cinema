
import java.io.Serializable;


public class Datos implements Serializable{

    int sala;
    String pelicula;
    String nombre;
    int asientos;
    int c;
    float precio;
    float total;

    public Datos() {
    }

    public Datos(int sala, String pelicula, String nombre, int asientos, float total) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.nombre = nombre;
        this.asientos = asientos;
        this.total = total;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
