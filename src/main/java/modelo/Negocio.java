package modelo;

public class Negocio extends Permiso {
    // atributos
    private String tipoNegocio;
    private int tamanioLocalMetrosCuadrados;
    private int cantidadEmpleados;

    // constructor
    public Negocio(String tipoNegocio, int tamanioLocal, int cantidadEmpleados) {
        this.tipoNegocio = tipoNegocio;
        this.tamanioLocalMetrosCuadrados = tamanioLocal;
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



}