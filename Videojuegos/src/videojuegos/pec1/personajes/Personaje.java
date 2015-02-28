/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1.personajes;

import videojuegos.pec1.habilidades.Habilidad;
import java.io.Serializable;
import videojuegos.pec1.armas.Arma;
import videojuegos.pec1.armaduras.Armadura;
import java.util.ArrayList;
import videojuegos.pec1.armaduras.Casco;
import videojuegos.pec1.armaduras.Guantes;
import videojuegos.pec1.armaduras.Pechera;
import videojuegos.pec1.armaduras.Botas;



/**
 *
 * @author Guillermo
 */
public class Personaje implements Serializable{
    
    //ATRIBUTOS
    private String nombre;
    private int pv;
    private int pm;
    private int pvMax;
    private int pmMax;
    private int ataqueFisico;
    private int ataqueMagico;
    private int defensaFisica;
    private int defensaMagica;
    private int nivel;
    private int exp;
    private Habilidad habilidad;
    private Arma arma;
    private Armadura armadura;

    //CONSTRUCTOR

    public Personaje(String nombre, int pvMax, int pmMax, int ataqueFisico, int ataqueMagico, int defensaFisica, int defensaMagica) {
        this.nombre = nombre;
        this.pvMax = pvMax;
        this.pmMax = pmMax;
        this.ataqueFisico = ataqueFisico;
        this.ataqueMagico = ataqueMagico;
        this.defensaFisica = defensaFisica;
        this.defensaMagica = defensaMagica;
        this.nivel = 0;
        this.exp = 0;
    }
    
    
    //GETTER & SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    public int getPvMax() {
        return pvMax;
    }
    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }       
    public int getPmMax() {
        return pmMax;
    }
    public void setPmMax(int pmMax) {
        this.pmMax = pmMax;
    }
    public int getAtaqueFisico() {
        return ataqueFisico;
    }
    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }     

    public int getAtaqueMagico() {
        return ataqueMagico;
    }
    public void setAtaqueMagico(int ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }
    public int getDefensaFisica() {
        return defensaFisica;
    }
    public void setDefensaFisica(int defensaFisica) {
        this.defensaFisica = defensaFisica;
    }
    public int getDefensaMagica() {
        return defensaMagica;
    }
    public void setDefensaMagica(int defensaMagica) {
        this.defensaMagica = defensaMagica;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public Habilidad getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public Armadura getArmadura() {
        return armadura;
    }
    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    //MÉTODOS    
    public boolean estaDerrotado(){
        return this.pvMax <= 0;
    }
    
    public boolean estaExhausto()
    {
        return this.estaExhausto();
    }
    
    public void gastar(){}
    
    public void usarHabilidad(Habilidad habilidad, Personaje personaje){
        int danyo = habilidad.getEfecto();
        personaje.setPvMax(personaje.getPvMax()+danyo);
    }
    /*
    public void combatir(ArrayList<Personaje> luchadores){ 
        int i = 0;
        int herida = 0;
        while((!(luchadores.get(0).estaDerrotado())) || (!(luchadores.get(1).estaDerrotado())))
        {
            if(i==0)
            {   
                herida = luchadores.get(i).atacar(luchadores.get(i+1));
                if((luchadores.get(i).estaDerrotado()) || (luchadores.get(i+1).estaDerrotado()) || (herida==0)){
                    break;
                }
                luchadores.get(i+1).setPv((luchadores.get(i+1).getPv()) - herida);                
                System.out.println("Pegaron a "+luchadores.get(i+1).getNombre()+", "+herida+" de daño.\nVida: "+luchadores.get(i+1).getPv()+"\n");
                i++;
            }
            if(i==1)
            {
                herida = luchadores.get(i).atacar(luchadores.get(i-1));                
                if((luchadores.get(i).estaDerrotado()) || (luchadores.get(i-1).estaDerrotado())  || (herida==0) ){
                    break;
                }
                luchadores.get(i-1).setPv((luchadores.get(i-1).getPv()) - herida);                
                System.out.println("Pegaron a "+luchadores.get(i-1).getNombre()+", "+herida+" de daño.\nVida: "+luchadores.get(i-1).getPv()+"\n");
                i--;
            }            
        }
    }
    
    private int atacar(Personaje per){
        
    }*/
        
    public void actualizarArmadura(Casco pieza){
        Casco piezaAux = this.getArmadura().getCasco();
        
        this.setPvMax(this.getPvMax() - piezaAux.getPv());
        this.setPmMax(this.getPmMax() - piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() - piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() - piezaAux.getDefensa_magica());
        this.getArmadura().setCasco(pieza);
        this.setPvMax(this.getPvMax() + piezaAux.getPv());
        this.setPmMax(this.getPmMax() + piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() + piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() + piezaAux.getDefensa_magica());
    }
    
    public void actualizarArmadura(Guantes pieza){
        Guantes piezaAux = this.getArmadura().getGuantes();
        
        this.setPvMax(this.getPvMax() - piezaAux.getPv());
        this.setPmMax(this.getPmMax() - piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() - piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() - piezaAux.getDefensa_magica());
        this.getArmadura().setGuantes(pieza);
        this.setPvMax(this.getPvMax() + piezaAux.getPv());
        this.setPmMax(this.getPmMax() + piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() + piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() + piezaAux.getDefensa_magica());
    }
    
    public void actualizarArmadura(Pechera pieza){
        Pechera piezaAux = this.getArmadura().getPechera();
        
        this.setPvMax(this.getPvMax() - piezaAux.getPv());
        this.setPmMax(this.getPmMax() - piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() - piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() - piezaAux.getDefensa_magica());
        this.getArmadura().setPechera(pieza);
        this.setPvMax(this.getPvMax() + piezaAux.getPv());
        this.setPmMax(this.getPmMax() + piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() + piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() + piezaAux.getDefensa_magica());
    }
    
    public void actualizarArmadura(Botas pieza){
        Botas piezaAux = this.getArmadura().getBotas();
        
        this.setPvMax(this.getPvMax() - piezaAux.getPv());
        this.setPmMax(this.getPmMax() - piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() - piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() - piezaAux.getDefensa_magica());
        this.getArmadura().setBotas(pieza);
        this.setPvMax(this.getPvMax() + piezaAux.getPv());
        this.setPmMax(this.getPmMax() + piezaAux.getPm());
        this.setDefensaFisica(this.getDefensaFisica() + piezaAux.getDefensa());
        this.setDefensaMagica(this.getDefensaMagica() + piezaAux.getDefensa_magica());
    }
    
    public void actualizarArma(Arma pieza){
        Arma piezaAux = this.getArma();
        
        this.setAtaqueFisico(this.getAtaqueFisico() - piezaAux.getAtaque());
        this.setAtaqueMagico(this.getAtaqueMagico() - piezaAux.getAtaque_magico());
        this.setArma(pieza);
        this.setAtaqueFisico(this.getAtaqueFisico() + piezaAux.getAtaque());
        this.setAtaqueMagico(this.getAtaqueMagico() + piezaAux.getAtaque_magico());        
    }
   
   
    @Override
    public String toString() {
        return "Pjs{" + "nombre=" + nombre + ", pv=" + pvMax + ", pm=" + pmMax + ", ataque=" + ataqueFisico + ", ataque_magico=" + ataqueMagico + ", defensa=" + defensaFisica + ", defensa_magica=" + defensaMagica + ", nivel=" + nivel + ", exp=" + exp + ", arma=" + arma + ", armadura=" + armadura + '}';
    }
}
