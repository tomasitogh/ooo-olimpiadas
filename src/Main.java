import clases.*;

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

        Equipo losPumas = new Equipo("Seleccion Argentina de Rubgy", rugby);
        losPumas.agregarIntegrante(new Atleta("Agustin Creevy", rugby));
        Participante leonas = new Equipo("Seleccion Argentina de Hockey femenino", hockey);


        // Agregar equipos y atletas.
        Pais argentina = new Pais("Argentina");
        argentina.agregarParticipante(florenciaBorelli);
        argentina.agregarParticipante(daianaOcampo);
        argentina.agregarParticipante(elianLarregina);
        argentina.agregarParticipante(escaloneta);
        argentina.agregarParticipante(losPumas);


        // Organizar clases.Olimpiada
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


        //RESPONDIENDO CONSIGNAS
        // 1. Cuantas medallas tiene un pais en un juego olimpico
        daianaOcampo.ganoMedalla(new Medalla(TipoMedalla.ORO,paris2024));
        florenciaBorelli.ganoMedalla(new Medalla(TipoMedalla.PLATA, paris2024));
        int[] medallero = argentina.cuantasMedallasTenes(paris2024);
        System.out.println("Argentina tiene: ");
        System.out.println(medallero[0] +" medallas de oro");
        System.out.println(medallero[1] +" medallas de plata");
        System.out.println(medallero[2] +" medallas de bronce");

        //2. Obtener el nombre del país que más medallas obtuvo, no sabemos si de una olimpiada o de toda la vida, supongamos que de una olimpiada
        paris2024.quienObtuvoMasMedallas();

        //3. Obtener la cantidad de atletas participantes de un país para poder asignarle un hotel. (Contar
        // todos los atletas de todos los equipos y los individuales
        System.out.println("Argentina tiene "+argentina.cuantosParticipantesTenes() +" participantes");

        //4. Obtener entre 2 países cuál fué más medallero que otro
        //para ello vamos a crear a Francia y sus atletas
        Participante dupont = new Atleta("Antoine Dupont", rugby);
        Equipo franciaSegundon = new Equipo("Francia", futbol);
        franciaSegundon.agregarIntegrante(new Atleta("Kylian Mbappe", futbol));
        Pais francia = new Pais("Francia");
        francia.agregarParticipante(dupont);
        francia.agregarParticipante(franciaSegundon);

        paris2024.agregarPais(francia);

        dupont.ganoMedalla(new Medalla(TipoMedalla.ORO,paris2024));

        //en este caso, argentina tiene 1 oro y un plata, y francia tiene solo 1 oro, deberia ganar argentina
        System.out.println("El más medallero es:"+paris2024.quienEsMasMedallero(argentina,francia).getNombre());
        //GANO ARGENTINA

        //Veamos agregandole medallas a Francia
        dupont.ganoMedalla(new Medalla(TipoMedalla.ORO,paris2024));
        System.out.println("El más medallero es:"+paris2024.quienEsMasMedallero(argentina,francia).getNombre());
        //gano Francia, funciona bien


        //Obtener la cantidad total de medallas obtenidas de Oro, Plata y Bronce
        paris2024.totalMedallasTodosPaises();
    }
}