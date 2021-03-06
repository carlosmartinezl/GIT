/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import videojuegos.pec1.armaduras.Botas;
import videojuegos.pec1.armaduras.Casco;
import videojuegos.pec1.armaduras.Guantes;
import videojuegos.pec1.armaduras.Pechera;
import videojuegos.pec1.armas.Arma;
import videojuegos.pec1.personajes.Personaje;

/**
 *
 * @author Jorge
 */
public class PantallaEquiparPersonaje extends javax.swing.JDialog {

    JFrame anterior;
    public PantallaEquiparPersonaje(JFrame pantallaAnterior, Juego juego) throws FileNotFoundException{
        initComponents();
        anterior = pantallaAnterior;
        anterior.setVisible(false);
        this.setVisible(true);
        juego.iniciarDatos();
        personajes = juego.getPersonajes();
        armas = juego.getArmas();
        cascos = juego.getCascos();
        pecheras = juego.getPecheras();
        botas = juego.getBotas();
        guantes = juego.getGuantes();        
        iterator = personajes.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboPersonajes.addItem(nombre);
        }        
        iterator = armas.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboArmas.addItem(nombre);
        }        
        iterator = cascos.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboCascos.addItem(nombre);
        }        
        iterator = pecheras.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboPecheras.addItem(nombre);
        }        
        iterator = botas.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboBotas.addItem(nombre);
        }        
        iterator = guantes.keySet().iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            comboGuantes.addItem(nombre);
        }        
    }
    Juego juego = new Juego();    
    HashMap<String, Personaje> personajes = new HashMap<>();
    HashMap<String, Arma> armas = new HashMap<>();
    HashMap<String, Casco> cascos = new HashMap<>();
    HashMap<String, Pechera> pecheras = new HashMap<>();
    HashMap<String, Botas> botas = new HashMap<>();
    HashMap<String, Guantes> guantes = new HashMap<>();
    Iterator<String> iterator;    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separador = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        comboPersonajes = new javax.swing.JComboBox();
        labelPersonaje = new javax.swing.JLabel();
        labelArma = new javax.swing.JLabel();
        comboArmas = new javax.swing.JComboBox();
        comboCascos = new javax.swing.JComboBox();
        comboPecheras = new javax.swing.JComboBox();
        comboBotas = new javax.swing.JComboBox();
        comboGuantes = new javax.swing.JComboBox();
        labelCasco = new javax.swing.JLabel();
        labelPechera = new javax.swing.JLabel();
        labelBotas = new javax.swing.JLabel();
        labelGuantes = new javax.swing.JLabel();
        checkArma = new javax.swing.JCheckBox();
        checkCasco = new javax.swing.JCheckBox();
        checkPechera = new javax.swing.JCheckBox();
        checkBotas = new javax.swing.JCheckBox();
        checkGuantes = new javax.swing.JCheckBox();
        botonOk = new javax.swing.JButton();
        botonVerPersonaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("EQUIPAR PERSONAJE");

        labelPersonaje.setText("Elegir Personaje:");

        labelArma.setText("Elegir Arma:");

        labelCasco.setText("Elegir Casco:");

        labelPechera.setText("Elegir Pechera:");

        labelBotas.setText("Elegir Botas:");

        labelGuantes.setText("Elegir Guantes:");

        checkArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkArmaActionPerformed(evt);
            }
        });

        botonOk.setText("Ok");
        botonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkActionPerformed(evt);
            }
        });

        botonVerPersonaje.setText("O");
        botonVerPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPersonajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelArma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCasco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPechera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelBotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelGuantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonOk)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboGuantes, 0, 150, Short.MAX_VALUE)
                                    .addComponent(comboBotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboPecheras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboCascos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboPersonajes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboArmas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkArma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkCasco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkPechera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkBotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkGuantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonVerPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPersonaje)
                    .addComponent(botonVerPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelArma)
                        .addComponent(comboArmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkArma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkCasco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboCascos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCasco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPechera)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPecheras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPechera)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBotas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBotas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkGuantes)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboGuantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGuantes)))
                .addGap(18, 18, 18)
                .addComponent(botonOk)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkArmaActionPerformed
        
    }//GEN-LAST:event_checkArmaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        juego.guardarDatos(personajes,"personajes");        
        this.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkActionPerformed
        Personaje personajeAux = personajes.get(comboPersonajes.getSelectedItem().toString());
        if(checkArma.isSelected()){personajeAux.actualizarArma(armas.get(comboArmas.getSelectedItem().toString()));}
        if(checkCasco.isSelected()){personajeAux.actualizarArmadura(cascos.get(comboCascos.getSelectedItem().toString()));}
        if(checkPechera.isSelected()){personajeAux.actualizarArmadura(pecheras.get(comboPecheras.getSelectedItem().toString()));}
        if(checkBotas.isSelected()){personajeAux.actualizarArmadura(botas.get(comboBotas.getSelectedItem().toString()));}
        if(checkGuantes.isSelected()){personajeAux.actualizarArmadura(guantes.get(comboGuantes.getSelectedItem().toString()));}
        personajes.replace(personajeAux.getNombre(), personajeAux);
        juego.guardarDatos(personajes, "personajes");
        JOptionPane.showMessageDialog(null, personajeAux.toString(), "Ver Personaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonOkActionPerformed

    private void botonVerPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPersonajeActionPerformed
        Personaje personajeAux = personajes.get(comboPersonajes.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, personajeAux.toString(), "Ver Personaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonVerPersonajeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOk;
    private javax.swing.JButton botonVerPersonaje;
    private javax.swing.JCheckBox checkArma;
    private javax.swing.JCheckBox checkBotas;
    private javax.swing.JCheckBox checkCasco;
    private javax.swing.JCheckBox checkGuantes;
    private javax.swing.JCheckBox checkPechera;
    private javax.swing.JComboBox comboArmas;
    private javax.swing.JComboBox comboBotas;
    private javax.swing.JComboBox comboCascos;
    private javax.swing.JComboBox comboGuantes;
    private javax.swing.JComboBox comboPecheras;
    private javax.swing.JComboBox comboPersonajes;
    private javax.swing.JLabel labelArma;
    private javax.swing.JLabel labelBotas;
    private javax.swing.JLabel labelCasco;
    private javax.swing.JLabel labelGuantes;
    private javax.swing.JLabel labelPechera;
    private javax.swing.JLabel labelPersonaje;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
