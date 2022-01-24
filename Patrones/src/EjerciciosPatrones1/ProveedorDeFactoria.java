/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPatrones1;

/**
 *
 * @author Emanuel
 */
public class ProveedorDeFactoria {
        public static Factoria getFactoria(String factoriaSeleccionada){
        if ("Cuenta".equals(factoriaSeleccionada)){
            return new FactoriaDeCuentas();
        } else if ("Caracteristica".equals(factoriaSeleccionada)){
            return new FactoriaDeCaracteristicas();
        }
        return null;
    }
}
