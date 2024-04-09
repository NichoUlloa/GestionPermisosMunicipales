package modelo;

import java.time.LocalDate;

public class EventoEspecial extends Permiso {
    // atributos
    private String tipoEvento;
    private int cantidadEsperadaAsistentes;
    private String medidasSeguridad;

    // constructor
    public EventoEspecial(String tipoEvento, int cantidadEsperadaAsistentes, String medidasSeguridad, LocalDate fechaEmision, LocalDate fechaVecimiento, double costoAsoaciado, String identificadorUnico) {
        super(fechaEmision, fechaVecimiento, costoAsoaciado, identificadorUnico);
        this.tipoEvento = tipoEvento;
        this.cantidadEsperadaAsistentes = cantidadEsperadaAsistentes;
        this.medidasSeguridad = medidasSeguridad;
    }

    // getters y setters
    public String getTipoEvento() {
        return tipoEvento;
    }
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getCantidadEsperadaAsistentes() {
        return cantidadEsperadaAsistentes;
    }
    public void setCantidadEsperadaAsistentes(int cantidadEsperadaAsistentes) {
        this.cantidadEsperadaAsistentes = cantidadEsperadaAsistentes;
    }

    public String getMedidasSeguridad() {
        return medidasSeguridad;
    }
    public void setMedidasSeguridad(String medidasSeguridad) {
        this.medidasSeguridad = medidasSeguridad;
    }

    // metodos

    // metodo getTipo
    public String getTipo() {
        return "EventoEspecial";
    }

    // metodo calcularCosto
    public double calcularCosto() {
        return getCostoAsoaciado() + (cantidadEsperadaAsistentes / 100 * 100000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de evento: " + tipoEvento + "\n" +
                "Cantidad esperada de asistentes: " + cantidadEsperadaAsistentes + "\n" +
                "Medidas de seguridad: " + medidasSeguridad + "\n";
    }
}