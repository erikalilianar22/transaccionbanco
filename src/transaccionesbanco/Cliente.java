/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccionesbanco;

import java.util.ArrayList;

/**
 *
 * @author erikav
 */
class Cliente {
    private String nombre;
    private ArrayList <transaccion> transacciones;
    public Cliente(String nombre){
        this.nombre=nombre;
        transacciones=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public void setTransacciones(transaccion a){
        transacciones.add(a);
    }
    
    
}
