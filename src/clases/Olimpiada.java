package clases;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Olimpiada {

    private String nombre;
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

    public String getNombre() {
        return nombre;
    }


    public void quienObtuvoMasMedallas() {
        //Tambien podriamos haber hecho un hasHset y poder poner varios paises
        int maxMedallas = 0;

        String nombreMaxMedallas = null;
        for (Pais pais : this.getPaises()) {
            int contadorMedallas = 0;
            for (Participante participante : pais.getParticipantes()) {
                for (Medalla medalla : participante.getMedallasObtenidas()) {
                    if (Objects.equals(medalla.getOlimpiada().getNombre(), this.getNombre())) {
                        contadorMedallas++;
                    }
                }
            }
            if (contadorMedallas >= maxMedallas) {
                maxMedallas = contadorMedallas;
                nombreMaxMedallas = pais.getNombre();
            }
        }
        System.out.println("El país que obtuvo más medallas fue: " + nombreMaxMedallas);
    }

    public Pais quienEsMasMedallero(Pais pais1, Pais pais2){
        int[] medallero1 = pais1.cuantasMedallasTenes(this);
        int[] medallero2 = pais2.cuantasMedallasTenes(this);
        if (medallero1[0] == medallero2[0]){
            if (medallero1[1] == medallero2[1]){
                if (medallero1[2] == medallero2[2]){
                    return pais1; // se decide arbitrariamente el primer pais
                }else if (medallero1[2] > medallero2[2]){
                    return pais1;
                }else return pais2;
            }else if (medallero1[1] > medallero2[1]){
                return pais1;
            }else return pais2;
        }
        else if (medallero1[0] > medallero2[0]){
            return pais1;
        }else return pais2;
    }

    public void totalMedallasTodosPaises(){
        for (Pais p : paises){
            int[] medallas = p.cuantasMedallasTenes(this);
            int totalMedallas = medallas[0] + medallas[1] + medallas[2];
            System.out.println(p.getNombre() +" tiene " + totalMedallas +" medallas");
        }
    }
}
