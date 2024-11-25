import java.util.HashSet;
import java.util.Set;

public class Pais {

    private String nombre;

    private Set<Participante> participantes = new HashSet<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }
}
