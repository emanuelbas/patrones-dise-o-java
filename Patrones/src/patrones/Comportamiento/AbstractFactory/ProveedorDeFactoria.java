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
public class ProveedorDeFactoria {
    public static FactoriaAbstracta getFactoria(String factoriaSeleccionada){
        if ("Tarjeta".equals(factoriaSeleccionada)){
            return new FactoriaTarjeta();
        } else if ("MetodoPago".equals(factoriaSeleccionada)){
            return new FactoriaDeMetodoDePago();
        }
        return null;
    }
}
