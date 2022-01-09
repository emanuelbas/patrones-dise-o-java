/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Creacionales.FactoryMethod;

/**
 *
 * @author Emanuel
 */
public class PagoTarjeta implements Pago {
    @Override
    public void pagar(){
        System.out.println("Registrando pago con tarjeta...");
    }
}
