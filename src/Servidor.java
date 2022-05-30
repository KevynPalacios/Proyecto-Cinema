
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JButton;

public class Servidor {

    static ArrayList<Datos> datos = new ArrayList<>();
    static Archivo_generics<Datos> datos_file = new Archivo_generics<Datos>("datos.ser");

    public static void main(String[] args) {

        //datos = datos_file.leerRegistros();
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        int PUERTO = 3000;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor Listo");

            while (true) {

                sc = servidor.accept();
                System.out.println("Cliente conectado...");

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                int inSala = in.read();
                System.out.println(inSala);
                
                String inPelicula = in.readUTF();
                System.out.println(inPelicula);
                
                String inNombre = in.readUTF();
                System.out.println(inNombre);
                
                int inCantidad = in.read();
                System.out.println(inCantidad);

                
                sc.close();
                System.out.println("Cliente desconectado...");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
