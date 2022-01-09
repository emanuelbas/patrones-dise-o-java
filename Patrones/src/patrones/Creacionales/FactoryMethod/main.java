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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pago pago = FactoriaDePagos.armarPago(TipoDePago.TARJETA);
        pago.pagar();
        Pago pago2 = FactoriaDePagos.armarPago(TipoDePago.EFECTIVO);
        pago2.pagar();
    }
    
}
