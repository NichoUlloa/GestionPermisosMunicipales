package modelo;

public enum TipoConstruccion {
    RESIDENCIAL("Residencial"), COMERCIAL("Comercial");

    private String tipoConstruccion;

    private TipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    @Override
    public String toString() {
        return tipoConstruccion;
    }
}
