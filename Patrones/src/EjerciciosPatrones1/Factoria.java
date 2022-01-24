/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPatrones1;

/**
 *
 * @author Emanuel
 * @param <T>
 */
public interface Factoria<T> {
    T create(String tipo);
}
