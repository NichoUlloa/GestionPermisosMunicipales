package modelo;

public class Ciudadano {
    // atributos
    private String nombreCiudadano, apellidoCiudadano, direccionCiudadano;

    // constructor
    public Ciudadano(String nombreCiudadano, String apellidoCiudadano, String direccionCiudadano) {
        this.nombreCiudadano = nombreCiudadano;
        this.apellidoCiudadano = apellidoCiudadano;
        this.direccionCiudadano = direccionCiudadano;
    }

    // getters y setters
    public String getNombreCiudadano() {
        return nombreCiudadano;
    }
    public void setNombreCiudadano(String nombreCiudadano) {
        this.nombreCiudadano = nombreCiudadano;
    }

    public String getApellidoCiudadano() {
        return apellidoCiudadano;
    }
    public void setApellidoCiudadano(String apellidoCiudadano) {
        this.apellidoCiudadano = apellidoCiudadano;
    }

    public String getDireccionCiudadano() {
        return direccionCiudadano;
    }
    public void setDireccionCiudadano(String direccionCiudadano) {
        this.direccionCiudadano = direccionCiudadano;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCiudadano + "\n" +
                "Apellido: " + apellidoCiudadano + "\n" +
                "Direccion: " + direccionCiudadano + "\n";
    }
}
