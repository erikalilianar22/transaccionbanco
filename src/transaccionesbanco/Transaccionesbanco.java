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
public class Transaccionesbanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        transaccion tran1=new transaccion("cobrar cheque",3);
        transaccion tran2=new transaccion("abonar a cuenta",5);
        transaccion tran3=new transaccion("retiro",10);
        transaccion tran4=new transaccion("realizar prestamo",15);
        
        Cliente cliente1=new Cliente("clienteA");
        cliente1.setTransacciones(tran4);
        
        
        
        
        
        
    }
    
}
