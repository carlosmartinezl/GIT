/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import java.io.FileNotFoundException;
import java.util.HashMap;
import javax.swing.JFrame;
import static videojuegos.pec1.Juego.armas;
import videojuegos.pec1.armaduras.Casco;
import videojuegos.pec1.armas.Arco;
import videojuegos.pec1.armas.Arma;
import videojuegos.pec1.armas.Baston;
import videojuegos.pec1.armas.Espada;

/**
 *
 * @author Jorge
 */
public class PantallaCrearArma extends javax.swing.JDialog {

    /**
     * Creates new form PantallaCrearArma
     */
    JFrame anterior;
    public PantallaCrearArma(JFrame pantallaAnterior, Juego juego) throws FileNotFoundException {
        initComponents();
        anterior = pantallaAnterior;
        anterior.setVisible(false);
        this.setVisible(true);
        juego.iniciarDatos();
        armas = juego.getArmas();
    }
    Juego juego = new Juego();    
    HashMap<String, Arma> armas = new HashMap<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAtqFis = new javax.swing.JTextField();
        textRecurso = new javax.swing.JTextField();
        textAtqMag = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelRecurso = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        comboTipo = new javax.swing.JComboBox();
        textDurabilidad = new javax.swing.JTextField();
        labelRaza = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelAtqFis = new javax.swing.JLabel();
        labelAtqMag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textAtqFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAtqFisActionPerformed(evt);
            }
        });

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ARMA");

        labelRecurso.setText("recurso");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arco", "Bastón", "Espada" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        textDurabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDurabilidadActionPerformed(evt);
            }
        });

        labelRaza.setText("Tipo:");

        jLabel1.setText("Durabilidad:");

        labelNombre.setText("Nombre: ");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        labelAtqFis.setText("Atq. Físico:");

        labelAtqMag.setText("Atq. Mágico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textDurabilidad)
                                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelAtqFis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAtqMag, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAtqFis)
                                    .addComponent(textAtqMag)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonOK)
                                    .addComponent(textRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDurabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtqFis)
                    .addComponent(textAtqFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtqMag)
                    .addComponent(textAtqMag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRaza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRecurso))
                .addGap(18, 18, 18)
                .addComponent(botonOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAtqFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAtqFisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAtqFisActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        String seleccion = (String) comboTipo.getSelectedItem();
        String nombre = textNombre.getText();
        int durabilidad = Integer.parseInt(textDurabilidad.getText());
        int atqFis = Integer.parseInt(textAtqFis.getText());
        int atqMag = Integer.parseInt(textAtqMag.getText());
        int recurso = Integer.parseInt(textRecurso.getText());
        switch(seleccion){
            case "Arco":  {
                Arco arma = new Arco(nombre, durabilidad, atqFis, atqMag, recurso);
                armas.put(nombre, arma);
                juego.guardarDatos(armas, "armas");
                break;
            }
            case "Bastón":  {
                Baston arma = new Baston(nombre, durabilidad, atqFis, atqMag, recurso);
                armas.put(nombre, arma);
                juego.guardarDatos(armas, "armas");
                break;
            }
            case "Espada":  {
                Espada arma = new Espada(nombre, durabilidad, atqFis, atqMag, recurso);
                armas.put(nombre, arma);
                juego.guardarDatos(armas, "armas");
                break;
            }
            /*case "Daga":  {
                Daga arma = new Daga(nombre, durabilidad, atqFis, atqMag, recurso);
                armas.put(nombre, arma);
                juego.guardarDatos(armas, "armas");
                break;
            }
            case "Maza":  {
                Maza arma = new Maza(nombre, durabilidad, atqFis, atqMag, recurso);
                armas.put(nombre, arma);
                juego.guardarDatos(armas, "armas");
                break;
            }*/            
        }
    }//GEN-LAST:event_botonOKActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        String seleccion = (String) comboTipo.getSelectedItem().toString();
        switch(seleccion){
            case "Arco":  {
                                labelRecurso.setText("Nº Flechas:");
                                break;
                            }
            case "Bastón":  {
                                labelRecurso.setText("Magia:");
                                break;
                            }              
            case "Espada":  {
                                labelRecurso.setText("Stamina:");
                                break;
                            }                                
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void textDurabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDurabilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDurabilidadActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        juego.guardarDatos(armas, "armas");
        this.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOK;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAtqFis;
    private javax.swing.JLabel labelAtqMag;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelRecurso;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField textAtqFis;
    private javax.swing.JTextField textAtqMag;
    private javax.swing.JTextField textDurabilidad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textRecurso;
    // End of variables declaration//GEN-END:variables
}
