package modelo;

import java.time.LocalDate;

public abstract class Permiso {
    // atributos
    private LocalDate fechaEmision, fechaVecimiento;
    private double costoAsoaciado;
    private String identificadorUnico;

    // constructor
    public Permiso(LocalDate fechaEmision, LocalDate fechaVecimiento, double costoAsoaciado, String identificadorUnico) {
        this.fechaEmision = fechaEmision;
        this.fechaVecimiento = fechaVecimiento;
        this.costoAsoaciado = costoAsoaciado;
        this.identificadorUnico = identificadorUnico;
    }

    // getters y setters
    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVecimiento() {
        return fechaVecimiento;
    }
    public void setFechaVecimiento(LocalDate fechaVecimiento) {
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

    // metodos

    // metodo abstracto getTipo
    public abstract String getTipo();

    // metodo calcularCosto
    public abstract double calcularCosto();


    // toString




}