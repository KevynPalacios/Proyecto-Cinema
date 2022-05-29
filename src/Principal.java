
import java.awt.Color;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.*;

public class Principal extends javax.swing.JPanel {

    private ImageIcon imagen;
    private Icon icono;

    public Principal() {
        initComponents();
        this.pintarImagen(this.jButton1, "src/img/PortadaDS2.jpg");
        this.pintarImagen(this.jButton2, "src/img/PortadaMorb.jpg");
        this.pintarImagen(this.jButton3, "src/img/PortadaX.jpg");
        this.pintarImagen(this.jButton4, "src/img/PortadaBat.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        catalogo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new java.awt.BorderLayout());

        header.setPreferredSize(new java.awt.Dimension(1280, 200));
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setText("Escoge una película");
        header.add(label1);

        add(header, java.awt.BorderLayout.PAGE_START);

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
        jButton1.setBounds(20, 10, 301, 470);

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
        jButton3.setBounds(640, 10, 300, 470);

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
        jButton2.setBounds(330, 10, 300, 470);

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
        jButton4.setBounds(950, 10, 300, 470);

        add(catalogo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBounds(20, 0, 301, 470);
    }//GEN-LAST:event_jButton1MouseEntered
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBounds(20, 10, 301, 470);
    }//GEN-LAST:event_jButton1MouseExited
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBounds(330, 0, 300, 470);
    }//GEN-LAST:event_jButton2MouseEntered
    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBounds(330, 10, 300, 470);
    }//GEN-LAST:event_jButton2MouseExited
    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBounds(640, 0, 300, 470);
    }//GEN-LAST:event_jButton3MouseEntered
    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBounds(640, 10, 300, 470);
    }//GEN-LAST:event_jButton3MouseExited
    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBounds(950, 0, 300, 470);
    }//GEN-LAST:event_jButton4MouseEntered
    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBounds(950, 10, 300, 470);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel catalogo;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables

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
}
