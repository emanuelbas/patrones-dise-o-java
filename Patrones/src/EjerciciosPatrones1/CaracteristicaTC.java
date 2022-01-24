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
public class CaracteristicaTC implements Caracteristica {

    @Override
    public String verDetalle(Cuenta cuenta) {
        return switch (cuenta.getTipoCuenta()) {
            case "CuentaEstudiante" -> "No";
            case "CuentaLaboral" -> "$1800";
            case "CuentaMayor" -> "Gratis";
            case "CuentaNormal" -> "No";
            default -> null;
        };
    }
}
