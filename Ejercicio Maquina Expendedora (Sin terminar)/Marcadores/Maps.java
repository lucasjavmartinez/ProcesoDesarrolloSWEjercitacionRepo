package Marcadores;

import java.util.HashSet;

public class Maps {

    private HashSet<MarcadorEnMaps> marcadoresEnMaps = new HashSet<>();


    public void agregarMarcador(MarcadorEnMaps marcadorEnMaps) {

        this.marcadoresEnMaps.add(marcadorEnMaps);
    }

}
