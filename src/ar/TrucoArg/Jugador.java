package ar.TrucoArg;

import java.util.Objects;

public class Jugador {
        private Mano mano;
        private String nombre;
        private Integer codigo;

            public Jugador(Integer codigo,String nombre){
                this.codigo= codigo;
                this.nombre= nombre;
                this.mano = null;
            }

        public Mano getMano() {
        return mano;
        }

         public void setMano(Mano mano) {
         this.mano = mano;
         }

         public String getNombre() {
        return nombre;
        }

         public void setNombre(String nombre) {
        this.nombre = nombre;
        }

        public Integer getCodigo() {
        return codigo;
        }

        public void setCodigo(Integer codigo) {
        this.codigo = codigo;
        }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return codigo.equals(jugador.codigo);
        }

        @Override
        public int hashCode() {
        return Objects.hash(codigo);
        }

}
