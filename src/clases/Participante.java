package clases;

import java.util.ArrayList;
import java.util.List;

public abstract class Participante {

    private String nombre;
    private Deporte deporteEnQueParticipa;
    private List<Medalla> medallasObtenidas = new ArrayList<>();

    public Participante(String nombre, Deporte deporteEnQueParticipa) {
        this.nombre = nombre;
        this.deporteEnQueParticipa = deporteEnQueParticipa;
    }

    public void ganoMedalla(Medalla medalla){
        medallasObtenidas.add(new Medalla(medalla.getTipoMedalla(), medalla.getOlimpiada() ));
    }

    public List<Medalla> getMedallasObtenidas() {
        return medallasObtenidas;
    }
    public abstract int contarParticipantes();
}
