
import javax.swing.JButton;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trailer extends JButton {

    private String nombre;
    private Color color;
    private String url;

    public Trailer() {

        setBackground(new java.awt.Color(0, 102, 204));
        setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setText(">Ver Trailer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        setBounds(TOP, TOP, 133, 22);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
