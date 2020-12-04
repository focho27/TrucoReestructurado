package ar.TrucoArg;

import java.util.Objects;

public class Oro extends Carta {

    public Oro(Integer numero,Integer valor,String nombre){

        super(numero,valor,nombre);
        this.numero = numero;
        this.valor = valor;
        this.nombre = nombre;
    }
    @Override
    public Integer getNumero() {
        return this.numero;
    }

    @Override
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Integer getValor() {
        return this.valor;
    }

    @Override
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String listaDeCartas= "";
        listaDeCartas+= getNumero() + " " + getNombre() + "\t";
        return listaDeCartas;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }



    @Override
    public int compareTo(Carta o) {
        if(numero.equals(o.numero)){
            return nombre.compareTo(o.nombre);
        }
        return this.numero.compareTo(o.numero);

    }
}
