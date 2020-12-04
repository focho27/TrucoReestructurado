import ar.TrucoArg.*;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;


public class TestJava {


    @Test
    public void queSeAgreguenCartas(){

        Mazo mazoTruco = new Mazo();
        mazoTruco.cargarCartas();


        System.out.println(mazoTruco.getMazoCartas().toString());
        assertEquals(40,mazoTruco.getMazoCartas().size(),0.01);


    }

    @Test
    public void queSeOrdenenLasCartas(){
        Mazo mazoTruco = new Mazo();
        mazoTruco.cargarCartas();


        System.out.println(mazoTruco.ordenarCartas((HashSet<Carta>) mazoTruco.getMazoCartas()).toString());
        assertEquals(40,mazoTruco.ordenarCartas((HashSet<Carta>) mazoTruco.getMazoCartas()).size(),0.01);
    }

    @Test
    public void queSeInicieTruco(){
        Mazo mazoTruco = new Mazo();
        mazoTruco.cargarCartas();
        Truco truquito = new Truco("Truco argento",mazoTruco );
        System.out.println(truquito.getMazoDeCartas().toString());
        assertNotNull(truquito.getMazo());
    }

    @Test
    public void queSeCargueMazoDeCartas(){
        Mazo mazoTruco = new Mazo();
        mazoTruco.cargarCartas();
        Truco truquito = new Truco("Truco argento",mazoTruco );
        assertEquals(40,truquito.getMazoDeCartas().size());
    }

    @Test
    public void queSeGenereManoAJugador(){
        Mazo mazoTruco = new Mazo();
        mazoTruco.cargarCartas();
        Truco truquito = new Truco("Truco argento",mazoTruco );

        Jugador j1 = new Jugador(1,"Gero");
        Jugador j2 = new Jugador(2,"Gero");
        truquito.generarMano(j1);
        truquito.generarMano(j2);
        System.out.println(j1.getMano().getCartasMano().toString());
        System.out.println(j2.getMano().getCartasMano().toString());
        assertEquals(3,j1.getMano().getCartasMano().size(),0.01);
        assertEquals(3,j2.getMano().getCartasMano().size(),0.01);
        assertEquals(34,mazoTruco.getMazoCartas().size());
    }


}
