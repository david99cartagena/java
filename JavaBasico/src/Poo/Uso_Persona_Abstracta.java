/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Uso_Persona_Abstracta {

    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("David", 6000, 2020, 03, 25);
        lasPersonas[1] = new Alumno("Juancho", "ingenieria de sistemas");

        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
        }
    }
}

abstract class Persona {

    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;
}

class Empleado2 extends Persona {

    //Constructor por defecto lleva ()
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {//Constructor con parametros

        super(nom);

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    @Override
    public String dameDescripcion() {
        return "Este empleo tiene un Id: " + Id + " con un suledo de: " + sueldo;
    }

    public double dame_Sueldo() {
        return sueldo;
    }

    public Date dame_FechaContrato() {
        return altaContrato;
    }

    public void sube_Sueldo(double porcentaje) {//Setters
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
}

class Alumno extends Persona {

    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }

    @Override
    public String dameDescripcion() {
        return "el alumno estudia: " + carrera;
    }
    private String carrera;

}
