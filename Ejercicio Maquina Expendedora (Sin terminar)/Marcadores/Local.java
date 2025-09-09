package Marcadores;

public class Local implements  MarcadorEnMaps{

    private float longitud;
    private float latitud;

    private String nombreDelLocal;
    private String horarioDelLocal;

    public Local(float longitud, float latitud, String nombreDelLocal, String horarioDelLocal) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.nombreDelLocal = nombreDelLocal;
        this.horarioDelLocal = horarioDelLocal;
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
        return String.format("Local comercial %s horario: %s latitud: %2.2f longitud: %2.2f.", nombreDelLocal, horarioDelLocal, latitud, longitud);
    }

    @Override
    public int cantEstrellas() {
        return 0;
    }

    public void setHorarioDelLocal(String horarioDelLocal) {
        this.horarioDelLocal = horarioDelLocal;
    }
}
