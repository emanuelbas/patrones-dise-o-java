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
public class Visa implements Tarjeta {

    public Visa() {
    }
    
    @Override
    public String getTipoTarjeta() {
        return "VISA";
    }

    @Override
    public String getNumeroTarjeta() {
        return "3235352523";
    }
    
}
