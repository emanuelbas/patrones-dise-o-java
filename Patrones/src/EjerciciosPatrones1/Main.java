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
public class Main {
    
    public static void main(String[] args){
   
        Factoria factoriaCuentas = ProveedorDeFactoria.getFactoria("Cuenta");
        Factoria factoriaCaracteristicas = ProveedorDeFactoria.getFactoria("Caracteristica");
        
        Cuenta cuenta = (Cuenta) factoriaCuentas.create("Estudiante");
        Caracteristica caracteristica = (Caracteristica) factoriaCaracteristicas.create("Cuenta");
        Caracteristica caracteristica2 = (Caracteristica) factoriaCaracteristicas.create("TD");
        Caracteristica caracteristica3 = (Caracteristica) factoriaCaracteristicas.create("TC");
        Caracteristica caracteristica4 = (Caracteristica) factoriaCaracteristicas.create("Premio");
        
        System.out.println("*** Cuenta de tipo " + cuenta.getTipoCuenta() + " ***");
        System.out.println(caracteristica.verDetalle(cuenta));
        System.out.println(caracteristica2.verDetalle(cuenta));
        System.out.println(caracteristica3.verDetalle(cuenta));
        System.out.println(caracteristica4.verDetalle(cuenta));
        
        // Cuenta Laboral
        
        Cuenta cuentaLaboral = (Cuenta) factoriaCuentas.create("Laboral");
        
        System.out.println("*** Cuenta de tipo " + cuentaLaboral.getTipoCuenta() + " ***");
        System.out.println(caracteristica.verDetalle(cuentaLaboral));
        System.out.println(caracteristica2.verDetalle(cuentaLaboral));
        System.out.println(caracteristica3.verDetalle(cuentaLaboral));
        System.out.println(caracteristica4.verDetalle(cuentaLaboral));
        
        
        
        
    }
    
        
}