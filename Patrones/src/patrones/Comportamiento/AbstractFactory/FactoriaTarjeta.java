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
public class FactoriaTarjeta implements FactoriaAbstracta<Tarjeta> {

    @Override
    public Tarjeta create(String tipo) {
        if ("VISA".equals(tipo)){
            return new Visa();
        } else if ("MASTERCARD".equals(tipo)){
            return new Mastercard();
        } 
        return null;
    }
    
}
