package modelo;

import java.util.ArrayList;

public class SistemaGestionMunicipal {
    // atributos
    private Municipalidad municipalidad;
    private ArrayList<Ciudadano> ciudadanos;
    private ArrayList<Permiso> permisos;

    // constructor
    public SistemaGestionMunicipal(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
        this.ciudadanos = new ArrayList<Ciudadano>();
        this.permisos = new ArrayList<Permiso>();
    }

    // getters y setters
    public Municipalidad getMunicipalidad() {
        return municipalidad;
    }
    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }

    public ArrayList<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }
    public void setCiudadanos(ArrayList<Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public ArrayList<Permiso> getPermisos() {
        return permisos;
    }
    public void setPermisos(ArrayList<Permiso> permisos) {
        this.permisos = permisos;
    }

    // metodos
    public void registrarCiudadano(Ciudadano ciudadano) {
        if (!ciudadanos.contains(ciudadano)) {
            ciudadanos.add(ciudadano);
        } else {
            System.out.println("El ciudadano ya esta registrado");
        }
    }

    public void registrarPermisoMunicipal(Permiso permiso) {
        if (!permisos.contains(permiso)) {
            permisos.add(permiso);
            municipalidad.getCatalogoPermisosRealizados().add(permiso);
        } else {
            System.out.println("El permiso ya esta registrado");
        }
    }

    public ArrayList<Permiso> buscarPermisoPorTipo(String tipo) {
        ArrayList<Permiso> permisosTipo = new ArrayList<Permiso>();
        for (Permiso permiso : permisos) {
            if (permiso.getTipo().equals(tipo)) {
                permisosTipo.add(permiso);
            }
        }
        if (permisosTipo.isEmpty()) {
            System.out.println("No se encontraron permisos de tipo " + tipo);
        }
        return permisosTipo;
    }

    public ArrayList<Permiso> buscarPermisoPorFechaEmision(String fechaEmision) {
        ArrayList<Permiso> permisosFechaEmision = new ArrayList<Permiso>();
        for (Permiso permiso : permisos) {
            if (permiso.getFechaEmision().equals(fechaEmision)) {
                permisosFechaEmision.add(permiso);
            }
        }
        if (permisosFechaEmision.isEmpty()) {
            System.out.println("No se encontraron permisos con fecha de emision " + fechaEmision);
        }
        return permisosFechaEmision;
    }

    public ArrayList<Permiso> buscarPermisoPorFechaVencimiento(String fechaVencimiento) {
        ArrayList<Permiso> permisosFechaVencimiento = new ArrayList<Permiso>();
        for (Permiso permiso : permisos) {
            if (permiso.getFechaVecimiento().equals(fechaVencimiento)) {
                permisosFechaVencimiento.add(permiso);
            }
        }
        if (permisosFechaVencimiento.isEmpty()) {
            System.out.println("No se encontraron permisos con fecha de vencimiento " + fechaVencimiento);
        }
        return permisosFechaVencimiento;
    }

    public ArrayList<Permiso> buscarPermisosMunicipalesPorCiudadano(Ciudadano ciudadano) {
        ArrayList<Permiso> permisosCiudadano = new ArrayList<Permiso>();
        for (Permiso permiso : permisos) {
            if (permiso.getCiudadano().equals(ciudadano)) {
                permisosCiudadano.add(permiso);
            }
        }
        if (permisosCiudadano.isEmpty()) {
            System.out.println("No se encontraron permisos para el ciudadano");
        }
        return permisosCiudadano;
    }

    public String obtenerInformacionCompletaPermisoMunicipal(Permiso permiso) {
        if (permiso instanceof Negocio) {
            return permiso.toString() + ((Negocio) permiso).toString();
        } else if (permiso instanceof Construccion) {
            return permiso.toString() + ((Construccion) permiso).toString();
        } else if (permiso instanceof EventoEspecial) {
            return permiso.toString() + ((EventoEspecial) permiso).toString();
        } else {
            return "No se encontro informacion completa del permiso";
        }
    }
}
