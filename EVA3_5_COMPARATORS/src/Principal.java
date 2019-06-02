
import java.util.Comparator;
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
        //COMPAATOR --> MECANISMO DE ORDENAMIENTO
        LinkedList<Integer> llDatos = new LinkedList();
        llDatos.add(100);
        llDatos.add(800);
        llDatos.add(400);
        llDatos.add(500);
        llDatos.add(200);
        System.out.println(llDatos);
        
        Comparator cmOrdena=new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //HAY QUE REGRESAR POSITIVO NEGATIVO Y CERO
                int iVal1 = (int) o1;
                int iVal2 = (int) o2;
                return iVal1 - iVal2;
                
            }
        };
        llDatos.sort(cmOrdena);
                System.out.println(llDatos);
        /*
        DEVUELVE UN VALOR PARA ESTABLECER LA COMPARACION 
        
        A VS B
        
        ENTERO -->POSITIVO CERO NEGATIVO
        */
    }
    
}
