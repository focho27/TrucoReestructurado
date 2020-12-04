package ar.TrucoArg;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mano {
        private Set<Carta> cartasMano;
        private Integer codigo;
        public Mano(Integer codigo,Set<Carta>cartasMano){
            if(cartasMano!=null && cartasMano.size()==3){
            this.cartasMano = cartasMano;
            this.codigo = codigo;
            }

        }

        public Set<Carta> getCartasMano() {
        return cartasMano;
         }

         public void setCartasMano(Set<Carta> cartasMano) {
        this.cartasMano = cartasMano;
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
        if (!(o instanceof Mano)) return false;
        Mano mano = (Mano) o;
        return codigo.equals(mano.codigo);
        }

        @Override
        public int hashCode() {
        return Objects.hash(codigo);
        }


}
