/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Creacionales.Builder;

/**
 *
 * @author Emanuel
 */
public class main {
    public static void main(String[] args){
        Tarjeta tarjeta = 
                new Tarjeta.BuilderDeTarjeta("VISA", "0000 1111 2222 3333")
                        .nombre("Emanuel")
                        .expiracion(2030)
                        .credito(true)
                        .build();
        System.out.println(tarjeta);
        
        Tarjeta tarjeta2 =
                new Tarjeta.BuilderDeTarjeta("MASTERCARD", "3333 1111 4444 2222")
                    .nombre("Pepito")
                    .expiracion(2025)
                    .build();
        System.out.println(tarjeta2);
    }
}
