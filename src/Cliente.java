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

    private JButton[][] botones = new JButton[8][8];

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
            
            botones[0][0] = boton1;
            botones[0][1] = boton2;
            botones[0][2] = boton3;
            botones[0][3] = boton4;
            botones[0][4] = boton5;
            botones[0][5] = boton6;
            botones[0][6] = boton7;
            botones[0][7] = boton8;
            botones[1][0] = boton9;
            botones[1][1] = boton10;
            botones[1][2] = boton11;
            botones[1][3] = boton12;
            botones[1][4] = boton13;
            botones[1][5] = boton14;
            botones[1][6] = boton15;
            botones[1][7] = boton16;
            botones[2][0] = boton17;
            botones[2][1] = boton18;
            botones[2][2] = boton19;
            botones[2][3] = boton20;
            botones[2][4] = boton21;
            botones[2][5] = boton22;
            botones[2][6] = boton23;
            botones[2][7] = boton24;
            botones[3][0] = boton25;
            botones[3][1] = boton26;
            botones[3][2] = boton27;
            botones[3][3] = boton28;
            botones[3][4] = boton29;
            botones[3][5] = boton30;
            botones[3][6] = boton31;
            botones[3][7] = boton32;
            botones[4][0] = boton33;
            botones[4][1] = boton34;
            botones[4][2] = boton35;
            botones[4][3] = boton36;
            botones[4][4] = boton37;
            botones[4][5] = boton38;
            botones[4][6] = boton39;
            botones[4][7] = boton40;
            botones[5][0] = boton41;
            botones[5][1] = boton42;
            botones[5][2] = boton43;
            botones[5][3] = boton44;
            botones[5][4] = boton45;
            botones[5][5] = boton46;
            botones[5][6] = boton47;
            botones[5][7] = boton48;
            botones[6][0] = boton49;
            botones[6][1] = boton50;
            botones[6][2] = boton51;
            botones[6][3] = boton52;
            botones[6][4] = boton53;
            botones[6][5] = boton54;
            botones[6][6] = boton55;
            botones[6][7] = boton56;
            botones[7][0] = boton57;
            botones[7][1] = boton58;
            botones[7][2] = boton59;
            botones[7][3] = boton60;
            botones[7][4] = boton61;
            botones[7][5] = boton62;
            botones[7][6] = boton63;
            botones[7][7] = boton64;
            
            sc = new Socket("localhost", PUERTO);
            out = new DataOutputStream(sc.getOutputStream());

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public JButton[][] getBotones() {
        return botones;
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
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton26 = new javax.swing.JButton();
        boton27 = new javax.swing.JButton();
        boton28 = new javax.swing.JButton();
        boton29 = new javax.swing.JButton();
        boton30 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        boton34 = new javax.swing.JButton();
        boton35 = new javax.swing.JButton();
        boton36 = new javax.swing.JButton();
        boton37 = new javax.swing.JButton();
        boton38 = new javax.swing.JButton();
        boton39 = new javax.swing.JButton();
        boton40 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        boton44 = new javax.swing.JButton();
        boton45 = new javax.swing.JButton();
        boton46 = new javax.swing.JButton();
        boton47 = new javax.swing.JButton();
        boton48 = new javax.swing.JButton();
        boton49 = new javax.swing.JButton();
        boton50 = new javax.swing.JButton();
        boton51 = new javax.swing.JButton();
        boton52 = new javax.swing.JButton();
        boton53 = new javax.swing.JButton();
        boton54 = new javax.swing.JButton();
        boton55 = new javax.swing.JButton();
        boton56 = new javax.swing.JButton();
        boton57 = new javax.swing.JButton();
        boton58 = new javax.swing.JButton();
        boton59 = new javax.swing.JButton();
        boton60 = new javax.swing.JButton();
        boton61 = new javax.swing.JButton();
        boton62 = new javax.swing.JButton();
        boton63 = new javax.swing.JButton();
        boton64 = new javax.swing.JButton();
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

        boton1.setBackground(new java.awt.Color(0, 153, 204));
        boton1.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("1");
        jPanel2.add(boton1);
        boton1.setBounds(100, 330, 40, 30);

        boton2.setBackground(new java.awt.Color(0, 153, 204));
        boton2.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        jPanel2.add(boton2);
        boton2.setBounds(140, 330, 40, 30);

        boton3.setBackground(new java.awt.Color(0, 153, 204));
        boton3.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("3");
        jPanel2.add(boton3);
        boton3.setBounds(180, 330, 40, 30);

        boton4.setBackground(new java.awt.Color(0, 153, 204));
        boton4.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        jPanel2.add(boton4);
        boton4.setBounds(220, 330, 40, 30);

        boton5.setBackground(new java.awt.Color(0, 153, 204));
        boton5.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        jPanel2.add(boton5);
        boton5.setBounds(260, 330, 40, 30);

        boton6.setBackground(new java.awt.Color(0, 153, 204));
        boton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        jPanel2.add(boton6);
        boton6.setBounds(300, 330, 40, 30);

        boton7.setBackground(new java.awt.Color(0, 153, 204));
        boton7.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        jPanel2.add(boton7);
        boton7.setBounds(340, 330, 40, 30);

        boton8.setBackground(new java.awt.Color(0, 153, 204));
        boton8.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton8);
        boton8.setBounds(380, 330, 40, 30);

        boton9.setBackground(new java.awt.Color(0, 153, 204));
        boton9.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("1");
        jPanel2.add(boton9);
        boton9.setBounds(100, 360, 40, 30);

        boton10.setBackground(new java.awt.Color(0, 153, 204));
        boton10.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton10.setForeground(new java.awt.Color(255, 255, 255));
        boton10.setText("2");
        jPanel2.add(boton10);
        boton10.setBounds(140, 360, 40, 30);

        boton11.setBackground(new java.awt.Color(0, 153, 204));
        boton11.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton11.setForeground(new java.awt.Color(255, 255, 255));
        boton11.setText("3");
        jPanel2.add(boton11);
        boton11.setBounds(180, 360, 40, 30);

        boton12.setBackground(new java.awt.Color(0, 153, 204));
        boton12.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton12.setForeground(new java.awt.Color(255, 255, 255));
        boton12.setText("4");
        jPanel2.add(boton12);
        boton12.setBounds(220, 360, 40, 30);

        boton13.setBackground(new java.awt.Color(0, 153, 204));
        boton13.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton13.setForeground(new java.awt.Color(255, 255, 255));
        boton13.setText("5");
        jPanel2.add(boton13);
        boton13.setBounds(260, 360, 40, 30);

        boton14.setBackground(new java.awt.Color(0, 153, 204));
        boton14.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton14.setForeground(new java.awt.Color(255, 255, 255));
        boton14.setText("6");
        jPanel2.add(boton14);
        boton14.setBounds(300, 360, 40, 30);

        boton15.setBackground(new java.awt.Color(0, 153, 204));
        boton15.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton15.setForeground(new java.awt.Color(255, 255, 255));
        boton15.setText("7");
        jPanel2.add(boton15);
        boton15.setBounds(340, 360, 40, 30);

        boton16.setBackground(new java.awt.Color(0, 153, 204));
        boton16.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton16.setForeground(new java.awt.Color(255, 255, 255));
        boton16.setText("8");
        jPanel2.add(boton16);
        boton16.setBounds(380, 360, 40, 30);

        boton17.setBackground(new java.awt.Color(0, 153, 204));
        boton17.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton17.setForeground(new java.awt.Color(255, 255, 255));
        boton17.setText("1");
        jPanel2.add(boton17);
        boton17.setBounds(100, 390, 40, 30);

        boton18.setBackground(new java.awt.Color(0, 153, 204));
        boton18.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton18.setForeground(new java.awt.Color(255, 255, 255));
        boton18.setText("2");
        jPanel2.add(boton18);
        boton18.setBounds(140, 390, 40, 30);

        boton19.setBackground(new java.awt.Color(0, 153, 204));
        boton19.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton19.setForeground(new java.awt.Color(255, 255, 255));
        boton19.setText("3");
        jPanel2.add(boton19);
        boton19.setBounds(180, 390, 40, 30);

        boton20.setBackground(new java.awt.Color(0, 153, 204));
        boton20.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton20.setForeground(new java.awt.Color(255, 255, 255));
        boton20.setText("4");
        jPanel2.add(boton20);
        boton20.setBounds(220, 390, 40, 30);

        boton21.setBackground(new java.awt.Color(0, 153, 204));
        boton21.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton21.setForeground(new java.awt.Color(255, 255, 255));
        boton21.setText("5");
        jPanel2.add(boton21);
        boton21.setBounds(260, 390, 40, 30);

        boton22.setBackground(new java.awt.Color(0, 153, 204));
        boton22.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton22.setForeground(new java.awt.Color(255, 255, 255));
        boton22.setText("6");
        jPanel2.add(boton22);
        boton22.setBounds(300, 390, 40, 30);

        boton23.setBackground(new java.awt.Color(0, 153, 204));
        boton23.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton23.setForeground(new java.awt.Color(255, 255, 255));
        boton23.setText("7");
        jPanel2.add(boton23);
        boton23.setBounds(340, 390, 40, 30);

        boton24.setBackground(new java.awt.Color(0, 153, 204));
        boton24.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton24.setForeground(new java.awt.Color(255, 255, 255));
        boton24.setText("8");
        jPanel2.add(boton24);
        boton24.setBounds(380, 390, 40, 30);

        boton25.setBackground(new java.awt.Color(0, 153, 204));
        boton25.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton25.setForeground(new java.awt.Color(255, 255, 255));
        boton25.setText("1");
        jPanel2.add(boton25);
        boton25.setBounds(100, 420, 40, 30);

        boton26.setBackground(new java.awt.Color(0, 153, 204));
        boton26.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton26.setForeground(new java.awt.Color(255, 255, 255));
        boton26.setText("2");
        jPanel2.add(boton26);
        boton26.setBounds(140, 420, 40, 30);

        boton27.setBackground(new java.awt.Color(0, 153, 204));
        boton27.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton27.setForeground(new java.awt.Color(255, 255, 255));
        boton27.setText("3");
        jPanel2.add(boton27);
        boton27.setBounds(180, 420, 40, 30);

        boton28.setBackground(new java.awt.Color(0, 153, 204));
        boton28.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton28.setForeground(new java.awt.Color(255, 255, 255));
        boton28.setText("4");
        jPanel2.add(boton28);
        boton28.setBounds(220, 420, 40, 30);

        boton29.setBackground(new java.awt.Color(0, 153, 204));
        boton29.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton29.setForeground(new java.awt.Color(255, 255, 255));
        boton29.setText("5");
        jPanel2.add(boton29);
        boton29.setBounds(260, 420, 40, 30);

        boton30.setBackground(new java.awt.Color(0, 153, 204));
        boton30.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton30.setForeground(new java.awt.Color(255, 255, 255));
        boton30.setText("6");
        jPanel2.add(boton30);
        boton30.setBounds(300, 420, 40, 30);

        boton31.setBackground(new java.awt.Color(0, 153, 204));
        boton31.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton31.setForeground(new java.awt.Color(255, 255, 255));
        boton31.setText("7");
        jPanel2.add(boton31);
        boton31.setBounds(340, 420, 40, 30);

        boton32.setBackground(new java.awt.Color(0, 153, 204));
        boton32.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton32.setForeground(new java.awt.Color(255, 255, 255));
        boton32.setText("8");
        jPanel2.add(boton32);
        boton32.setBounds(380, 420, 40, 30);

        boton33.setBackground(new java.awt.Color(0, 153, 204));
        boton33.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton33.setForeground(new java.awt.Color(255, 255, 255));
        boton33.setText("1");
        jPanel2.add(boton33);
        boton33.setBounds(100, 450, 40, 30);

        boton34.setBackground(new java.awt.Color(0, 153, 204));
        boton34.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton34.setForeground(new java.awt.Color(255, 255, 255));
        boton34.setText("2");
        jPanel2.add(boton34);
        boton34.setBounds(140, 450, 40, 30);

        boton35.setBackground(new java.awt.Color(0, 153, 204));
        boton35.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton35.setForeground(new java.awt.Color(255, 255, 255));
        boton35.setText("3");
        jPanel2.add(boton35);
        boton35.setBounds(180, 450, 40, 30);

        boton36.setBackground(new java.awt.Color(0, 153, 204));
        boton36.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton36.setForeground(new java.awt.Color(255, 255, 255));
        boton36.setText("4");
        jPanel2.add(boton36);
        boton36.setBounds(220, 450, 40, 30);

        boton37.setBackground(new java.awt.Color(0, 153, 204));
        boton37.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton37.setForeground(new java.awt.Color(255, 255, 255));
        boton37.setText("5");
        jPanel2.add(boton37);
        boton37.setBounds(260, 450, 40, 30);

        boton38.setBackground(new java.awt.Color(0, 153, 204));
        boton38.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton38.setForeground(new java.awt.Color(255, 255, 255));
        boton38.setText("6");
        jPanel2.add(boton38);
        boton38.setBounds(300, 450, 40, 30);

        boton39.setBackground(new java.awt.Color(0, 153, 204));
        boton39.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton39.setForeground(new java.awt.Color(255, 255, 255));
        boton39.setText("7");
        jPanel2.add(boton39);
        boton39.setBounds(340, 450, 40, 30);

        boton40.setBackground(new java.awt.Color(0, 153, 204));
        boton40.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton40.setForeground(new java.awt.Color(255, 255, 255));
        boton40.setText("8");
        jPanel2.add(boton40);
        boton40.setBounds(380, 450, 40, 30);

        boton41.setBackground(new java.awt.Color(0, 153, 204));
        boton41.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton41.setForeground(new java.awt.Color(255, 255, 255));
        boton41.setText("1");
        jPanel2.add(boton41);
        boton41.setBounds(100, 480, 40, 30);

        boton42.setBackground(new java.awt.Color(0, 153, 204));
        boton42.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton42.setForeground(new java.awt.Color(255, 255, 255));
        boton42.setText("2");
        jPanel2.add(boton42);
        boton42.setBounds(140, 480, 40, 30);

        boton43.setBackground(new java.awt.Color(0, 153, 204));
        boton43.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton43.setForeground(new java.awt.Color(255, 255, 255));
        boton43.setText("3");
        jPanel2.add(boton43);
        boton43.setBounds(180, 480, 40, 30);

        boton44.setBackground(new java.awt.Color(0, 153, 204));
        boton44.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton44.setForeground(new java.awt.Color(255, 255, 255));
        boton44.setText("4");
        jPanel2.add(boton44);
        boton44.setBounds(220, 480, 40, 30);

        boton45.setBackground(new java.awt.Color(0, 153, 204));
        boton45.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton45.setForeground(new java.awt.Color(255, 255, 255));
        boton45.setText("5");
        jPanel2.add(boton45);
        boton45.setBounds(260, 480, 40, 30);

        boton46.setBackground(new java.awt.Color(0, 153, 204));
        boton46.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton46.setForeground(new java.awt.Color(255, 255, 255));
        boton46.setText("6");
        jPanel2.add(boton46);
        boton46.setBounds(300, 480, 40, 30);

        boton47.setBackground(new java.awt.Color(0, 153, 204));
        boton47.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton47.setForeground(new java.awt.Color(255, 255, 255));
        boton47.setText("7");
        jPanel2.add(boton47);
        boton47.setBounds(340, 480, 40, 30);

        boton48.setBackground(new java.awt.Color(0, 153, 204));
        boton48.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton48.setForeground(new java.awt.Color(255, 255, 255));
        boton48.setText("8");
        jPanel2.add(boton48);
        boton48.setBounds(380, 480, 40, 30);

        boton49.setBackground(new java.awt.Color(0, 153, 204));
        boton49.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton49.setForeground(new java.awt.Color(255, 255, 255));
        boton49.setText("1");
        jPanel2.add(boton49);
        boton49.setBounds(100, 510, 40, 30);

        boton50.setBackground(new java.awt.Color(0, 153, 204));
        boton50.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton50.setForeground(new java.awt.Color(255, 255, 255));
        boton50.setText("2");
        jPanel2.add(boton50);
        boton50.setBounds(140, 510, 40, 30);

        boton51.setBackground(new java.awt.Color(0, 153, 204));
        boton51.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton51.setForeground(new java.awt.Color(255, 255, 255));
        boton51.setText("3");
        jPanel2.add(boton51);
        boton51.setBounds(180, 510, 40, 30);

        boton52.setBackground(new java.awt.Color(0, 153, 204));
        boton52.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton52.setForeground(new java.awt.Color(255, 255, 255));
        boton52.setText("4");
        jPanel2.add(boton52);
        boton52.setBounds(220, 510, 40, 30);

        boton53.setBackground(new java.awt.Color(0, 153, 204));
        boton53.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton53.setForeground(new java.awt.Color(255, 255, 255));
        boton53.setText("5");
        jPanel2.add(boton53);
        boton53.setBounds(260, 510, 40, 30);

        boton54.setBackground(new java.awt.Color(0, 153, 204));
        boton54.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton54.setForeground(new java.awt.Color(255, 255, 255));
        boton54.setText("6");
        jPanel2.add(boton54);
        boton54.setBounds(300, 510, 40, 30);

        boton55.setBackground(new java.awt.Color(0, 153, 204));
        boton55.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton55.setForeground(new java.awt.Color(255, 255, 255));
        boton55.setText("7");
        jPanel2.add(boton55);
        boton55.setBounds(340, 510, 40, 30);

        boton56.setBackground(new java.awt.Color(0, 153, 204));
        boton56.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton56.setForeground(new java.awt.Color(255, 255, 255));
        boton56.setText("8");
        jPanel2.add(boton56);
        boton56.setBounds(380, 510, 40, 30);

        boton57.setBackground(new java.awt.Color(0, 153, 204));
        boton57.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton57.setForeground(new java.awt.Color(255, 255, 255));
        boton57.setText("1");
        jPanel2.add(boton57);
        boton57.setBounds(100, 540, 40, 30);

        boton58.setBackground(new java.awt.Color(0, 153, 204));
        boton58.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton58.setForeground(new java.awt.Color(255, 255, 255));
        boton58.setText("2");
        jPanel2.add(boton58);
        boton58.setBounds(140, 540, 40, 30);

        boton59.setBackground(new java.awt.Color(0, 153, 204));
        boton59.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton59.setForeground(new java.awt.Color(255, 255, 255));
        boton59.setText("3");
        jPanel2.add(boton59);
        boton59.setBounds(180, 540, 40, 30);

        boton60.setBackground(new java.awt.Color(0, 153, 204));
        boton60.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton60.setForeground(new java.awt.Color(255, 255, 255));
        boton60.setText("4");
        jPanel2.add(boton60);
        boton60.setBounds(220, 540, 40, 30);

        boton61.setBackground(new java.awt.Color(0, 153, 204));
        boton61.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton61.setForeground(new java.awt.Color(255, 255, 255));
        boton61.setText("5");
        jPanel2.add(boton61);
        boton61.setBounds(260, 540, 40, 30);

        boton62.setBackground(new java.awt.Color(0, 153, 204));
        boton62.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton62.setForeground(new java.awt.Color(255, 255, 255));
        boton62.setText("6");
        jPanel2.add(boton62);
        boton62.setBounds(300, 540, 40, 30);

        boton63.setBackground(new java.awt.Color(0, 153, 204));
        boton63.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton63.setForeground(new java.awt.Color(255, 255, 255));
        boton63.setText("7");
        jPanel2.add(boton63);
        boton63.setBounds(340, 540, 40, 30);

        boton64.setBackground(new java.awt.Color(0, 153, 204));
        boton64.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        boton64.setForeground(new java.awt.Color(255, 255, 255));
        boton64.setText("8");
        jPanel2.add(boton64);
        boton64.setBounds(380, 540, 40, 30);

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

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed

    }//GEN-LAST:event_boton8ActionPerformed

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
    private static javax.swing.JButton boton1;
    private static javax.swing.JButton boton10;
    private static javax.swing.JButton boton11;
    private static javax.swing.JButton boton12;
    private static javax.swing.JButton boton13;
    private static javax.swing.JButton boton14;
    private static javax.swing.JButton boton15;
    private static javax.swing.JButton boton16;
    private static javax.swing.JButton boton17;
    private static javax.swing.JButton boton18;
    private static javax.swing.JButton boton19;
    private static javax.swing.JButton boton2;
    private static javax.swing.JButton boton20;
    private static javax.swing.JButton boton21;
    private static javax.swing.JButton boton22;
    private static javax.swing.JButton boton23;
    private static javax.swing.JButton boton24;
    private static javax.swing.JButton boton25;
    private static javax.swing.JButton boton26;
    private static javax.swing.JButton boton27;
    private static javax.swing.JButton boton28;
    private static javax.swing.JButton boton29;
    private static javax.swing.JButton boton3;
    private static javax.swing.JButton boton30;
    private static javax.swing.JButton boton31;
    private static javax.swing.JButton boton32;
    private static javax.swing.JButton boton33;
    private static javax.swing.JButton boton34;
    private static javax.swing.JButton boton35;
    private static javax.swing.JButton boton36;
    private static javax.swing.JButton boton37;
    private static javax.swing.JButton boton38;
    private static javax.swing.JButton boton39;
    private static javax.swing.JButton boton4;
    private static javax.swing.JButton boton40;
    private static javax.swing.JButton boton41;
    private static javax.swing.JButton boton42;
    private static javax.swing.JButton boton43;
    private static javax.swing.JButton boton44;
    private static javax.swing.JButton boton45;
    private static javax.swing.JButton boton46;
    private static javax.swing.JButton boton47;
    private static javax.swing.JButton boton48;
    private static javax.swing.JButton boton49;
    private static javax.swing.JButton boton5;
    private static javax.swing.JButton boton50;
    private static javax.swing.JButton boton51;
    private static javax.swing.JButton boton52;
    private static javax.swing.JButton boton53;
    private static javax.swing.JButton boton54;
    private static javax.swing.JButton boton55;
    private static javax.swing.JButton boton56;
    private static javax.swing.JButton boton57;
    private static javax.swing.JButton boton58;
    private static javax.swing.JButton boton59;
    private static javax.swing.JButton boton6;
    private static javax.swing.JButton boton60;
    private static javax.swing.JButton boton61;
    private static javax.swing.JButton boton62;
    private static javax.swing.JButton boton63;
    private static javax.swing.JButton boton64;
    private static javax.swing.JButton boton7;
    private static javax.swing.JButton boton8;
    private static javax.swing.JButton boton9;
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
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
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
