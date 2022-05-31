
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.*;

public class Servidor {

    static ArrayList<Datos> sala1 = new ArrayList<>(36);
    static ArrayList<Datos> sala2 = new ArrayList<>(36);
    static ArrayList<Datos> sala3 = new ArrayList<>(36);
    static ArrayList<Datos> sala4 = new ArrayList<>(36);

    static Archivo_generics<Datos> sala1_a = new Archivo_generics<Datos>("sala1.ser");
    static Archivo_generics<Datos> sala2_a = new Archivo_generics<Datos>("sala2.ser");
    static Archivo_generics<Datos> sala3_a = new Archivo_generics<Datos>("sala3.ser");
    static Archivo_generics<Datos> sala4_a = new Archivo_generics<Datos>("sala4.ser");

    public static void main(String[] args) {

        sala1 = sala1_a.leerRegistros();
        sala2 = sala2_a.leerRegistros();
        sala3 = sala3_a.leerRegistros();
        sala4 = sala4_a.leerRegistros();

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

                boolean inBandera = in.readBoolean();
                System.out.println(inBandera);

                if (inBandera) {
                    switch (inSala) {
                        case 1:
                            sala1.add(new Datos(inSala, inPelicula, inNombre, inCantidad, inSala));
                            sala1_a.actualizarRegistros(sala1);
                            break;
                        case 2:
                            sala2.add(new Datos(inSala, inPelicula, inNombre, inCantidad, inSala));
                            sala2_a.actualizarRegistros(sala1);
                            break;
                        case 3:
                            sala3.add(new Datos(inSala, inPelicula, inNombre, inCantidad, inSala));
                            sala3_a.actualizarRegistros(sala1);
                            break;
                        case 4:
                            sala4.add(new Datos(inSala, inPelicula, inNombre, inCantidad, inSala));
                            sala4_a.actualizarRegistros(sala1);
                            break;
                    }
                }
                sc.close();
                System.out.println("Cliente desconectado...");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
