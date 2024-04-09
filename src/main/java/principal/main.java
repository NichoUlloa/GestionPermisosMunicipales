package principal;

import modelo.*;

public class main {
    public static void main(String[] args) {
        principal();
    }

    public static void principal() {
        // Crear ciudadanos
        Ciudadano ciudadano1 = new Ciudadano("Juan", "Perez", "Calle 1");
        Ciudadano ciudadano2 = new Ciudadano("Maria", "Lopez", "Calle 2");
        Ciudadano ciudadano3 = new Ciudadano("Pedro", "Gomez", "Calle 3");

        // Crear municipalidad
        Municipalidad municipalidad = new Municipalidad("Municipalidad de San Jose");

        // Crear sistema de gestion municipal
        SistemaGestionMunicipal sistema = new SistemaGestionMunicipal(municipalidad);

        // registrar ciudadanos
        sistema.registrarCiudadano(ciudadano1);
        sistema.registrarCiudadano(ciudadano2);
        sistema.registrarCiudadano(ciudadano3);

        // Crear permisos
        Negocio permiso1 = new Negocio("market", 300, 3, "09/04/2023", "09/04/2030", 100000, "123", ciudadano1);
        Construccion permiso2 = new Construccion(TipoConstruccion.COMERCIAL, 200, "calle falsa 123", "09/04/2023", "09/04/2030", 100000, "1223", ciudadano2);

        // Agregar permisos a la municipalidad con registrarPermisoMunicipal
        sistema.registrarPermisoMunicipal(permiso1);
        sistema.registrarPermisoMunicipal(permiso2);

        // metodo buscarPermisoPorTipo
        System.out.println(sistema.buscarPermisoPorTipo("Construccion"));

        // metodo buscarPermisoPorFechaEmision
        System.out.println(sistema.buscarPermisoPorFechaEmision("09/04/2023"));

        // metodo buscarPermisoPorFechaVecimiento
        System.out.println(sistema.buscarPermisoPorFechaVencimiento("09/04/2030"));

        // buscar todos los permisos municipales de un ciudadano
        System.out.println(sistema.buscarPermisosMunicipalesPorCiudadano(ciudadano1));
        System.out.println(sistema.buscarPermisosMunicipalesPorCiudadano(ciudadano2));

        // obtenerInformacionCompletaPermisoMunicipal
        System.out.println(sistema.obtenerInformacionCompletaPermisoMunicipal(permiso1));
    }
}
