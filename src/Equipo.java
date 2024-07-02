import java.util.HashSet;

public class Equipo extends Participante {

    private HashSet<Atleta> integrantes = new HashSet<>();

    public Equipo(String nombre, Deporte deporteEnQueParticipa) {
        super(nombre, deporteEnQueParticipa);
    }

    public void agregarIntegrante(Atleta unAtleta) {
        integrantes.add(unAtleta);
    }
}
