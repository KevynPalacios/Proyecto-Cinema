/*      
        Integrantes:
        Kevyn Enrique Palacios Bojorquez
        Juan Carlos Garcia
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
import javax.swing.*;

public class Cliente extends javax.swing.JFrame implements Printable {

    private ImageIcon imagen;
    private Icon icono;
    static final int PUERTO = 9999;
    static DataInputStream in;
    static DataOutputStream out;
    static Socket sc;
    static Datos datos = new Datos();

    int filas = 6;
    int columnas = 6;
    int largoBoton = 30;
    int anchoBoton = 30;
    int ejeX = 170;
    int ejeY = 330;
    String asientos;

    public JToggleButton[][] JTBotones = new JToggleButton[filas][columnas];

    public void botones() {

        //Font font = new Font("Calibri",Font.PLAIN,4);
        char ind[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        int contador = 1;
        JTBotones = new JToggleButton[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                JTBotones[i][j] = new JToggleButton();
                JTBotones[i][j].setBounds(ejeX, ejeY, largoBoton, anchoBoton);

                JTBotones[i][j].setBackground(Color.green);
                //JTBotones[i][j].setFont(font);
                JTBotones[i][j].setText(ind[i] + "" + contador);

                AccionBotones accion = new AccionBotones();
                JTBotones[i][j].addActionListener(accion);

                jPanel2.add(JTBotones[i][j]);

                contador++;
                ejeX += 30;
            }
            ejeX = 170;
            ejeY += 30;
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graphics;
        hub.translate(pageFormat.getImageableX() + 30, pageFormat.getImageableY() + 30);
        hub.scale(1.0, 1.0);

        jPanel3.printAll(graphics);
        return PAGE_EXISTS;
    }

    public class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (e.getSource().equals(JTBotones[i][j])) {
                        if (JTBotones[i][j].isSelected()) {
                            //JTBotones[i][j].setBackground(Color.red);
                            seleccionarAsiento(JTBotones[i][j]);
                            asientos += ("" + JTBotones[i][j].getText() + ", ");
                        }
                    }
                }
            }
        }
    }

    public Cliente() {

        try {
            initComponents();
            formulario.setVisible(false);
            catalogo.setVisible(true);
            this.setTitle("Catalogo");
            this.setSize(1280, 750);
            this.pintarImagen(this.jButton1, "src/img/PortadaDS2.jpg");
            this.pintarImagen(this.jButton2, "src/img/PortadaMorb.jpg");
            this.pintarImagen(this.jButton3, "src/img/PortadaX.jpg");
            this.pintarImagen(this.jButton4, "src/img/PortadaBat.jpg");
            this.setLocationRelativeTo(null);

            sc = new Socket("localhost", PUERTO);
            out = new DataOutputStream(sc.getOutputStream());

            botones();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void pintarImagen(JButton btn, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), SCALE_SMOOTH));
        btn.setIcon(this.icono);
        btn.setBorder(null);
        btn.setOpaque(true);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catalogo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        trailer1 = new Trailer();
        trailer2 = new Trailer();
        trailer3 = new Trailer();
        trailer4 = new Trailer();
        formulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton19 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        catalogo.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        catalogo.add(jButton1);
        jButton1.setBounds(20, 210, 301, 470);

        jButton3.setText("jButton3");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        catalogo.add(jButton3);
        jButton3.setBounds(640, 210, 300, 470);

        jButton2.setText("jButton2");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        catalogo.add(jButton2);
        jButton2.setBounds(330, 210, 300, 470);

        jButton4.setText("jButton4");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        catalogo.add(jButton4);
        jButton4.setBounds(950, 210, 300, 470);

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setText("Escoge una película");
        catalogo.add(label1);
        label1.setBounds(490, 90, 318, 42);

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("2h 56m ");
        catalogo.add(jButton11);
        jButton11.setBounds(1020, 680, 70, 22);

        jButton12.setBackground(new java.awt.Color(153, 153, 153));
        jButton12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("B");
        catalogo.add(jButton12);
        jButton12.setBounds(980, 680, 40, 22);

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("B");
        catalogo.add(jButton13);
        jButton13.setBounds(50, 680, 40, 22);

        jButton14.setBackground(new java.awt.Color(153, 153, 153));
        jButton14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("B");
        catalogo.add(jButton14);
        jButton14.setBounds(360, 680, 40, 22);

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("2h 6m");
        catalogo.add(jButton15);
        jButton15.setBounds(90, 680, 70, 22);

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("1h 48m");
        catalogo.add(jButton16);
        jButton16.setBounds(400, 680, 70, 22);

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("1h 45m");
        catalogo.add(jButton17);
        jButton17.setBounds(710, 680, 70, 22);

        jButton18.setBackground(new java.awt.Color(153, 153, 153));
        jButton18.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("C");
        catalogo.add(jButton18);
        jButton18.setBounds(670, 680, 40, 22);

        trailer1.setUrl("https://www.youtube.com/watch?v=fWQrd6cwJ0A");
        catalogo.add(trailer1);
        trailer1.setBounds(1090, 680, 88, 21);

        trailer2.setUrl("https://www.youtube.com/watch?v=YHAL3XyDTaU");
        catalogo.add(trailer2);
        trailer2.setBounds(780, 680, 88, 21);

        trailer3.setUrl("https://www.youtube.com/watch?v=C4XP8FSqTTE");
        catalogo.add(trailer3);
        trailer3.setBounds(470, 680, 88, 21);

        trailer4.setUrl("https://www.youtube.com/watch?v=KREBGtEeW9U");
        catalogo.add(trailer4);
        trailer4.setBounds(160, 680, 88, 21);

        getContentPane().add(catalogo);
        catalogo.setBounds(0, 0, 1280, 720);

        formulario.setMaximumSize(new java.awt.Dimension(633, 763));
        formulario.setMinimumSize(new java.awt.Dimension(633, 763));
        formulario.setName(""); // NOI18N
        formulario.setPreferredSize(new java.awt.Dimension(633, 763));
        formulario.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(515, 677));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cinema");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 140, 510, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crop logo 110.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-2, 48, 510, 95);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos de la orden");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 240, 510, 40);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");
        jSeparator1.setName(""); // NOI18N
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(270, 310, 140, 20);
        jSeparator1.getAccessibleContext().setAccessibleName("");

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setToolTipText("");
        jSeparator2.setName(""); // NOI18N
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(100, 310, 140, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("o");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 300, 10, 16);

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("   Ingrese el nombre");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(100, 350, 310, 40);

        jTextField3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("   Ingrese la cantidad");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(100, 420, 310, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Continuar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(100, 600, 310, 40);

        formulario.add(jPanel1);
        jPanel1.setBounds(60, 30, 510, 677);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel2.setMaximumSize(new java.awt.Dimension(515, 677));
        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cinema");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 140, 510, 50);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crop logo 110.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(-2, 48, 510, 95);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Selecciona tus asientos");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 240, 510, 40);

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setToolTipText("");
        jSeparator3.setName(""); // NOI18N
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(270, 310, 140, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setToolTipText("");
        jSeparator4.setName(""); // NOI18N
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(100, 310, 140, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("o");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(250, 300, 10, 16);

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Reiniciar");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(100, 600, 130, 40);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 340, 20, 14);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("B");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 370, 20, 14);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("C");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 400, 20, 14);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("D");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 430, 20, 14);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("E");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 460, 20, 14);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("F");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(40, 490, 20, 14);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("A");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(450, 340, 20, 14);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("B");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(450, 370, 20, 14);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("C");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(450, 400, 20, 14);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("D");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(450, 430, 20, 14);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("E");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(450, 460, 20, 14);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("F");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(450, 490, 20, 14);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setToolTipText("");
        jSeparator5.setName(""); // NOI18N
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(100, 580, 120, 20);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Pantalla");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(0, 570, 510, 16);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setToolTipText("");
        jSeparator6.setName(""); // NOI18N
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(290, 580, 120, 20);

        jButton19.setBackground(new java.awt.Color(0, 153, 0));
        jButton19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Finalizar");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(280, 600, 130, 40);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel27);
        jLabel27.setBounds(0, 270, 510, 40);

        formulario.add(jPanel2);
        jPanel2.setBounds(60, 30, 510, 677);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel3.setMaximumSize(new java.awt.Dimension(515, 677));
        jPanel3.setLayout(null);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cinema");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 140, 510, 50);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crop logo 110.jpg"))); // NOI18N
        jPanel3.add(jLabel17);
        jLabel17.setBounds(-2, 48, 510, 95);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Recibo de compra");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(0, 190, 510, 40);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setToolTipText("");
        jSeparator7.setName(""); // NOI18N
        jPanel3.add(jSeparator7);
        jSeparator7.setBounds(270, 240, 140, 20);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setToolTipText("");
        jSeparator8.setName(""); // NOI18N
        jPanel3.add(jSeparator8);
        jSeparator8.setBounds(100, 240, 140, 20);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("o");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(250, 230, 10, 16);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel28);
        jLabel28.setBounds(260, 550, 150, 0);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Tel:");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(100, 280, 160, 22);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Total:");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(100, 520, 160, 22);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator9);
        jSeparator9.setBounds(100, 510, 310, 10);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Película:");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(100, 370, 160, 22);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Nombre:");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(100, 410, 160, 22);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Asientos:");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(100, 440, 160, 22);

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator10);
        jSeparator10.setBounds(100, 400, 310, 10);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Precio c/u:");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(100, 480, 160, 22);

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator11);
        jSeparator11.setBounds(100, 470, 310, 10);

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Fecha:");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(100, 310, 160, 22);

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Sala:");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(100, 340, 160, 22);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qr.jpg"))); // NOI18N
        jPanel3.add(jLabel34);
        jLabel34.setBounds(200, 550, 110, 110);

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Dirección:");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(100, 250, 160, 22);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("C. Novena s/n,");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(260, 250, 150, 22);

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("686 134 5508");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(260, 280, 150, 22);

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel42);
        jLabel42.setBounds(260, 310, 150, 20);

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel43);
        jLabel43.setBounds(260, 340, 150, 20);

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel44);
        jLabel44.setBounds(260, 370, 150, 20);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel45);
        jLabel45.setBounds(260, 410, 150, 20);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel46);
        jLabel46.setBounds(180, 440, 230, 20);

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel47);
        jLabel47.setBounds(260, 480, 150, 20);

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel48);
        jLabel48.setBounds(260, 520, 150, 20);

        jButton7.setText("Imprimir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(405, 640, 90, 22);

        formulario.add(jPanel3);
        jPanel3.setBounds(60, 30, 510, 677);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoForm.jpg"))); // NOI18N
        formulario.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 760);

        getContentPane().add(formulario);
        formulario.setBounds(0, 0, 633, 763);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBounds(20, 200, 301, 470);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBounds(20, 210, 301, 470);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBounds(640, 200, 300, 470);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBounds(640, 210, 300, 470);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBounds(330, 200, 300, 470);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBounds(330, 210, 300, 470);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBounds(950, 200, 300, 470);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBounds(950, 210, 300, 470);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            datos.setSala(1);
            out.write(1);
            datos.setPelicula("Doctor Strange");
            out.writeUTF("Doctor Strange");

            catalogo.setVisible(false);
            formulario.setVisible(true);
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
            this.setSize(633, 763);
            this.setTitle("Formulario");
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        if (jTextField3.getText().trim().equals("")) {
            jTextField3.setForeground(new Color(204, 204, 204));
            jTextField3.setText("   Ingrese la cantidad");
        }
        if (jTextField1.getText().equals("   Ingrese la matricula")) {
            jTextField1.setForeground(Color.black);
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1MousePressed

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MousePressed
        if (jTextField1.getText().trim().equals("")) {
            jTextField1.setForeground(new Color(204, 204, 204));
            jTextField1.setText("   Ingrese el nombre");
        }
        if (jTextField3.getText().trim().equals("   Ingrese la cantidad")) {
            jTextField3.setForeground(Color.black);
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            boolean numeric = false;
            while (!numeric) {
                numeric = isNumeric(jTextField3.getText());
                if (!numeric) {
                    JOptionPane.showMessageDialog(rootPane, "Debes insertar un número");
                    break;
                }
            }
            datos.setNombre(jTextField1.getText());
            datos.setAsientos(Integer.parseInt(jTextField3.getText()));
            datos.setC(Integer.parseInt(jTextField3.getText()));

            out.writeUTF(jTextField1.getText());
            out.write(Integer.parseInt(jTextField3.getText()));

            jLabel27.setText("Asientos restantes: " + datos.c);
            jPanel1.setVisible(false);
            jButton7.setVisible(false);
            jPanel2.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                JTBotones[i][j].setBackground(Color.green);
                asientos = "";
                datos.setC(datos.asientos);
                jLabel27.setText("Asientos restantes: " + datos.c);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (datos.c > 0) {
            JOptionPane.showMessageDialog(rootPane, "Faltan asientos por seleccionar...");
        } else {
            try {
                jButton7.setVisible(true);
                jPanel2.setVisible(false);
                jPanel3.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                jLabel42.setText(dtf.format(LocalDateTime.now()));
                out.writeBoolean(true);
                jLabel43.setText(String.valueOf(datos.sala));
                jLabel44.setText(datos.pelicula);
                jLabel45.setText(datos.nombre);
                datos.setPrecio(58 * datos.asientos);
                datos.setDistribucion(asientos);
                jLabel46.setText(String.valueOf(datos.distribucion));
                jLabel47.setText(String.valueOf("$" + 58));
                jLabel48.setText(String.valueOf("$" + datos.precio));
                sc.close();
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            datos.setSala(2);
            out.write(2);
            datos.setPelicula("Morbius");
            out.writeUTF("Morbius");

            catalogo.setVisible(false);
            formulario.setVisible(true);
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
            this.setSize(633, 763);
            this.setTitle("Formulario");
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            datos.setSala(3);
            out.write(3);
            datos.setPelicula("X 2022");
            out.writeUTF("X 2022");

            catalogo.setVisible(false);
            formulario.setVisible(true);
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
            this.setSize(633, 763);
            this.setTitle("Formulario");
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            datos.setSala(4);
            out.write(4);
            datos.setPelicula("The Batman");
            out.writeUTF("The Batman");

            catalogo.setVisible(false);
            formulario.setVisible(true);
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
            this.setSize(633, 763);
            this.setTitle("Formulario");
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if (top) {
                gap.print();
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    public void seleccionarAsiento(JToggleButton btn) {
        if (datos.c == 0) {
            JOptionPane.showMessageDialog(rootPane, "No te quedan asientos...");
        } else {
            if (btn.getBackground().equals(Color.green)) {
                btn.setBackground(Color.red);
                datos.c--;
            }
            jLabel27.setText("Asientos restantes: " + datos.c);

        }
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel catalogo;
    private static javax.swing.JPanel formulario;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton11;
    private static javax.swing.JButton jButton12;
    private static javax.swing.JButton jButton13;
    private static javax.swing.JButton jButton14;
    private static javax.swing.JButton jButton15;
    private static javax.swing.JButton jButton16;
    private static javax.swing.JButton jButton17;
    private static javax.swing.JButton jButton18;
    private static javax.swing.JButton jButton19;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel12;
    private static javax.swing.JLabel jLabel13;
    private static javax.swing.JLabel jLabel14;
    private static javax.swing.JLabel jLabel15;
    private static javax.swing.JLabel jLabel16;
    private static javax.swing.JLabel jLabel17;
    private static javax.swing.JLabel jLabel18;
    private static javax.swing.JLabel jLabel19;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel20;
    private static javax.swing.JLabel jLabel21;
    private static javax.swing.JLabel jLabel22;
    private static javax.swing.JLabel jLabel23;
    private static javax.swing.JLabel jLabel24;
    private static javax.swing.JLabel jLabel25;
    private static javax.swing.JLabel jLabel26;
    private static javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel3;
    private static javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private static javax.swing.JSeparator jSeparator2;
    private static javax.swing.JSeparator jSeparator3;
    private static javax.swing.JSeparator jSeparator4;
    private static javax.swing.JSeparator jSeparator5;
    private static javax.swing.JSeparator jSeparator6;
    private static javax.swing.JSeparator jSeparator7;
    private static javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JLabel label1;
    private Trailer trailer1;
    private Trailer trailer2;
    private Trailer trailer3;
    private Trailer trailer4;
    // End of variables declaration//GEN-END:variables

}
