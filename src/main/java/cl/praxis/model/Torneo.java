package cl.praxis.model;

import java.util.HashMap;
import java.util.List;

public class Torneo {

    private HashMap<String, Equipo> equipos;
    private List<Partida> resultados;

    public Torneo() {
        this.equipos = new HashMap<String, Equipo>();
    }

    public Torneo(HashMap<String, Equipo> equipos, List<Partida> resultados) {
        this.equipos = equipos;
        this.resultados = resultados;
    }

    public void agregarEquipo(String nombre){
        this.equipos.put(nombre, new Equipo(nombre));
    }

    public void agregarJugador(String nombreEquipo, Jugador jugador){
        equipos.get(nombreEquipo).agregarJugador(jugador);
    }

    public void registrarResultado(String fecha,
                                   String local,
                                   String visita,
                                   int puntosLocal,
                                   int puntosVisita){

        resultados.add(
                new Partida(fecha,
                        equipos.get(local),
                        equipos.get(visita),
                        puntosLocal, puntosVisita));
    }

    public int getEquiposSize() {
        if(this!=null) {
            return this.equipos.size();
        }
        return 0;
    }


    public void mostrarRanking(){

    }

}
