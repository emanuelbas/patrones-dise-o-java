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
public class Mastercard implements Tarjeta {

    public Mastercard() {
    }

    @Override
    public String getTipoTarjeta() {
        return "MASTERCARD";
    }

    @Override
    public String getNumeroTarjeta() {
        return "3235352523";
    }
    
}
