/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author david
 */
public class uso_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleados trabajador1 = new Empleados("Juan");
        Empleados trabajador2 = new Empleados("Tony");
        Empleados trabajador3 = new Empleados("Lucas");
        Empleados trabajador4 = new Empleados("Doctor tocino");

        trabajador1.cambiodeSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() + "\n"
                + trabajador2.devuelveDatos() + "\n"
                + trabajador3.devuelveDatos() + "\n"
                + trabajador4.devuelveDatos());
        System.out.println(Empleados.dameIdsiguiente());
    }

}

class Empleados {

    //constructor
    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    //final una constante como PI
    private final String nombre;
    private String seccion;
    private int Id;
    /*static para que todos los objetos compartieran
    y pertenezca a la clase*/
    private static int IdSiguiente = 1;

    public void cambiodeSeccion(String seccion) {//Set
        this.seccion = seccion;
    }

    public String devuelveDatos() {//Get

        return "El nombre es: " + nombre
                + " pertenece a la Seccion: " + seccion
                + " el ID del trabajador es " + Id;

    }

    public static String dameIdsiguiente() {
        return "El Id Siguiente es: " + IdSiguiente;
    }

}
