/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Comportamiento.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public class CuentaComposite implements CuentaComponent{

    private List<CuentaComponent> cuentasHijo;
    
    public CuentaComposite(){
        this.cuentasHijo = new ArrayList<>();
    }
    
    @Override
    public void mostrarNombre() {
        for(CuentaComponent cuenta : cuentasHijo){
            cuenta.mostrarNombre();
        }
    }

    @Override
    public Double getMonto() {
        Double total = 0.0;
        for (CuentaComponent cuenta : cuentasHijo){
            total += cuenta.getMonto();
        }
        return total;

    }
    
    public void agregarCuenta(CuentaComponent cuenta){
        cuentasHijo.add(cuenta);
    }
    public void quitarCuenta(CuentaComponent cuenta){
        cuentasHijo.remove(cuenta);
    }
    
}
