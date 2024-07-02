import java.util.HashSet;
import java.util.Set;

public class Olimpiada {

    Set<Pais> paises = new HashSet<>();
    Set<Deporte> deportes = new HashSet<>();

    public void agregarDeporte(Deporte unDeporte) {
        this.deportes.add(unDeporte);
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public Set<Pais> getPaises() {
        return paises;
    }

}
