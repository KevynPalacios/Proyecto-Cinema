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
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Cliente extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    static final int PUERTO = 3000;
    static DataInputStream in;
    static DataOutputStream out;
    static Socket sc;

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

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton19 = new javax.swing.JButton();
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
        jButton6.setText("Cancelar");
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

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("G");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 520, 20, 14);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("H");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(40, 550, 20, 14);

        jButton20.setBackground(new java.awt.Color(0, 153, 204));
        jButton20.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("1");
        jPanel2.add(jButton20);
        jButton20.setBounds(100, 330, 40, 30);

        jButton21.setBackground(new java.awt.Color(0, 153, 204));
        jButton21.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("2");
        jPanel2.add(jButton21);
        jButton21.setBounds(140, 330, 40, 30);

        jButton22.setBackground(new java.awt.Color(0, 153, 204));
        jButton22.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("3");
        jPanel2.add(jButton22);
        jButton22.setBounds(180, 330, 40, 30);

        jButton23.setBackground(new java.awt.Color(0, 153, 204));
        jButton23.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("4");
        jPanel2.add(jButton23);
        jButton23.setBounds(220, 330, 40, 30);

        jButton24.setBackground(new java.awt.Color(0, 153, 204));
        jButton24.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("5");
        jPanel2.add(jButton24);
        jButton24.setBounds(260, 330, 40, 30);

        jButton25.setBackground(new java.awt.Color(0, 153, 204));
        jButton25.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("6");
        jPanel2.add(jButton25);
        jButton25.setBounds(300, 330, 40, 30);

        jButton26.setBackground(new java.awt.Color(0, 153, 204));
        jButton26.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("7");
        jPanel2.add(jButton26);
        jButton26.setBounds(340, 330, 40, 30);

        jButton27.setBackground(new java.awt.Color(0, 153, 204));
        jButton27.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("8");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(380, 330, 40, 30);

        jButton29.setBackground(new java.awt.Color(0, 153, 204));
        jButton29.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("1");
        jPanel2.add(jButton29);
        jButton29.setBounds(100, 360, 40, 30);

        jButton30.setBackground(new java.awt.Color(0, 153, 204));
        jButton30.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("2");
        jPanel2.add(jButton30);
        jButton30.setBounds(140, 360, 40, 30);

        jButton31.setBackground(new java.awt.Color(0, 153, 204));
        jButton31.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("3");
        jPanel2.add(jButton31);
        jButton31.setBounds(180, 360, 40, 30);

        jButton32.setBackground(new java.awt.Color(0, 153, 204));
        jButton32.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("4");
        jPanel2.add(jButton32);
        jButton32.setBounds(220, 360, 40, 30);

        jButton33.setBackground(new java.awt.Color(0, 153, 204));
        jButton33.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("5");
        jPanel2.add(jButton33);
        jButton33.setBounds(260, 360, 40, 30);

        jButton34.setBackground(new java.awt.Color(0, 153, 204));
        jButton34.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("6");
        jPanel2.add(jButton34);
        jButton34.setBounds(300, 360, 40, 30);

        jButton35.setBackground(new java.awt.Color(0, 153, 204));
        jButton35.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("7");
        jPanel2.add(jButton35);
        jButton35.setBounds(340, 360, 40, 30);

        jButton36.setBackground(new java.awt.Color(0, 153, 204));
        jButton36.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("8");
        jPanel2.add(jButton36);
        jButton36.setBounds(380, 360, 40, 30);

        jButton38.setBackground(new java.awt.Color(0, 153, 204));
        jButton38.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("1");
        jPanel2.add(jButton38);
        jButton38.setBounds(100, 390, 40, 30);

        jButton39.setBackground(new java.awt.Color(0, 153, 204));
        jButton39.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("2");
        jPanel2.add(jButton39);
        jButton39.setBounds(140, 390, 40, 30);

        jButton40.setBackground(new java.awt.Color(0, 153, 204));
        jButton40.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("3");
        jPanel2.add(jButton40);
        jButton40.setBounds(180, 390, 40, 30);

        jButton41.setBackground(new java.awt.Color(0, 153, 204));
        jButton41.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("4");
        jPanel2.add(jButton41);
        jButton41.setBounds(220, 390, 40, 30);

        jButton42.setBackground(new java.awt.Color(0, 153, 204));
        jButton42.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("5");
        jPanel2.add(jButton42);
        jButton42.setBounds(260, 390, 40, 30);

        jButton43.setBackground(new java.awt.Color(0, 153, 204));
        jButton43.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("6");
        jPanel2.add(jButton43);
        jButton43.setBounds(300, 390, 40, 30);

        jButton44.setBackground(new java.awt.Color(0, 153, 204));
        jButton44.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("7");
        jPanel2.add(jButton44);
        jButton44.setBounds(340, 390, 40, 30);

        jButton45.setBackground(new java.awt.Color(0, 153, 204));
        jButton45.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("8");
        jPanel2.add(jButton45);
        jButton45.setBounds(380, 390, 40, 30);

        jButton47.setBackground(new java.awt.Color(0, 153, 204));
        jButton47.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("1");
        jPanel2.add(jButton47);
        jButton47.setBounds(100, 420, 40, 30);

        jButton48.setBackground(new java.awt.Color(0, 153, 204));
        jButton48.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("2");
        jPanel2.add(jButton48);
        jButton48.setBounds(140, 420, 40, 30);

        jButton49.setBackground(new java.awt.Color(0, 153, 204));
        jButton49.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("3");
        jPanel2.add(jButton49);
        jButton49.setBounds(180, 420, 40, 30);

        jButton50.setBackground(new java.awt.Color(0, 153, 204));
        jButton50.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("4");
        jPanel2.add(jButton50);
        jButton50.setBounds(220, 420, 40, 30);

        jButton51.setBackground(new java.awt.Color(0, 153, 204));
        jButton51.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("5");
        jPanel2.add(jButton51);
        jButton51.setBounds(260, 420, 40, 30);

        jButton52.setBackground(new java.awt.Color(0, 153, 204));
        jButton52.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("6");
        jPanel2.add(jButton52);
        jButton52.setBounds(300, 420, 40, 30);

        jButton53.setBackground(new java.awt.Color(0, 153, 204));
        jButton53.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("7");
        jPanel2.add(jButton53);
        jButton53.setBounds(340, 420, 40, 30);

        jButton54.setBackground(new java.awt.Color(0, 153, 204));
        jButton54.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("8");
        jPanel2.add(jButton54);
        jButton54.setBounds(380, 420, 40, 30);

        jButton56.setBackground(new java.awt.Color(0, 153, 204));
        jButton56.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setText("1");
        jPanel2.add(jButton56);
        jButton56.setBounds(100, 450, 40, 30);

        jButton57.setBackground(new java.awt.Color(0, 153, 204));
        jButton57.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setText("2");
        jPanel2.add(jButton57);
        jButton57.setBounds(140, 450, 40, 30);

        jButton58.setBackground(new java.awt.Color(0, 153, 204));
        jButton58.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton58.setForeground(new java.awt.Color(255, 255, 255));
        jButton58.setText("3");
        jPanel2.add(jButton58);
        jButton58.setBounds(180, 450, 40, 30);

        jButton59.setBackground(new java.awt.Color(0, 153, 204));
        jButton59.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setText("4");
        jPanel2.add(jButton59);
        jButton59.setBounds(220, 450, 40, 30);

        jButton60.setBackground(new java.awt.Color(0, 153, 204));
        jButton60.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setText("5");
        jPanel2.add(jButton60);
        jButton60.setBounds(260, 450, 40, 30);

        jButton61.setBackground(new java.awt.Color(0, 153, 204));
        jButton61.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setText("6");
        jPanel2.add(jButton61);
        jButton61.setBounds(300, 450, 40, 30);

        jButton62.setBackground(new java.awt.Color(0, 153, 204));
        jButton62.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setText("7");
        jPanel2.add(jButton62);
        jButton62.setBounds(340, 450, 40, 30);

        jButton63.setBackground(new java.awt.Color(0, 153, 204));
        jButton63.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("8");
        jPanel2.add(jButton63);
        jButton63.setBounds(380, 450, 40, 30);

        jButton65.setBackground(new java.awt.Color(0, 153, 204));
        jButton65.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("1");
        jPanel2.add(jButton65);
        jButton65.setBounds(100, 480, 40, 30);

        jButton66.setBackground(new java.awt.Color(0, 153, 204));
        jButton66.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton66.setForeground(new java.awt.Color(255, 255, 255));
        jButton66.setText("2");
        jPanel2.add(jButton66);
        jButton66.setBounds(140, 480, 40, 30);

        jButton67.setBackground(new java.awt.Color(0, 153, 204));
        jButton67.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton67.setForeground(new java.awt.Color(255, 255, 255));
        jButton67.setText("3");
        jPanel2.add(jButton67);
        jButton67.setBounds(180, 480, 40, 30);

        jButton68.setBackground(new java.awt.Color(0, 153, 204));
        jButton68.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setText("4");
        jPanel2.add(jButton68);
        jButton68.setBounds(220, 480, 40, 30);

        jButton69.setBackground(new java.awt.Color(0, 153, 204));
        jButton69.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton69.setForeground(new java.awt.Color(255, 255, 255));
        jButton69.setText("5");
        jPanel2.add(jButton69);
        jButton69.setBounds(260, 480, 40, 30);

        jButton70.setBackground(new java.awt.Color(0, 153, 204));
        jButton70.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton70.setForeground(new java.awt.Color(255, 255, 255));
        jButton70.setText("6");
        jPanel2.add(jButton70);
        jButton70.setBounds(300, 480, 40, 30);

        jButton71.setBackground(new java.awt.Color(0, 153, 204));
        jButton71.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton71.setForeground(new java.awt.Color(255, 255, 255));
        jButton71.setText("7");
        jPanel2.add(jButton71);
        jButton71.setBounds(340, 480, 40, 30);

        jButton72.setBackground(new java.awt.Color(0, 153, 204));
        jButton72.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton72.setForeground(new java.awt.Color(255, 255, 255));
        jButton72.setText("8");
        jPanel2.add(jButton72);
        jButton72.setBounds(380, 480, 40, 30);

        jButton74.setBackground(new java.awt.Color(0, 153, 204));
        jButton74.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton74.setForeground(new java.awt.Color(255, 255, 255));
        jButton74.setText("1");
        jPanel2.add(jButton74);
        jButton74.setBounds(100, 510, 40, 30);

        jButton75.setBackground(new java.awt.Color(0, 153, 204));
        jButton75.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton75.setForeground(new java.awt.Color(255, 255, 255));
        jButton75.setText("2");
        jPanel2.add(jButton75);
        jButton75.setBounds(140, 510, 40, 30);

        jButton76.setBackground(new java.awt.Color(0, 153, 204));
        jButton76.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton76.setForeground(new java.awt.Color(255, 255, 255));
        jButton76.setText("3");
        jPanel2.add(jButton76);
        jButton76.setBounds(180, 510, 40, 30);

        jButton77.setBackground(new java.awt.Color(0, 153, 204));
        jButton77.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton77.setForeground(new java.awt.Color(255, 255, 255));
        jButton77.setText("4");
        jPanel2.add(jButton77);
        jButton77.setBounds(220, 510, 40, 30);

        jButton78.setBackground(new java.awt.Color(0, 153, 204));
        jButton78.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton78.setForeground(new java.awt.Color(255, 255, 255));
        jButton78.setText("5");
        jPanel2.add(jButton78);
        jButton78.setBounds(260, 510, 40, 30);

        jButton79.setBackground(new java.awt.Color(0, 153, 204));
        jButton79.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton79.setForeground(new java.awt.Color(255, 255, 255));
        jButton79.setText("6");
        jPanel2.add(jButton79);
        jButton79.setBounds(300, 510, 40, 30);

        jButton80.setBackground(new java.awt.Color(0, 153, 204));
        jButton80.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton80.setForeground(new java.awt.Color(255, 255, 255));
        jButton80.setText("7");
        jPanel2.add(jButton80);
        jButton80.setBounds(340, 510, 40, 30);

        jButton81.setBackground(new java.awt.Color(0, 153, 204));
        jButton81.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton81.setForeground(new java.awt.Color(255, 255, 255));
        jButton81.setText("8");
        jPanel2.add(jButton81);
        jButton81.setBounds(380, 510, 40, 30);

        jButton83.setBackground(new java.awt.Color(0, 153, 204));
        jButton83.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton83.setForeground(new java.awt.Color(255, 255, 255));
        jButton83.setText("1");
        jPanel2.add(jButton83);
        jButton83.setBounds(100, 540, 40, 30);

        jButton84.setBackground(new java.awt.Color(0, 153, 204));
        jButton84.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton84.setForeground(new java.awt.Color(255, 255, 255));
        jButton84.setText("2");
        jPanel2.add(jButton84);
        jButton84.setBounds(140, 540, 40, 30);

        jButton85.setBackground(new java.awt.Color(0, 153, 204));
        jButton85.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton85.setForeground(new java.awt.Color(255, 255, 255));
        jButton85.setText("3");
        jPanel2.add(jButton85);
        jButton85.setBounds(180, 540, 40, 30);

        jButton86.setBackground(new java.awt.Color(0, 153, 204));
        jButton86.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton86.setForeground(new java.awt.Color(255, 255, 255));
        jButton86.setText("4");
        jPanel2.add(jButton86);
        jButton86.setBounds(220, 540, 40, 30);

        jButton87.setBackground(new java.awt.Color(0, 153, 204));
        jButton87.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton87.setForeground(new java.awt.Color(255, 255, 255));
        jButton87.setText("5");
        jPanel2.add(jButton87);
        jButton87.setBounds(260, 540, 40, 30);

        jButton88.setBackground(new java.awt.Color(0, 153, 204));
        jButton88.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("6");
        jPanel2.add(jButton88);
        jButton88.setBounds(300, 540, 40, 30);

        jButton89.setBackground(new java.awt.Color(0, 153, 204));
        jButton89.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton89.setForeground(new java.awt.Color(255, 255, 255));
        jButton89.setText("7");
        jPanel2.add(jButton89);
        jButton89.setBounds(340, 540, 40, 30);

        jButton90.setBackground(new java.awt.Color(0, 153, 204));
        jButton90.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton90.setForeground(new java.awt.Color(255, 255, 255));
        jButton90.setText("8");
        jPanel2.add(jButton90);
        jButton90.setBounds(380, 540, 40, 30);

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

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("G");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(450, 520, 20, 14);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("H");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(450, 550, 20, 14);

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
        jButton19.setText("Continuar");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jButton19);
        jButton19.setBounds(280, 600, 130, 40);

        formulario.add(jPanel2);
        jPanel2.setBounds(60, 30, 510, 677);

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
            out.write(1);
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
            out.writeUTF(jTextField1.getText());
            out.write(Integer.parseInt(jTextField3.getText()));

            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

    }//GEN-LAST:event_jButton27ActionPerformed

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
    private static javax.swing.JButton jButton20;
    private static javax.swing.JButton jButton21;
    private static javax.swing.JButton jButton22;
    private static javax.swing.JButton jButton23;
    private static javax.swing.JButton jButton24;
    private static javax.swing.JButton jButton25;
    private static javax.swing.JButton jButton26;
    private static javax.swing.JButton jButton27;
    private static javax.swing.JButton jButton29;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton30;
    private static javax.swing.JButton jButton31;
    private static javax.swing.JButton jButton32;
    private static javax.swing.JButton jButton33;
    private static javax.swing.JButton jButton34;
    private static javax.swing.JButton jButton35;
    private static javax.swing.JButton jButton36;
    private static javax.swing.JButton jButton38;
    private static javax.swing.JButton jButton39;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton40;
    private static javax.swing.JButton jButton41;
    private static javax.swing.JButton jButton42;
    private static javax.swing.JButton jButton43;
    private static javax.swing.JButton jButton44;
    private static javax.swing.JButton jButton45;
    private static javax.swing.JButton jButton47;
    private static javax.swing.JButton jButton48;
    private static javax.swing.JButton jButton49;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton50;
    private static javax.swing.JButton jButton51;
    private static javax.swing.JButton jButton52;
    private static javax.swing.JButton jButton53;
    private static javax.swing.JButton jButton54;
    private static javax.swing.JButton jButton56;
    private static javax.swing.JButton jButton57;
    private static javax.swing.JButton jButton58;
    private static javax.swing.JButton jButton59;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton60;
    private static javax.swing.JButton jButton61;
    private static javax.swing.JButton jButton62;
    private static javax.swing.JButton jButton63;
    private static javax.swing.JButton jButton65;
    private static javax.swing.JButton jButton66;
    private static javax.swing.JButton jButton67;
    private static javax.swing.JButton jButton68;
    private static javax.swing.JButton jButton69;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton70;
    private static javax.swing.JButton jButton71;
    private static javax.swing.JButton jButton72;
    private static javax.swing.JButton jButton74;
    private static javax.swing.JButton jButton75;
    private static javax.swing.JButton jButton76;
    private static javax.swing.JButton jButton77;
    private static javax.swing.JButton jButton78;
    private static javax.swing.JButton jButton79;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton80;
    private static javax.swing.JButton jButton81;
    private static javax.swing.JButton jButton83;
    private static javax.swing.JButton jButton84;
    private static javax.swing.JButton jButton85;
    private static javax.swing.JButton jButton86;
    private static javax.swing.JButton jButton87;
    private static javax.swing.JButton jButton88;
    private static javax.swing.JButton jButton89;
    private static javax.swing.JButton jButton9;
    private static javax.swing.JButton jButton90;
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
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private static javax.swing.JSeparator jSeparator1;
    private static javax.swing.JSeparator jSeparator2;
    private static javax.swing.JSeparator jSeparator3;
    private static javax.swing.JSeparator jSeparator4;
    private static javax.swing.JSeparator jSeparator5;
    private static javax.swing.JSeparator jSeparator6;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
