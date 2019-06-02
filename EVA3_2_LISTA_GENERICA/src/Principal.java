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
        Lista<String> MiLista = new Lista(); 
        System.out.println("Hola");
    }
    
}

class Nodo<T>{
         //ATRIBUTO PARA ALMACENAR DATOS
    private T dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Nodo sig;

    public Nodo() {
        this.sig = null;
    }

    public Nodo(T dato) {
        this.dato = dato;
        this.sig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

class Lista<T>{
     //INICIO DE LA LISTA
    private Nodo inicio;
    
    //AL CREAR LA LISTA, INICIA CON 0 ELEMENTOS.
    //LISTA VACIA:
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS.
    public Lista() {
        inicio = null;
    }
    
    //PRIMER MÈTODO: AGREGAR UN NODO.
    //MÈTODO QUE RECIBA UN NODO.
    //EFICIENCIA --> O(N).
    public void addNodo(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA:
        //ESTÀ VACÌA?
        if(inicio == null){//LISTA VACÌA
            inicio = nNuevo;
        }else{//LISTA CON UN NODO.
            //LISTA CON N NODOS.
            //LLEVAR AL FINAL LA LISTA
            /*Nodo nTemp = inicio;
            while(nTemp.getSig() != null){
                nTemp = nTemp.getSig();
            }
            //CONECTAMOS NTEMP.SIG --> NUEVO
            nTemp.setSig(nNuevo);*/
            
            
        }
        
    }
    public void imprimir(){
        Nodo nTemp = inicio;
            while(nTemp != null){
                System.out.print("[" + nTemp.getDato() + "]");
                nTemp = nTemp.getSig();
            }
            System.out.println("");
    }  
}