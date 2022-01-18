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
public class CuentaAhorro implements CuentaComponent {

    private Double monto;
    private String nombre;
    
    public CuentaAhorro(Double monto, String nombre){
        this.monto = monto;
        this.nombre = nombre;
    }
    
    @Override
    public void mostrarNombre() {
        System.out.println("Cuenta Ahorro: " + nombre);
    }

    @Override
    public Double getMonto() {
        return monto;
    }
    
}
