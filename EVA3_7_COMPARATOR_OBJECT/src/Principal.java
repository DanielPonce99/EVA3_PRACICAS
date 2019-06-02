
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> llObjetos = new LinkedList();
        llObjetos.add(new Persona());
        llObjetos.add(new Persona("Daniel", "Yañez", 19)); 
        llObjetos.add(new Persona("Juan", "Perez", 25)); 
        llObjetos.add(new Persona("Matusalen", "Jimenez", 90)); 
        llObjetos.add(new Persona("Pedro", "Picapiedra", 56)); 
        llObjetos.add(new Persona("Homero", "Jimeneo", 13)); 
        llObjetos.add(new Persona("Margaret", "Bubiere", 45)); 
        llObjetos.add(new Persona("Luisa", "Bubiere", 19)); 
        llObjetos.add(new Persona("Jorge", "Bubiere", 21)); 
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            
        }
    }
    
}
class Persona{
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public Persona() {
        Nombre = "Daniel";
        Apellidos = "Yañez";
        Edad = 19;
    }

    public Persona(String Nombre, String Apellidos, int Edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
