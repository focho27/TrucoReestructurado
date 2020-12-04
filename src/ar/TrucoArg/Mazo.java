package ar.TrucoArg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mazo {

    private Set<Carta> mazoCartas;

    public Mazo(){
                this.mazoCartas = new HashSet<>();

    }
    public void agregarCartas(Carta carta){
            if(carta!=null){

                if(carta instanceof Espada ){
                    if( carta.getNumero()!=8 && carta.getNumero()!=9 && carta.getNumero()>=1&&carta.getNumero()<=12)
                mazoCartas.add(carta);}

                if(carta instanceof Basto ){
                    if( carta.getNumero()!=8 && carta.getNumero()!=9 && carta.getNumero()>=1&&carta.getNumero()<=12)
                        mazoCartas.add(carta);}

                if(carta instanceof Oro ){
                    if(carta.getNumero()!=8 && carta.getNumero()!=9 && carta.getNumero()>=1&&carta.getNumero()<=12)
                        mazoCartas.add(carta);}

                if(carta instanceof Copa ){
                    if( carta.getNumero()!=8 && carta.getNumero()!=9 && carta.getNumero()>=1&&carta.getNumero()<=12)
                        mazoCartas.add(carta);}
            }
    }

    public void cargarCartas(){
        Integer numero=1, valor=1;
        String nombre;
        Integer cambioDePalo=12;
        Integer ordenamientoTerminado = 4;
        for (int j = 0; j < ordenamientoTerminado; j++) {
            for (int i = 0; i < cambioDePalo ; i++) {
                if(j==0){
                    nombre = "Espada";

                    Carta carta = new Espada(numero,valor,nombre);

                    agregarCartas(((Espada)carta)); //SE AGREGA CARTA
                    numero++;
                    switch (numero){
                        case 2: valor = 9;
                            break;
                        case 3: valor = 10;
                            break;
                        case 4: valor = 1;
                            break;
                        case 5: valor = 2;
                            break;
                        case 6: valor = 3;
                            break;
                        case 7: valor = 12;
                            break;
                        case 10: valor = 5;
                            break;
                        case 11: valor = 6;
                            break;
                        case 12: valor = 7;

                            break;

                    }


                }
                if(j==1){
                    if(i==0){
                    numero = 1;}
                    valor = 13;
                    nombre = "Basto";
                    Carta carta = new Basto(numero,valor,nombre);
                    agregarCartas(((Basto)carta)); //SE AGREGA CARTA
                    numero++;
                    switch (numero){
                        case 2: valor = 9;
                            break;
                        case 3: valor = 10;
                            break;
                        case 4: valor = 1;
                            break;
                        case 5: valor = 2;
                            break;
                        case 6: valor = 3;
                            break;
                        case 7: valor = 4;
                            break;
                        case 10: valor = 5;
                            break;
                        case 11: valor = 6;
                            break;
                        case 12: valor = 7;
                            break;
                    }

                }
                if(j==2){
                    if(i==0){
                        numero = 1;}
                    valor = 8;
                    nombre = "Oro";
                    Carta carta = new Oro(numero,valor,nombre);
                    agregarCartas(((Oro)carta)); //SE AGREGA CARTA
                    numero++;
                    switch (numero){
                        case 2: valor = 9;
                            break;
                        case 3: valor = 10;
                            break;
                        case 4: valor = 1;
                            break;
                        case 5: valor = 2;
                            break;
                        case 6: valor = 3;
                            break;
                        case 7: valor = 11;
                            break;
                        case 10: valor = 5;
                            break;
                        case 11: valor = 6;
                            break;
                        case 12: valor = 7;
                            break;
                    }
                }
                if(j==3){
                    if(i==0){
                        numero = 1;}
                    valor = 8;
                    nombre = "Copa";
                    Carta carta = new Copa(numero,valor,nombre);
                    agregarCartas(((Copa)carta)); //SE AGREGA CARTA
                    numero++;
                    switch (numero){
                        case 2: valor = 9;
                            break;
                        case 3: valor = 10;
                            break;
                        case 4: valor = 1;
                            break;
                        case 5: valor = 2;
                            break;
                        case 6: valor = 3;
                            break;
                        case 7: valor = 4;
                            break;
                        case 10: valor = 5;
                            break;
                        case 11: valor = 6;
                            break;
                        case 12: valor = 7;
                            break;
                    }
                }
            }}
    }

    public Set<Carta> getMazoCartas() {
        return mazoCartas;
    }

    public void setMazoCartas(Set<Carta> mazoCartas) {
        this.mazoCartas = mazoCartas;
    }

    public TreeSet ordenarCartas(HashSet <Carta> cartas){
    TreeSet<Carta> cartasOrdenadas = new TreeSet<>();

     cartasOrdenadas.addAll(cartas);
        return cartasOrdenadas;
    }

}
