package modelo;

import java.util.ArrayList;

public class Municipalidad {
	// atributos
	private String nombreMunicipalidad;
	public ArrayList<Permiso> catalogoPermisosRealizados;

	// constructor
	public Municipalidad(String nombreMunicipalidad) {
		this.nombreMunicipalidad = nombreMunicipalidad;
		this.catalogoPermisosRealizados = new ArrayList<Permiso>();
	}

	// getters y setters
	public String getNombreMunicipalidad() {
		return nombreMunicipalidad;
	}
	public void setNombreMunicipalidad(String nombreMunicipalidad) {
		this.nombreMunicipalidad = nombreMunicipalidad;
	}

	public ArrayList<Permiso> getCatalogoPermisosRealizados() {
		return catalogoPermisosRealizados;
	}
	public void setCatalogoPermisosRealizados(ArrayList<Permiso> catalogoPermisosRealizados) {
		this.catalogoPermisosRealizados = catalogoPermisosRealizados;
	}

	@Override
	public String toString() {
		return "Municipalidad: " + nombreMunicipalidad + "\n";
	}
}