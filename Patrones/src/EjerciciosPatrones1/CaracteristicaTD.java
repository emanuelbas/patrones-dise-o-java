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
public class CaracteristicaTD implements Caracteristica {

    @Override
    public String verDetalle(Cuenta cuenta) {
        return switch (cuenta.getTipoCuenta()) {
            case "CuentaEstudiante" -> "Gratis";
            case "CuentaLaboral" -> "Gratis";
            case "CuentaMayor" -> "Gratis";
            case "CuentaNormal" -> "$1000";
            default -> null;
        };
    }
    
}
