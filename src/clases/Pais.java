package clases;

import java.util.HashSet;
import java.util.Objects;
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

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] cuantasMedallasTenes(Olimpiada olimpiada) {
        int cantMedallasOro = 0;
        int cantMedallasPlata = 0;
        int cantMedallasBronce = 0;

        for (Participante participante : participantes) {
            for (Medalla medalla : participante.getMedallasObtenidas()) {
                if (Objects.equals(medalla.getOlimpiada().getNombre(), olimpiada.getNombre())){
                    switch (medalla.getTipoMedalla()) {
                        case ORO:
                            cantMedallasOro++;
                            break;
                        case PLATA:
                            cantMedallasPlata++;
                            break;
                        case BRONCE:
                            cantMedallasBronce++;
                            break;
                    }
                }
            }
        }
        return new int[]{cantMedallasOro, cantMedallasPlata, cantMedallasBronce};

    }

    public int cuantosParticipantesTenes(){
        int cantidadParticipante = 0;
        for (Participante p : this.getParticipantes()){
            cantidadParticipante += p.contarParticipantes();
        }
        return cantidadParticipante;
    }


    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
