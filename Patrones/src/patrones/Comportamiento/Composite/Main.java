/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Comportamiento.Composite;

/**
 *
 * @author Emanuel
 */
public class Main {
    public static void main (String[] args){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.00, "Ema");
        CuentaComponent cuentaAhorro = new CuentaAhorro(1000.00, "Ema ahorro");
        
        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.agregarCuenta(cuentaCorriente);
        cuentaComposite.agregarCuenta(cuentaAhorro);
        
        Double montoTotal = cuentaComposite.getMonto();
        System.out.println("El monto de las cuentas es " + montoTotal);
        cuentaComposite.mostrarNombre();
    }
}
