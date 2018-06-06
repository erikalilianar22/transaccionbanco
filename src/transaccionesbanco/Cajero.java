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
public class Cajero extends Thread{
    public String nombre;
    public Cliente cliente;
    public long initialTime;
    public ArrayList<transaccion> transacciones;
    
    
    public Cajero(String nombre){
        this.nombre=nombre;
        
        transacciones=new ArrayList<>();
    }
    
    @Override
    public void run(){
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA TRANSACCION DEL CLIENTE " 
					+ this.cliente.getNombre() + " EN EL TIEMPO: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");
        transacciones=cliente.getTransacciones();

		for (transaccion e: transacciones) { 
			
			System.out.println("Procesado la transaccion " + e.nombre 
			+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
			+ (System.currentTimeMillis() - this.initialTime) / 1000 
			+ "seg");
                        this.esperarXsegundos(e); 
		}

		System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " 
						+ this.cliente.getNombre() + " EN EL TIEMPO: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
	
        
        
    }
    
    private void esperarXsegundos(transaccion segundos) {
                   
		try {
			Thread.sleep(segundos.tiempo * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    public void setCliente(Cliente cliente, long time){
        this.cliente=cliente;
        this.initialTime=time;
    }
    
}
