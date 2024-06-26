package modelo;

import java.time.LocalDate;

public class Negocio extends Permiso {
    // atributos
    private String tipoNegocio;
    private int tamanioLocalMetrosCuadrados;
    private int cantidadEmpleados;

    // constructor
    public Negocio(String tipoNegocio, int tamanioLocalMetrosCuadrados, int cantidadEmpleados, String fechaEmision, String fechaVecimiento, double costoAsoaciado, String identificadorUnico, Ciudadano ciudadano) {
        super(fechaEmision, fechaVecimiento, costoAsoaciado, identificadorUnico, ciudadano);
        this.tipoNegocio = tipoNegocio;
        this.tamanioLocalMetrosCuadrados = tamanioLocalMetrosCuadrados;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    // getters y setters
    public String getTipoNegocio() {
        return tipoNegocio;
    }
    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public int getTamanioLocalMetrosCuadrados() {
        return tamanioLocalMetrosCuadrados;
    }
    public void setTamanioLocalMetrosCuadrados(int tamanioLocalMetrosCuadrados) {
        this.tamanioLocalMetrosCuadrados = tamanioLocalMetrosCuadrados;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    // metodo getTipo
    public String getTipo() {
        return "Negocio";
    }

    public double calcularCosto() {
        return getCostoAsoaciado() + (tamanioLocalMetrosCuadrados * 150000) + (cantidadEmpleados * 20000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de negocio: " + tipoNegocio + "\n" +
                "Tamaño del local en metros cuadrados: " + tamanioLocalMetrosCuadrados + "\n" +
                "Cantidad de empleados: " + cantidadEmpleados + "\n";
    }
}
