package clases;

public class Medalla {

    private TipoMedalla tipoMedalla;
    private Olimpiada olimpiada;

    public Medalla(TipoMedalla tipoMedalla, Olimpiada olimpiada) {
        this.tipoMedalla = tipoMedalla;
        this.olimpiada = olimpiada;
    }

    public TipoMedalla getTipoMedalla() {
        return tipoMedalla;
    }

    public Olimpiada getOlimpiada() {
        return olimpiada;
    }
}
