public class Main {
    public static void main(String[] args) {

        // Deportes
        Deporte atletismo = new Deporte("Atletismo");
        Deporte remo = new Deporte("Remo");
        Deporte ciclismoBmx = new Deporte("Ciclismo BMX");
        Deporte ciclismoRuta = new Deporte("Ciclismo en Ruta");
        Deporte futbol = new Deporte("Futbol");
        Deporte hockey = new Deporte("Hockey");
        Deporte rugby = new Deporte("Rugby");
        Deporte pentatlon = new Deporte("Pentatlon");


        // Atletas individuales
        Participante florenciaBorelli = new Atleta("Florencia Borelli", atletismo);
        Participante daianaOcampo = new Atleta("Daiana Ocampo", atletismo);
        Participante elianLarregina = new Atleta("Elian Larregina", atletismo);

        // Equipos
        Equipo escaloneta = new Equipo("Seleccion Argentina de Futbol", futbol);
        escaloneta.agregarIntegrante(new Atleta("Javier Mascherano", futbol));
        // TODO: Agregar al resto de los integrantes del equipo

        Participante losPumas = new Equipo("Seleccion Argentina de Rubgy", rugby);
        Participante leonas = new Equipo("Seleccion Argentina de Hockey femenino", hockey);


        // Agregar equipos y atletas.
        Pais argentina = new Pais("Argentina");
        argentina.agregarParticipante(florenciaBorelli);
        argentina.agregarParticipante(daianaOcampo);
        argentina.agregarParticipante(elianLarregina);


        // Organizar Olimpiada
        Olimpiada paris2024 = new Olimpiada();
        paris2024.agregarDeporte(atletismo);
        paris2024.agregarDeporte(remo);
        paris2024.agregarDeporte(ciclismoBmx);
        paris2024.agregarDeporte(ciclismoRuta);
        paris2024.agregarDeporte(futbol);
        paris2024.agregarDeporte(hockey);
        paris2024.agregarDeporte(rugby);
        paris2024.agregarDeporte(pentatlon);

        paris2024.agregarPais(argentina);




    }
}