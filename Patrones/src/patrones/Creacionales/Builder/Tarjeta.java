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
public class Tarjeta {

    private final String tipo;
    private final String numero;
    private final String nombre;
    private final int expiracion;
    private final boolean credito;

    private Tarjeta(BuilderDeTarjeta builder) {
        this.tipo = builder.tipo;
        this.numero = builder.numero;
        this.nombre = builder.nombre;
        this.expiracion = builder.expiracion;
        this.credito = builder.credito;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExpiracion() {
        return expiracion;
    }

    public boolean isCredito() {
        return credito;
    }

    @Override
    public String toString(){
        return "Tarjeta: " + tipo + " " + numero + " " + expiracion + " " + credito;
    }
    
    public static class BuilderDeTarjeta {

        private String tipo;
        private String numero;
        private String nombre;
        private int expiracion;
        private boolean credito;

        public BuilderDeTarjeta(String tipo, String numero) {
            this.tipo = tipo;
            this.numero = numero;
        }

        public BuilderDeTarjeta nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public BuilderDeTarjeta expiracion(int expiracion) {
            this.expiracion = expiracion;
            return this;
        }
        
        public BuilderDeTarjeta credito(boolean credito){
            this.credito = credito;
            return this;
        }
        
        public Tarjeta build(){
            return new Tarjeta(this);
        }
    }
}
