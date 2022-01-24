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
public class FactoriaDeCuentas implements Factoria {

    @Override
    public Object create(String tipo) {
       
        return switch (tipo) {
            case "Estudiante" -> new CuentaEstudiante();
            case "Laboral" -> new CuentaLaboral();
            case "Mayor" -> new CuentaMayor();
            case "Normal" -> new CuentaNormal();
            default -> null;
        };
    }
    
}
