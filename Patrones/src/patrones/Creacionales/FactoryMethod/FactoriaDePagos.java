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
public class FactoriaDePagos {
    public static Pago armarPago(TipoDePago tipoPago){
        return switch (tipoPago) {
            case TARJETA -> new PagoTarjeta();
            case EFECTIVO -> new PagoEfectivo();
            default -> new PagoEfectivo();
        };
    }
}
