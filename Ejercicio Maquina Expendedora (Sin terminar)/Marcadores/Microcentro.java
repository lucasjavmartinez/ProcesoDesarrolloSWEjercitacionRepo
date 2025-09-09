package Marcadores;

import java.util.HashSet;

public class Microcentro implements MarcadorEnMaps {

    private float latitud;
    private float longitud;

    private String nombreDelLocal;
    private String horarioDelLocal;

    private HashSet<MarcadorEnMaps> hijos = new HashSet<>();

    public void agregarHijo(MarcadorEnMaps cualquierMarcador) {
        this.hijos.add(cualquierMarcador);
    }


    @Override
    public float latitud() {
        return 0;
    }

    @Override
    public float longitud() {
        return 0;
    }

    @Override
    public String descripcion() {
        return "";
    }

    @Override
    public int cantEstrellas() {
        return 0;
    }

    @Override
    public void setHorarioDelLocal(String horarioDelLocal) {
        this.horarioDelLocal = horarioDelLocal;
        for (MarcadorEnMaps hijo : this.hijos) {
            hijo.setHorarioDelLocal(this.horarioDelLocal);
        }

    }
}
