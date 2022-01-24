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
public class CaracteristicaPremio implements Caracteristica {

    @Override
    public String verDetalle(Cuenta cuenta) {
        return switch (cuenta.getTipoCuenta()) {
            case "CuentaEstudiante" -> "Muchila";
            case "CuentaLaboral" -> "Botella de vino";
            case "CuentaMayor" -> "Botella de vino";
            case "CuentaNormal" -> "Botella de vino";
            default -> null;
        };
    }
    
}
