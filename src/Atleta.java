import java.util.ArrayList;
import java.util.List;

public class Atleta extends Participante {

    private List<Medalla> medallasObtenidas = new ArrayList<>();

    public Atleta(String nombre, Deporte deporteEnQueParticipa) {
        super(nombre, deporteEnQueParticipa);
    }
}
