/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author MAQD13
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new java.awt.BorderLayout());

        header.setPreferredSize(new java.awt.Dimension(1280, 200));
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setText("Escoge una película");
        header.add(label1);

        add(header, java.awt.BorderLayout.PAGE_START);

        catalogo.setLayout(new java.awt.GridLayout(1, 4, 30, 30));

        jButton1.setText("jButton1");
        catalogo.add(jButton1);

        jButton3.setText("jButton3");
        catalogo.add(jButton3);

        jButton2.setText("jButton2");
        catalogo.add(jButton2);

        jButton4.setText("jButton4");
        catalogo.add(jButton4);

        add(catalogo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel catalogo;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
