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
public class FactoriaDeMetodoDePago implements FactoriaAbstracta<MetodoDePago> {

    @Override
    public MetodoDePago create(String tipo) {
        if ("CREDITO".equals(tipo)){
            return new MetodoCredito();
        } else if ("DEBITO".equals(tipo)){
            return new MetodoDebito();
        }
        return null;
    }
    
}
