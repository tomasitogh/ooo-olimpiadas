import java.util.HashSet;
import java.util.Set;

public class Olimpiada {

    private Set<Pais> paises = new HashSet<>();
    private Set<Deporte> deportes = new HashSet<>();

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
