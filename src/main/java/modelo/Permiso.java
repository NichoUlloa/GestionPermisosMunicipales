package modelo;

import java.time.LocalDate;

public abstract class Permiso {
    // atributos
    private String fechaEmision, fechaVecimiento;
    private double costoAsoaciado;
    private String identificadorUnico;
    private Ciudadano ciudadano;

    // constructor
    public Permiso(String fechaEmision, String fechaVecimiento, double costoAsoaciado, String identificadorUnico, Ciudadano ciudadano) {
        this.fechaEmision = fechaEmision;
        this.fechaVecimiento = fechaVecimiento;
        this.costoAsoaciado = costoAsoaciado;
        this.identificadorUnico = identificadorUnico;
        this.ciudadano = ciudadano;
    }

    // getters y setters
    public String getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFechaVecimiento() {
        return fechaVecimiento;
    }
    public void setFechaVecimiento(String fechaVecimiento) {
        this.fechaVecimiento = fechaVecimiento;
    }

    public double getCostoAsoaciado() {
        return costoAsoaciado;
    }
    public void setCostoAsoaciado(double costoAsoaciado) {
        this.costoAsoaciado = costoAsoaciado;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }
    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }
    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    // metodos

    // metodo abstracto getTipo
    public abstract String getTipo();

    // metodo calcularCosto
    public abstract double calcularCosto();


    // toString
    @Override
    public String toString() {
        return "Permiso: " + identificadorUnico + "\n" +
                "Fecha de emision: " + fechaEmision + "\n" +
                "Fecha de vecimiento: " + fechaVecimiento + "\n" +
                "Costo asociado: " + costoAsoaciado + "\n" +
                "Ciudadano: " + ciudadano + "\n";
    }




}