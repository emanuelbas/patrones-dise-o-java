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
public class CaracteristicaCuenta implements Caracteristica {

    @Override
    public String verDetalle(Cuenta cuenta) {
        return switch (cuenta.getTipoCuenta()) {
            case "CuentaEstudiante" -> "2% interés";
            case "CuentaLaboral" -> "1% interés";
            case "CuentaMayor" -> "1.5% interés";
            case "CuentaNormal" -> "0.5% interés";
            default -> null;
        };
    }
    
}
