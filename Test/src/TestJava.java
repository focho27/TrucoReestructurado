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


}
