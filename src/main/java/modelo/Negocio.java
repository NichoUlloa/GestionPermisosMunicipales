package modelo;

import java.time.LocalDate;

public class Negocio extends Permiso {
    // atributos
    private String tipoNegocio;
    private int tamanioLocalMetrosCuadrados;
    private int cantidadEmpleados;

    // constructor
    public Negocio(String tipoNegocio, int tamanioLocalMetrosCuadrados, int cantidadEmpleados, LocalDate fechaEmision, LocalDate fechaVecimiento, double costoAsoaciado, String identificadorUnico) {
        super(fechaEmision, fechaVecimiento, costoAsoaciado, identificadorUnico);
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

    // metodos

    // metodo getTipo
    public String getTipo() {
        return "Negocio";
    }

    // Calcular costo permiso negocio: costo base + (tamaño de local en metros cuadrados * tarifa por metro cuadrado) + (cantidad de empleados * tarifa por empleado)
    // metodo calcularCosto
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
