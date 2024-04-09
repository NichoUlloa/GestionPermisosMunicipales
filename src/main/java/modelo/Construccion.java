package modelo;

import java.time.LocalDate;

public class Construccion extends Permiso {
    // atributos
    private TipoConstruccion tipoConstruccion;
    private int metrosCuadradosConstruir;
    private String ubicacion;

    // constructor
    public Construccion(TipoConstruccion tipoConstruccion, int metrosCuadradosConstruir, String ubicacion, String fechaEmision, String fechaVecimiento, double costoAsoaciado, String identificadorUnico, Ciudadano ciudadano) {
        super(fechaEmision, fechaVecimiento, costoAsoaciado, identificadorUnico, ciudadano);
        this.tipoConstruccion = tipoConstruccion;
        this.metrosCuadradosConstruir = metrosCuadradosConstruir;
        this.ubicacion = ubicacion;
    }

    // getters y setters
    public TipoConstruccion getTipoConstruccion() {
        return tipoConstruccion;
    }
    public void setTipoConstruccion(TipoConstruccion tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public int getMetrosCuadradosConstruir() {
        return metrosCuadradosConstruir;
    }
    public void setMetrosCuadradosConstruir(int metrosCuadradosConstruir) {
        this.metrosCuadradosConstruir = metrosCuadradosConstruir;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // metodos

    // metodo getTipo
    public String getTipo() {
        return "Construccion";
    }

    // metodo calcularCosto
    public double calcularCosto() {
        return getCostoAsoaciado() + (metrosCuadradosConstruir * 150000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de construccion: " + tipoConstruccion + "\n" +
                "Metros cuadrados a construir: " + metrosCuadradosConstruir + "\n" +
                "Ubicacion: " + ubicacion + "\n";
    }
}