/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import java.awt.Component;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import videojuegos.pec1.armas.Arco;
import videojuegos.pec1.armas.Arma;
import videojuegos.pec1.armas.Baston;
import videojuegos.pec1.armas.Espada;
import videojuegos.pec1.personajes.Druida;
import videojuegos.pec1.personajes.Kender;
import videojuegos.pec1.personajes.Nigromante;
import videojuegos.pec1.personajes.Personaje;

/**
 *
 * @author Jorge
 */
public class PantallaCrearPersonaje extends javax.swing.JFrame {

    /**
     * Creates new form CrearPersonaje
     * @throws java.io.FileNotFoundException
     */
    JFrame anterior;
    public PantallaCrearPersonaje(JFrame pantallaAnterior, Juego juego) throws FileNotFoundException {
        initComponents();
        anterior = pantallaAnterior;
        //anterior.setVisible(false);
        this.setVisible(true);
        juego.iniciarDatos();
        armas = juego.getArmas();
        personajes = juego.getPersonajes();
        comboRaza.setSelectedIndex(0);
        checkArma.doClick();
        comboTipoArma.setSelectedItem("Bastón");
    }
    Juego juego = new Juego();    
    ArrayList<Arma> armas = new ArrayList<Arma>();
    ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        comboRaza = new javax.swing.JComboBox();
        labelRaza = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelPV = new javax.swing.JLabel();
        labelDestreza = new javax.swing.JLabel();
        textPV = new javax.swing.JTextField();
        textDestreza = new javax.swing.JTextField();
        labelMana = new javax.swing.JLabel();
        labelEnergia = new javax.swing.JLabel();
        textMana = new javax.swing.JTextField();
        textEnergia = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboTipoArma = new javax.swing.JComboBox();
        labelTipoArma = new javax.swing.JLabel();
        labelNombreArma = new javax.swing.JLabel();
        labelRecurso = new javax.swing.JLabel();
        labelDanyo = new javax.swing.JLabel();
        textRecursoArma = new javax.swing.JTextField();
        textDanyo = new javax.swing.JTextField();
        checkArma = new javax.swing.JCheckBox();
        textNombreArma = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        comboRaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kender", "Nigromante", "Druida" }));
        comboRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRazaActionPerformed(evt);
            }
        });

        labelRaza.setText("Raza:");

        labelNombre.setText("Nombre: ");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        labelPV.setText("PV: ");

        labelDestreza.setText("Destreza:");

        textPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPVActionPerformed(evt);
            }
        });

        labelMana.setText("Mana: ");

        labelEnergia.setText("Energia: ");

        textMana.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textManaPropertyChange(evt);
            }
        });

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        labelTitulo.setText("PERSONAJE");

        comboTipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bastón", "Espada", "Arco" }));
        comboTipoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoArmaActionPerformed(evt);
            }
        });

        labelTipoArma.setText("Tipo de Arma:");

        labelNombreArma.setText("Nombre Arma:");

        labelRecurso.setText("Recurso:");

        labelDanyo.setText("Daño: ");

        textRecursoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRecursoArmaActionPerformed(evt);
            }
        });

        checkArma.setText("Crear con Arma");
        checkArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDestreza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textMana, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDestreza)
                            .addComponent(textNombre)
                            .addComponent(textPV)
                            .addComponent(comboRaza, javax.swing.GroupLayout.Alignment.TRAILING, 0, 119, Short.MAX_VALUE)
                            .addComponent(textEnergia))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNombreArma, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(labelTipoArma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDanyo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textNombreArma)
                                    .addComponent(textRecursoArma)
                                    .addComponent(textDanyo))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkArma)
                                    .addComponent(botonOK))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkArma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPV)
                    .addComponent(textPV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoArma)
                    .addComponent(comboTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDestreza)
                    .addComponent(textDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreArma)
                    .addComponent(textNombreArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRaza))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRecurso)
                            .addComponent(textRecursoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMana)
                    .addComponent(textMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDanyo)
                    .addComponent(textDanyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnergia)
                    .addComponent(textEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        String seleccion = (String) comboRaza.getSelectedItem();
        String nombre = textNombre.getText();
        int pv = Integer.parseInt(textPV.getText());
        int destreza = Integer.parseInt(textDestreza.getText());
        Arma arma = null;
        if(checkArma.isSelected())
        {       
            String tipoArma = (String) comboTipoArma.getSelectedItem();
            String nombreArma = textNombreArma.getText();
            int danyo = Integer.parseInt(textDanyo.getText());
            
            switch(tipoArma){
                case "Bastón":  {                                
                                    int magia = Integer.parseInt(textRecursoArma.getText());
                                    Baston armaAux = new Baston(nombreArma,danyo,magia);
                                    arma=armaAux;
                                    armas.add(armaAux);
                                    juego.guardarObjeto(armas, "armas");                                    
                                    break;
                                }
                case "Arco":    {
                                    int flechas = Integer.parseInt(textRecursoArma.getText());
                                    Arco armaAux = new Arco(nombreArma,danyo,flechas);
                                    arma=armaAux;
                                    armas.add(armaAux);
                                    juego.guardarObjeto(armas, "armas");
                                    break;
                                }              
                case "Espada":  {
                                    int resistencia = Integer.parseInt(textRecursoArma.getText());
                                    Espada armaAux = new Espada(nombreArma,danyo,resistencia);
                                    arma=armaAux;
                                    armas.add(armaAux);
                                    juego.guardarObjeto(armas, "armas");
                                    break;
                                }                                
            }                        
            switch(seleccion){
                case "Kender":  {                                
                                    int energia = Integer.parseInt(textEnergia.getText());
                                    Kender personajeAux = new Kender(nombre,pv,destreza,arma,energia);
                                    personajes.add(personajeAux);
                                    juego.guardarObjeto(personajes, "personajes");
                                    break;
                                }
                case "Nigromante":  {
                                        int mana = Integer.parseInt(textMana.getText());
                                        Nigromante personajeAux = new Nigromante(nombre,pv,destreza,arma,mana);
                                        personajes.add(personajeAux);
                                        juego.guardarObjeto(personajes, "personajes");
                                        break;
                                    }              
                case "Druida":  {
                                    int energia = Integer.parseInt(textEnergia.getText());
                                    int mana = Integer.parseInt(textMana.getText());
                                    Druida personajeAux = new Druida(nombre,pv,destreza,arma,energia, mana);
                                    personajes.add(personajeAux);
                                    juego.guardarObjeto(personajes, "personajes");
                                    break;
                                }                                
            }
        }
        else{
            switch(seleccion){
                case "Kender":  {                                
                                    int energia = Integer.parseInt(textEnergia.getText());
                                    Kender personajeAux = new Kender(nombre,pv,destreza,energia);
                                    personajes.add(personajeAux);
                                    juego.guardarObjeto(personajes, "personajes");
                                    break;
                                }
                case "Nigromante":  {
                                        int mana = Integer.parseInt(textMana.getText());
                                        Nigromante personajeAux = new Nigromante(nombre,pv,destreza,mana);
                                        personajes.add(personajeAux);
                                        juego.guardarObjeto(personajes, "personajes");
                                        break;
                                    }              
                case "Druida":  {
                                    int energia = Integer.parseInt(textEnergia.getText());
                                    int mana = Integer.parseInt(textMana.getText());
                                    Druida personajeAux = new Druida(nombre,pv,destreza,energia, mana);
                                    personajes.add(personajeAux);
                                    juego.guardarObjeto(personajes, "personajes");
                                    break;
                                }                                
            }
        }
        
        
    }//GEN-LAST:event_botonOKActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPVActionPerformed

    private void textManaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textManaPropertyChange
        //VACIO 
    }//GEN-LAST:event_textManaPropertyChange

    private void comboRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRazaActionPerformed
        String seleccion = (String) comboRaza.getSelectedItem().toString();
        switch(seleccion){
            case "Kender":  {
                                textMana.setEditable(false);
                                textMana.setEnabled(false);
                                textEnergia.setEditable(true);
                                textEnergia.setEnabled(true);
                                break;
                            }
            case "Nigromante":  {
                                    textMana.setEditable(true);
                                    textMana.setEnabled(true);
                                    textEnergia.setEditable(false);
                                    textEnergia.setEnabled(false);
                                    break;
                                }              
            case "Druida":  {
                                textMana.setEditable(true);
                                textMana.setEnabled(true);
                                textEnergia.setEditable(true);
                                textEnergia.setEnabled(true);
                                break;
                            }                                
        }
    }//GEN-LAST:event_comboRazaActionPerformed

    private void textRecursoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRecursoArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRecursoArmaActionPerformed

    private void comboTipoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoArmaActionPerformed
        String seleccion = (String) comboTipoArma.getSelectedItem().toString();
        switch(seleccion){
            case "Bastón":  {
                                labelRecurso.setText("Magia:");
                                break;
                            }
            case "Espada":  {
                                labelRecurso.setText("Resistencia:");
                                break;
                            }              
            case "Arco":    {
                                labelRecurso.setText("Flechas:");
                                break;
                            }                                
        }
    }//GEN-LAST:event_comboTipoArmaActionPerformed

    private void checkArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkArmaActionPerformed
        if(checkArma.isSelected())
        {
            comboTipoArma.setEnabled(true);
            textNombreArma.setEnabled(true);
            textDanyo.setEnabled(true);
            textRecursoArma.setEnabled(true);
        }
        else{
            comboTipoArma.setEnabled(false);
            textNombreArma.setEnabled(false);
            textDanyo.setEnabled(false);
            textRecursoArma.setEnabled(false);
        }
    }//GEN-LAST:event_checkArmaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        juego.guardarObjeto(armas, "armas");
        juego.guardarObjeto(personajes, "personajes");
        this.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOK;
    private javax.swing.JCheckBox checkArma;
    private javax.swing.JComboBox comboRaza;
    private javax.swing.JComboBox comboTipoArma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDanyo;
    private javax.swing.JLabel labelDestreza;
    private javax.swing.JLabel labelEnergia;
    private javax.swing.JLabel labelMana;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreArma;
    private javax.swing.JLabel labelPV;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelRecurso;
    private javax.swing.JLabel labelTipoArma;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textDanyo;
    private javax.swing.JTextField textDestreza;
    private javax.swing.JTextField textEnergia;
    private javax.swing.JTextField textMana;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombreArma;
    private javax.swing.JTextField textPV;
    private javax.swing.JTextField textRecursoArma;
    // End of variables declaration//GEN-END:variables
}
