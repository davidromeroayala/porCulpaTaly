/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author alumno
 */
public class Tablero {
 private  int numFilas; 
 private  int numColumnas; 
 private  int numMinas; 
 private  Casilla[][] tabla; 

    public Tablero(int numFilas, int numColumnas,int numMinas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas= numMinas;
        this.tabla =new Casilla[numFilas][numColumnas];
    }

    public void  insertarMinas(int minas) {
           
    }
    
    public void imprimirPrueba(){
    
    }
    
    public int calculaNumMinasCasilla(int fila,int columna){
        int num=0;
        return num;
    }
    public Casilla getCasilla(int fila,int columna){
        Casilla a=new Casilla();
        return a;
    }
    public void calcularTablero(){
    
    }
}
