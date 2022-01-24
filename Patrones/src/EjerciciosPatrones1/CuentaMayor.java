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
public class CuentaMayor implements Cuenta {

    @Override
    public String getTipoCuenta() {
        return "CuentaMayor";
    }

    @Override
    public String getNumeroCuenta() {
        return "123456";
    }
    
}
