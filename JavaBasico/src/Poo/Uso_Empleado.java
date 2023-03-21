package Poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
//Uso de unico fichero

    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("pato lucas", 85000, 1999, 03, 01);
        Empleado empleado2 = new Empleado("Esperanza gomez", 95000, 1995, 06, 01);
        Empleado empleado3 = new Empleado("Ester d", 105000, 2002, 07, 13);

        empleado1.sube_Sueldo(5);
        empleado2.sube_Sueldo(5);
        empleado3.sube_Sueldo(5);

        System.out.println("Nombre : " + empleado1.dame_Nombre()
                + " Sueldo: " + empleado1.dame_sueldo()
                + " Fecha de Alta: " + empleado1.dame_FechaContrato());

        System.out.println("Nombre : " + empleado2.dame_Nombre()
                + " Sueldo: " + empleado2.dame_sueldo()
                + " Fecha de Alta: " + empleado2.dame_FechaContrato());

        System.out.println("Nombre : " + empleado3.dame_Nombre()
                + " Sueldo: " + empleado3.dame_sueldo()
                + " Fecha de Alta: " + empleado3.dame_FechaContrato());*/

        Jefatura jefe_RRH = new Jefatura(" Ducker", 55000, 1999, 5, 7);
        jefe_RRH.estableceIncentivo(2570);

        Empleado[] misEmpleados = new Empleado[6];//String[] miarray = new String[3];

        misEmpleados[0] = new Empleado(" Pato lucas", 85000, 1999, 03, 01);
        misEmpleados[1] = new Empleado(" Esperanza gomez", 95000, 1995, 06, 01);
        misEmpleados[2] = new Empleado(" Ester d", 105000, 2002, 07, 13);
        misEmpleados[3] = new Empleado(" Juanita");//Uso de Constructor
        misEmpleados[4] = jefe_RRH;//Polimorfismo en accion Principio Sustitucion
        misEmpleados[5] = new Jefatura(" Maria", 95, 1990, 10, 5);

        /*
        Refundicion o casting
        double num1=7.5;
        int num2=(int)num1;
         */
        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
        jefa_Finanzas.estableceIncentivo(55000);
        /*
        Empleado director_comercial = new Jefatura("Sandra", 1500, 2011, 02, 17);
        Comparable ejemplo=new Empleado("Duvan", 78000, 2015, 07, 07);
        
        if (director_comercial instanceof Empleado) {
            System.err.println("Es de tipo jefatura");
        }
        if (ejemplo instanceof Comparable) {
            System.err.println("Implementa la interfaz Comparable");
        }
         */

        System.out.println(jefa_Finanzas.tomarDecisiones("Soy el jefe papus"));

        System.out.println("El jefe" + jefa_Finanzas.dame_Nombre()
                + " Tiene un bonus de " + jefa_Finanzas.establece_bonus(1000));

        System.out.println(misEmpleados[3].dame_Nombre() + " Tiene un bonus de: "
                + misEmpleados[3].establece_bonus(200));
        /*
        for (int i = 0; i < 3; i++) {
            misEmpleados[i].sube_Sueldo(5);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre : " + misEmpleados[i].dame_Nombre()
                    + " Sueldo " + misEmpleados[i].dame_sueldo()
                    + " Fecha de alta " + misEmpleados[i].dame_FechaContrato());
        }
         */
        Arrays.sort(misEmpleados);
        //uso de instanceof para clases o interfaces
        /**
         * Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05,
         * 05); Comparable ejemplo = new Empleado("Juan", 95000, 2012, 9, 9);
         *
         * if (director_comercial instanceof Empleado) { System.out.println("Es
         * de tipo Jefatura"); } if (ejemplo instanceof Comparable) {
         * System.out.println("Implementa la interface comparable"); }*
         */

        for (Empleado e : misEmpleados) {
            e.sube_Sueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre : " + e.dame_Nombre()
                    + " Sueldo " + e.dame_Sueldo()
                    + " Fecha de alta " + e.dame_FechaContrato());
        }

    }

}

class Empleado implements Comparable, Trabajadores {

    //Constructor por defecto lleva ()
    public Empleado(String nom, double sue, int agno, int mes, int dia) {//Constructor con parametros
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    //Sobre Carga Constructores
    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String dame_Nombre() {//Getters
        return nombre + " el id es: " + Id;
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

    @Override
    public int compareTo(Object miObjeto) {
        /*Refundicion o casting
        double num1=7.5;
        int num2=(int)num1;*/
        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.Id < otroEmpleado.Id) {
            return -1;
        }
        if (this.Id > otroEmpleado.Id) {
            return 1;
        }
        return 0;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    @Override
    public double establece_bonus(double gratificacion) {
        return Trabajadores.bonus_base + gratificacion;
    }
}

class Jefatura extends Empleado implements Jefes {

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion ha tomado una desicion: " + decision;
    }

    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    @Override
    public double establece_bonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonus_base + gratificacion + prima;
    }

    // reemplaza el metodo q hereda de la clase empleado
    @Override
    public double dame_Sueldo() {
        double sueldoJefe = super.dame_Sueldo();
        return sueldoJefe + incentivo;
    }
    private double incentivo;
}
