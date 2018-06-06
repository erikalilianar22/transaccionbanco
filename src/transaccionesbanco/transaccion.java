/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccionesbanco;

/**
 *
 * @author erikav
 */
public class transaccion {
    public int tiempo;
    public String nombre;
    public transaccion(String nombre,int tiempo){
        this.nombre=nombre;
        this.tiempo=tiempo;
    }
    
}
