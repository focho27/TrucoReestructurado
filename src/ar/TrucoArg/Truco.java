package ar.TrucoArg;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Truco {
    private Integer cantidadDeManos;
    private Set<Carta> mazoDeCartas;
    private String nombre;
    private Mazo mazo;
    public Truco(String nombre, Mazo mazo){
      this.mazo = mazo;


      this.nombre = nombre;
      this.mazoDeCartas = new HashSet<>();
      this.mazoDeCartas =mazo.getMazoCartas();
      this.cantidadDeManos = 0;
    }

    public Carta seleccionarCartaAleatoriaDeMazo(){
        Integer numAleatorio = 0;
        Integer numCarta = 0;
        String[] palo = {"Espada","Basto","Copa","Oro"};
        Boolean paloElegido= false;
        String paloCarta = "";
        while(numCarta.equals(8) || numCarta.equals(9) || numCarta.equals(0) ) {
            numAleatorio = (int) Math.floor(Math.random() * 13);
            numCarta = numAleatorio;
        }
        while(paloElegido ==false){

            numAleatorio = (int) Math.floor(Math.random() * 4);
            if(numAleatorio>=0&&numAleatorio<4){
                paloCarta = palo[numAleatorio];
                paloElegido=true;
            }

        }

            if(buscarCarta(numCarta,paloCarta)!=null){

               return buscarCarta(numCarta,paloCarta);
            }

        return null;
    }

    public Carta buscarCarta(Integer numero,String nombre){
        for (Carta carta:
        mazoDeCartas) {
            if(carta.getNumero().equals(numero) && carta.getNombre().equals(nombre)){
                return carta;
            }
        }
        return null;
    }
    public void generarMano(Jugador j){
        HashSet <Carta> mano = new HashSet<>();
        Carta auxiliar ;
        Integer contador=0;
        while(contador<3){

            auxiliar = seleccionarCartaAleatoriaDeMazo();
            if(auxiliar!=null){
            mano.add(auxiliar);
            this.mazoDeCartas.remove(auxiliar);
            contador++;
            }

        }
        cantidadDeManos ++;
         j.setMano( new Mano(this.cantidadDeManos,mano));


    }

    public void repartirCartas(Jugador j1,Jugador j2){
        if(j1!=null && j2 !=null){
            generarMano(j1);
            generarMano(j2);
        }

    }

    public Set<Carta> getMazoDeCartas() {
        return mazoDeCartas;
    }

    public void setMazoDeCartas(Set<Carta> mazoDeCartas) {
        this.mazoDeCartas = mazoDeCartas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }
}
