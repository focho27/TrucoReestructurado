package ar.TrucoArg;

import java.util.Objects;

public abstract class Carta implements Comparable<Carta>{
        protected  Integer numero;
        protected Integer valor;
        protected  String nombre;


    public Carta(Integer numero, Integer valor,String nombre){} ;

    public abstract Integer getNumero();

    public abstract void setNumero(Integer numero);

    public abstract Integer getValor();

    public abstract void setValor(Integer valor);

    public abstract String toString();

    public abstract String getNombre();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carta)) return false;
        Carta carta = (Carta) o;
        return numero.equals(carta.numero) &&
                nombre.equals(carta.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nombre);
    }
}
