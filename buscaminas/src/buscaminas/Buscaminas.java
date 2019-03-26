/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Scanner;
import menu.Menu;

/**
 *
 * @author alumno
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Menu.menu();
       Menu.menu1();
       Scanner leer=new Scanner(System.in);
       int opc=leer.nextInt();
       Tablero table;
            //selecciona el nivel del juego escogiendo el tipo de tablero con las minas que tendra 
            switch(opc){
                case 1:
                    table=new Tablero(5, 5, 10);
                    break;
                case 2:
                    table=new Tablero(10, 10, 20);
                    break;
                case 3:
                    table=new Tablero(20, 20, 40);
                    break;
                case 4:
                    int fila,columna,mina;
                    leer=new Scanner(System.in);
                    System.out.println("introduzca nº fila");
                     fila=leer.nextInt();
                    System.out.println("introduzca nº columna");
                     columna=leer.nextInt();
                    System.out.println("introduzca nº mina");
                     mina=leer.nextInt();
                    table =new Tablero(fila,columna,mina);
                     System.out.println("Su partida personalizada se ha creado");
                    break;
            }
            
       
    }
    
}
