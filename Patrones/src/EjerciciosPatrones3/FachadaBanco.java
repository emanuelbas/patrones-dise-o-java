/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPatrones3;

/**
 *
 * @author Emanuel
 */
public class FachadaBanco {
    private Cuenta cuenta;
    private Saldos saldos;
    private Transferencias transferencias;
    public FachadaBanco(){
        cuenta = new Cuenta();
        saldos = new Saldos();
        transferencias = new Transferencias();
    }
    
    public void transferir(){
        this.transferencias.transferir();
    }
    
    public void consultarSaldo(){
        this.saldos.consultarSaldo();
    }
    
    public void sacarDinero(){
        this.cuenta.extraer();
    }
}
