/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import videojuegos.pec1.habilidades.Habilidad;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import videojuegos.pec1.armaduras.Botas;
import videojuegos.pec1.armaduras.Casco;
import videojuegos.pec1.armaduras.Guantes;
import videojuegos.pec1.armaduras.Pechera;
import videojuegos.pec1.armas.Arma;
import videojuegos.pec1.enemigos.Enemigo;
import videojuegos.pec1.personajes.Personaje;

/**
 *
 * @author Jorge
 */
public class Juego { 
    
    //LISTAS
    public static HashMap<String, Personaje> personajes = new HashMap<>();
    public static HashMap<String, Habilidad> habilidades = new HashMap<>();
    public static HashMap<String, Arma> armas = new HashMap<>();
    public static HashMap<String, Casco> cascos = new HashMap<>();
    public static HashMap<String, Pechera> pecheras = new HashMap<>();
    public static HashMap<String, Botas> botas = new HashMap<>();
    public static HashMap<String, Guantes> guantes = new HashMap<>();
    public static HashMap<String, Enemigo> enemigos = new HashMap<>();
    
    //CONSTRUCTOR
    public Juego() throws FileNotFoundException {}
    
    //GETTER & SETTER
    public  HashMap<String, Personaje> getPersonajes() {
        return personajes;
    }
    public void setPersonas(HashMap<String, Personaje> personajes) {
        Juego.personajes = personajes;
    }    
    public HashMap<String, Arma> getArmas() {
        return armas;
    }
    public void setArmas(HashMap<String, Arma> armas) {
        Juego.armas = armas;
    }    
    public static HashMap<String, Casco> getCascos() {
        return cascos;
    }
    public static void setCascos(HashMap<String, Casco> cascos) {
        Juego.cascos = cascos;
    }
    public static HashMap<String, Pechera> getPecheras() {
        return pecheras;
    }
    public static void setPecheras(HashMap<String, Pechera> pecheras) {
        Juego.pecheras = pecheras;
    }
    public static HashMap<String, Botas> getBotas() {
        return botas;
    }
    public static void setBotas(HashMap<String, Botas> botas) {
        Juego.botas = botas;
    }
    public static HashMap<String, Guantes> getGuantes() {
        return guantes;
    }
    public static void setGuantes(HashMap<String, Guantes> guantes) {
        Juego.guantes = guantes;
    } 
    public HashMap<String, Enemigo> getEnemigos() {
        return enemigos;
    }
    public void setEnemigos(HashMap<String, Enemigo> enemigos) {
        Juego.enemigos = enemigos;
    }    
    public HashMap<String, Habilidad> getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(HashMap<String, Habilidad> habilidades) {
        Juego.habilidades = habilidades;
    }
        
    //METODOS
    public void nuevaPartida(){}    
    
    public void reiniciar(){}    
    
    public void iniciarJuego(){}   
    
    public void iniciarDatos() throws FileNotFoundException{
        this.cargarPersonajes("personajes");
        this.cargarArmas("armas");
        this.cargarCascos("cascos");
        this.cargarPecheras("pecheras");
        this.cargarBotas("botas");
        this.cargarGuantes("guantes");
        /*this.cargarDatos("enemigos");
        this.cargarDatos("habilidades");*/
    } 
        
    public void guardarDatos(HashMap clase, String nombre) {
        try{
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(nombre+".dat"));
            ficheroSalida.writeObject(clase);
            ficheroSalida.flush();
            ficheroSalida.close();
        }catch (IOException ioe) {
            System.out.println("Error IO: " + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    public void cargarPersonajes(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            personajes = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    public void cargarArmas(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            armas = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    public void cargarCascos(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            cascos = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    public void cargarPecheras(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            pecheras = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    public void cargarBotas(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            botas = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    public void cargarGuantes(String nombre){
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(nombre+".dat"));
            guantes = (HashMap) ficheroEntrada.readObject();
            ficheroEntrada.close();            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada:" + cnfe.toString());
        }catch (IOException ioe) {
            System.out.println("Error IO:" + ioe.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
