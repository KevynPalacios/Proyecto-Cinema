
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Datos implements Serializable, Comparable<Datos>{

    static ArrayList<Integer> ids = new ArrayList<>();
    int id;
    int sala;
    String pelicula;
    String nombre;
    String distribucion;
    int asientos;
    int c;
    float precio;
    float total;

    public Datos() {
    }

    public Datos(int sala, String pelicula, String nombre, int asientos, float total) {
        int num;
        do {
            num = generarID();
        } while (ids.contains(num));
        
        this.id = num;
        this.sala = sala;
        this.pelicula = pelicula;
        this.nombre = nombre;
        this.asientos = asientos;
        this.total = total;
    }
    
    private int generarID() {
        Random ran = new Random();
        return ran.nextInt(100000);
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

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
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
    
    public void setID(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getC() {
        return c;
    }

    public float getPrecio() {
        return precio;
    }

    public float getTotal() {
        return total;
    }
    
    public int getID() {
        return id;
    }

    @Override
    public int compareTo(Datos o) {
        return this.getID()-o.getID();
    }

}

class OrdenarPorAsiento implements Comparator<Datos> {

    @Override
    public int compare(Datos a, Datos e) {
        return a.getAsientos()-e.getAsientos();
    }
    
}

class OrdenarPorPelicula implements Comparator<Datos> {

    @Override
    public int compare(Datos a, Datos e) {
        return a.getPelicula().compareTo(e.getPelicula());
    }
    
}

class OrdenarPorSala implements Comparator<Datos> {

    @Override
    public int compare(Datos a, Datos e) {
        return a.getSala()-e.getSala();
    }
    
}

class OrdenarPorID implements Comparator<Datos> {

    @Override
    public int compare(Datos a, Datos e) {
        return a.getID()-e.getID();
    }
    
}
