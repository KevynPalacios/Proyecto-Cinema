
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Juan Carlos
 */
public class GUI extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form GUI
     */
    ArrayList<Datos> sala1 = new ArrayList<>(36);
    ArrayList<Datos> sala2 = new ArrayList<>(36);
    ArrayList<Datos> sala3 = new ArrayList<>(36);
    ArrayList<Datos> sala4 = new ArrayList<>(36);

    ArrayList<Datos> aux = new ArrayList<>();

    Archivo_generics<Datos> sala1_a = new Archivo_generics<Datos>("sala1.ser");
    Archivo_generics<Datos> sala2_a = new Archivo_generics<Datos>("sala2.ser");
    Archivo_generics<Datos> sala3_a = new Archivo_generics<Datos>("sala3.ser");
    Archivo_generics<Datos> sala4_a = new Archivo_generics<Datos>("sala4.ser");

    DefaultTableModel dft;

    public GUI() {
        initComponents();
        jButton1.setEnabled(false);
        initModelTable();
        Thread thread = new Thread(this);
        thread.start();
        
    }

    private void initModelTable() {
        dft = new DefaultTableModel();
        String cabecera[] = {"Sala", "Pelicula", "Nombre", "Cantidad"};
        dft.setColumnIdentifiers(cabecera);
        table.setModel(dft);
    }

    private void updateTable(ArrayList<Datos> sala) {
        Object[] elementos = new Object[dft.getColumnCount()];
        dft.setRowCount(0);

        for (Datos dato : sala) {
            elementos[0] = dato.getSala();
            elementos[1] = dato.getPelicula();
            elementos[2] = dato.getNombre();
            elementos[3] = dato.getAsientos();
            dft.addRow(elementos);
        }
        table.setModel(dft);
        validate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema database server");

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 150));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar elemento:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 50, 290, 17);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(300, 50, 290, 25);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 80, 290, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ordenar por:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 100, 17);

        comboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala", "Pelicula", "Nombre", "Asientos" }));
        comboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(comboBox2);
        comboBox2.setBounds(300, 20, 100, 25);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CINEMA DATABASE ");
        jPanel3.add(jLabel3);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Datos> array = new ArrayList<>();
        int pos = Collections.binarySearch(aux, new Datos(0, "", jTextField1.getText(), 0, 0));
        if (pos!=-1)
            array.add(aux.get(pos));
        updateTable(array);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2ActionPerformed
        if (comboBox2.getSelectedItem().equals("Nombre")) {
            Collections.sort(aux);
            updateTable(aux);
            jButton1.setEnabled(true);
        } else if (comboBox2.getSelectedItem().equals("Asientos")) {
            Collections.sort(aux,new OrdenarPorAsiento());
            updateTable(aux);
            jButton1.setEnabled(false);
        } else if (comboBox2.getSelectedItem().equals("Pelicula")){
            Collections.sort(aux,new OrdenarPorPelicula());
            updateTable(aux);
            jButton1.setEnabled(false);
        } else {
            Collections.sort(aux,new OrdenarPorSala());
            updateTable(aux);
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_comboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        sala1 = sala1_a.leerRegistros();
        sala2 = sala2_a.leerRegistros();
        sala3 = sala3_a.leerRegistros();
        sala4 = sala4_a.leerRegistros();

        if (!sala1.isEmpty()) {
            addInformation(sala1);
        }
        if (!sala2.isEmpty()) {
            addInformation(sala2);
        }
        if (!sala3.isEmpty()) {
            addInformation(sala3);
        }
        if (!sala4.isEmpty()) {
            addInformation(sala4);
        }

        updateTable(aux);

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        int PUERTO = 9999;

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
                    Datos datos = new Datos(inSala, inPelicula, inNombre, inCantidad, inSala);
                    switch (inSala) {
                        case 1:
                            sala1.add(datos);
                            sala1_a.actualizarRegistros(sala1);
                            break;
                        case 2:
                            sala2.add(datos);
                            sala2_a.actualizarRegistros(sala2);
                            break;
                        case 3:
                            sala3.add(datos);
                            sala3_a.actualizarRegistros(sala3);
                            break;
                        case 4:
                            sala4.add(datos);
                            sala4_a.actualizarRegistros(sala4);
                            break;
                    }
                    aux.add(datos);
                    updateTable(aux);
                }
                sc.close();
                System.out.println("Cliente desconectado...");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addInformation(ArrayList<Datos> info) {
        for (Datos datos : info) {
            aux.add(datos);
        }
    }

}
