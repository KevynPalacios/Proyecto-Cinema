/*      
        Atención al cliente de un cine
        Este programa se encarga de despachar o atender una cola de clientes para la venta de boletos en una función de cine.
        
        Cliente
        El cliente podrá seleccionar mediante una interfaz gráfica la pelicula de la cual desea adquirir los boletos, posteriormente
        se le mostrará una pantalla con los datos requeridos para finalizar la compra, estos datos son: Nombre o responsable de la
        orden, número de personas o boletos, según la cantidad de personas se le solicitará seleccionar los asientos que van desde
        la A a la N cada fila con 14 asientos disponibles, una vez determinado los asientos se imprimirá en pantalla un recibo de
        compra con los datos relevantes y el monto final de la orden, para posteriormente cerrar la sesión.
        
        Servidor
        El servidor recibirá el número de sala en base a la pelicula seleccionada por el cliente, a continuación tomará los datos de
        la orden y calculará el monto final, los almacenará en un archivo de datos y por ultimo actualizará una tabla con la información
        de cada cliente para la sala de cine seleccionada.
        
        Integrantes:
        Kevyn Enrique Palacios Bojorquez
        Juan Carlos Garcia
 */

import java.awt.Color;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
import javax.swing.*;

public class Cliente extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    static final int PUERTO = 3000;
    static DataInputStream in;
    static DataOutputStream out;
    static Socket sc;
    static Datos datos = new Datos();

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

            /*botones[0][0] = jButton20;
            botones[0][1] = jButton21;
            botones[0][2] = jButton22;
            botones[0][3] = jButton23;
            botones[0][4] = jButton24;
            botones[0][5] = jButton25;
            botones[1][0] = jButton26;
            botones[1][1] = jButton27;
            botones[1][2] = jButton28;
            botones[1][3] = jButton29;
            botones[1][4] = jButton30;
            botones[1][5] = jButton31;
            botones[2][0] = jButton32;
            botones[2][1] = jButton33;
            botones[2][2] = jButton34;
            botones[2][3] = jButton35;
            botones[2][4] = jButton36;
            botones[2][5] = jButton37;
            botones[3][0] = jButton38;
            botones[3][1] = jButton39;
            botones[3][2] = jButton40;
            botones[3][3] = jButton41;
            botones[3][4] = jButton42;
            botones[3][5] = jButton43;
            botones[4][0] = jButton44;
            botones[4][1] = jButton45;
            botones[4][2] = jButton46;
            botones[4][3] = jButton47;
            botones[4][4] = jButton48;
            botones[4][5] = jButton49;
            botones[5][0] = jButton50;
            botones[5][1] = jButton51;
            botones[5][2] = jButton52;
            botones[5][3] = jButton53;
            botones[5][4] = jButton54;
            botones[5][5] = jButton55;*/
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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
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
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
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
        catalogo.add(jButton4);
        jButton4.setBounds(950, 210, 300, 470);

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setText("Escoge una película");
        catalogo.add(label1);
        label1.setBounds(490, 90, 318, 42);

        jButton7.setBackground(new java.awt.Color(0, 102, 204));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText(">Ver Trailer");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        catalogo.add(jButton7);
        jButton7.setBounds(160, 680, 130, 22);

        jButton8.setBackground(new java.awt.Color(0, 102, 204));
        jButton8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText(">Ver Trailer");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        catalogo.add(jButton8);
        jButton8.setBounds(470, 680, 130, 22);

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText(">Ver Trailer");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        catalogo.add(jButton9);
        jButton9.setBounds(780, 680, 130, 22);

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText(">Ver Trailer");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        catalogo.add(jButton10);
        jButton10.setBounds(1090, 680, 130, 22);

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

        jButton20.setBackground(java.awt.Color.gray);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(170, 330, 30, 30);

        jButton21.setBackground(java.awt.Color.gray);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(200, 330, 30, 30);

        jButton22.setBackground(java.awt.Color.gray);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(230, 330, 30, 30);

        jButton23.setBackground(java.awt.Color.gray);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(260, 330, 30, 30);

        jButton24.setBackground(java.awt.Color.gray);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(290, 330, 30, 30);

        jButton25.setBackground(java.awt.Color.gray);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(320, 330, 30, 30);

        jButton26.setBackground(java.awt.Color.gray);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(170, 360, 30, 30);

        jButton27.setBackground(java.awt.Color.gray);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(200, 360, 30, 30);

        jButton28.setBackground(java.awt.Color.gray);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);
        jButton28.setBounds(230, 360, 30, 30);

        jButton29.setBackground(java.awt.Color.gray);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);
        jButton29.setBounds(260, 360, 30, 30);

        jButton30.setBackground(java.awt.Color.gray);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30);
        jButton30.setBounds(290, 360, 30, 30);

        jButton31.setBackground(java.awt.Color.gray);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31);
        jButton31.setBounds(320, 360, 30, 30);

        jButton32.setBackground(java.awt.Color.gray);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32);
        jButton32.setBounds(170, 390, 30, 30);

        jButton33.setBackground(java.awt.Color.gray);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33);
        jButton33.setBounds(200, 390, 30, 30);

        jButton34.setBackground(java.awt.Color.gray);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34);
        jButton34.setBounds(230, 390, 30, 30);

        jButton35.setBackground(java.awt.Color.gray);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35);
        jButton35.setBounds(260, 390, 30, 30);

        jButton36.setBackground(java.awt.Color.gray);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36);
        jButton36.setBounds(290, 390, 30, 30);

        jButton37.setBackground(java.awt.Color.gray);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37);
        jButton37.setBounds(320, 390, 30, 30);

        jButton38.setBackground(java.awt.Color.gray);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38);
        jButton38.setBounds(170, 420, 30, 30);

        jButton39.setBackground(java.awt.Color.gray);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39);
        jButton39.setBounds(200, 420, 30, 30);

        jButton40.setBackground(java.awt.Color.gray);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton40);
        jButton40.setBounds(230, 420, 30, 30);

        jButton41.setBackground(java.awt.Color.gray);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton41);
        jButton41.setBounds(260, 420, 30, 30);

        jButton42.setBackground(java.awt.Color.gray);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton42);
        jButton42.setBounds(290, 420, 30, 30);

        jButton43.setBackground(java.awt.Color.gray);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton43);
        jButton43.setBounds(320, 420, 30, 30);

        jButton44.setBackground(java.awt.Color.gray);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton44);
        jButton44.setBounds(170, 450, 30, 30);

        jButton45.setBackground(java.awt.Color.gray);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton45);
        jButton45.setBounds(200, 450, 30, 30);

        jButton46.setBackground(java.awt.Color.gray);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton46);
        jButton46.setBounds(230, 450, 30, 30);

        jButton47.setBackground(java.awt.Color.gray);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton47);
        jButton47.setBounds(260, 450, 30, 30);

        jButton48.setBackground(java.awt.Color.gray);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton48);
        jButton48.setBounds(290, 450, 30, 30);

        jButton49.setBackground(java.awt.Color.gray);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton49);
        jButton49.setBounds(320, 450, 30, 30);

        jButton50.setBackground(java.awt.Color.gray);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton50);
        jButton50.setBounds(170, 480, 30, 30);

        jButton51.setBackground(java.awt.Color.gray);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton51);
        jButton51.setBounds(200, 480, 30, 30);

        jButton52.setBackground(java.awt.Color.gray);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton52);
        jButton52.setBounds(230, 480, 30, 30);

        jButton53.setBackground(java.awt.Color.gray);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton53);
        jButton53.setBounds(260, 480, 30, 30);

        jButton54.setBackground(java.awt.Color.gray);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton54);
        jButton54.setBounds(290, 480, 30, 30);

        jButton55.setBackground(java.awt.Color.gray);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton55);
        jButton55.setBounds(320, 480, 30, 30);

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
        jLabel46.setBounds(260, 440, 150, 20);

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String url = "https://www.youtube.com/watch?v=KREBGtEeW9U";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String url = "https://www.youtube.com/watch?v=C4XP8FSqTTE";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String url = "https://www.youtube.com/watch?v=YHAL3XyDTaU";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String url = "https://www.youtube.com/watch?v=fWQrd6cwJ0A";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            datos.setNombre(jTextField1.getText());
            out.writeUTF(jTextField1.getText());
            datos.setAsientos(Integer.parseInt(jTextField3.getText()));
            datos.setC(Integer.parseInt(jTextField3.getText()));
            out.write(Integer.parseInt(jTextField3.getText()));
            jLabel27.setText("Asientos restantes: " + datos.c);
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        seleccionarAsiento(jButton20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        seleccionarAsiento(jButton21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        seleccionarAsiento(jButton22);// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        seleccionarAsiento(jButton23);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        seleccionarAsiento(jButton24);    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        seleccionarAsiento(jButton25);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        seleccionarAsiento(jButton26);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        seleccionarAsiento(jButton27);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        seleccionarAsiento(jButton28);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        seleccionarAsiento(jButton29);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        seleccionarAsiento(jButton30);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        seleccionarAsiento(jButton31);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        seleccionarAsiento(jButton32);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        seleccionarAsiento(jButton33);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        seleccionarAsiento(jButton34);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        seleccionarAsiento(jButton35);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        seleccionarAsiento(jButton36);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        seleccionarAsiento(jButton37);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        seleccionarAsiento(jButton38);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        seleccionarAsiento(jButton39);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        seleccionarAsiento(jButton40);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        seleccionarAsiento(jButton41);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        seleccionarAsiento(jButton42);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        seleccionarAsiento(jButton43);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        seleccionarAsiento(jButton44);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        seleccionarAsiento(jButton45);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        seleccionarAsiento(jButton46);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        seleccionarAsiento(jButton47);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        seleccionarAsiento(jButton48);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        seleccionarAsiento(jButton49);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        seleccionarAsiento(jButton50);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        seleccionarAsiento(jButton51);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        seleccionarAsiento(jButton52);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        seleccionarAsiento(jButton53);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        seleccionarAsiento(jButton54);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        seleccionarAsiento(jButton55);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (datos.c > 0) {
            JOptionPane.showMessageDialog(rootPane, "Faltan asientos por seleccionar...");
        } else {
            try {
                jPanel2.setVisible(false);
                jPanel3.setVisible(true);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                jLabel42.setText(dtf.format(LocalDateTime.now()));
                out.writeBoolean(true);
                jLabel43.setText(String.valueOf(datos.sala));
                jLabel44.setText(datos.pelicula);
                jLabel45.setText(datos.nombre);
                datos.setPrecio(58 * datos.asientos);
                //jLabel46.setText(String.valueOf(datos.asientos));
                jLabel47.setText(String.valueOf("$" + 58));
                jLabel48.setText(String.valueOf("$" + datos.precio));
                sc.close();
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    public void seleccionarAsiento(JButton btn) {
        if (datos.c == 0) {
            JOptionPane.showMessageDialog(rootPane, "No te quedan asientos...");
        } else {
            if (btn.getBackground().equals(Color.green)) {
                btn.setBackground(Color.gray);
                datos.c++;
            } else {
                datos.c--;
                btn.setBackground(Color.green);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel catalogo;
    private static javax.swing.JPanel formulario;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton10;
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
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private static javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private static javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
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
    // End of variables declaration//GEN-END:variables

}
