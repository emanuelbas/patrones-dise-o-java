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
public class FactoriaDeCaracteristicas implements Factoria {

    @Override
    public Object create(String tipo) {
       
        return switch (tipo) {
            case "Cuenta" -> new CaracteristicaCuenta();
            case "Premio" -> new CaracteristicaPremio();
            case "TD" -> new CaracteristicaTD();
            case "TC" -> new CaracteristicaTC();
            default -> null;
        };
    }
    
}
