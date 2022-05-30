
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo_generics<T> {
    String nombre_archivo = "archivo_obj.ser";   
    File archivo = null;
    public Archivo_generics(String nombre_archivo_in){
        nombre_archivo = nombre_archivo_in;
    }
    public ArrayList leerRegistros() {
        ArrayList<T> informacion = new ArrayList();   
        FileInputStream file_InputStream = null;
        ObjectInputStream entrada = null;
        try {
            file_InputStream = new FileInputStream(nombre_archivo);
            entrada = new ObjectInputStream(file_InputStream);
            informacion = (ArrayList<T>) entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (file_InputStream != null) {
                    file_InputStream.close();
                    file_InputStream = null;
                }
                if (entrada != null) {
                    entrada.close();                    
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return informacion;
    }
    public boolean actualizarRegistros(ArrayList<T> informacion) {
        boolean resultado = false;   
        FileOutputStream file_OutputStream = null;
        ObjectOutputStream salida = null;
        try {
            file_OutputStream = new FileOutputStream(nombre_archivo);
            salida = new ObjectOutputStream(file_OutputStream);
            salida.writeObject(informacion);
            resultado = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file_OutputStream != null) {
                    file_OutputStream.close();
                    file_OutputStream= null;
                }
                if (salida != null) {
                    salida.close();                    
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return resultado;
    }
}