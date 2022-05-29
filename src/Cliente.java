
import java.awt.Color;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.*;

public class Cliente extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;

    public Cliente() {
        this.setTitle("Catalogo");
        initComponents();
        this.setSize(catalogo.getSize());
        this.pintarImagen(this.jButton1, "src/img/PortadaDS2.jpg");
        this.pintarImagen(this.jButton2, "src/img/PortadaMorb.jpg");
        this.pintarImagen(this.jButton3, "src/img/PortadaX.jpg");
        this.pintarImagen(this.jButton4, "src/img/PortadaBat.jpg");
        this.setLocationRelativeTo(null);
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
        formulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        catalogo.setLayout(null);

        jButton1.setText("jButton1");
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

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(100, 340, 310, 40);

        formulario.add(jPanel1);
        jPanel1.setBounds(60, 30, 510, 677);

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
        catalogo.setVisible(false);
        formulario.setVisible(true);
        this.setSize(633,763);
        this.setTitle("Formulario");
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JPanel catalogo;
    private javax.swing.JPanel formulario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
