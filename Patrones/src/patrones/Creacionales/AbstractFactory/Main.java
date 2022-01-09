/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Comportamiento.AbstractFactory;

/**
 *
 * @author Emanuel
 */
public class Main {
    
    public static void main(String[] args){
        FactoriaAbstracta factoriaAbstracta = ProveedorDeFactoria.getFactoria("Tarjeta");
        Tarjeta tarjeta = (Tarjeta) factoriaAbstracta.create("VISA");

        FactoriaAbstracta factoriaAbstracta1 = ProveedorDeFactoria.getFactoria("MetodoPago");
        MetodoDePago metodoPago = (MetodoDePago) factoriaAbstracta1.create("DEBITO");

        System.out.println("Una tarjeta de tipo: " + tarjeta.getTipoTarjeta() + " con el metodo de pago: " + metodoPago.pagar());
    }
    
        
}
