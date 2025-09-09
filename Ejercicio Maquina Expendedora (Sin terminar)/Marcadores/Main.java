package Marcadores;

public class Main {
    public static void main(String[] args) {

        Local Puma = new Local(33.123f, 25.456f, "Puma", "Lunes a Viernes de 08 a 18hs.");
        Microcentro Palermo = new Microcentro();

        Maps mapa = new Maps();

        mapa.agregarMarcador(Puma);
        mapa.agregarMarcador(Palermo);

        Palermo.agregarHijo(Puma);
        Palermo.setHorarioDelLocal("Lunes a Sabado");


        System.out.println(mapa);



        System.out.println(Puma.descripcion());
    }
}