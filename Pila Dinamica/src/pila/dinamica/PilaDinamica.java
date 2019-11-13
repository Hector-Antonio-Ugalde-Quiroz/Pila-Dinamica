/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila.dinamica;

import javax.swing.JOptionPane;

/**
 *
 * @author heuga
 */
public class PilaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         int Opcion,a;
        Pila objpilaEnteros = new Pila();
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Ingresar Dato\n"+
                    "2. Quitar\n"+
                    "3. Cima de la Pila\n"+
                    "4. Pila Vacia\n"+
                    "5. Limpiar Pila\n"+
                    "6. Mostrar\n"+        
                    "7. Salir\n"+
                    "--------------------------------------------------------\n"+
                    "Seleccione una opcion","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             

            switch(Opcion)
            {
                case 1: 
                    a=Integer.parseInt(JOptionPane.showInputDialog(null," ingresa el numero que se unira a la pila"));
                    objpilaEnteros.insertar(a);break;
                case 2: objpilaEnteros.quitar();break;
                case 3: objpilaEnteros.cimaPila();break;
                case 4: objpilaEnteros.pilaVacia();break;
                case 5: objpilaEnteros.limpiarPila();break;
                case 6: objpilaEnteros.mostrarpila();break;
                case 7: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }while(true); 
    }
    
}
