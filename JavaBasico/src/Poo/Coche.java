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
public class Coche {

    /*
        Objeto
        
        En pseudocodigo
        
        accediendo a propiedades
        Renault.color="rojo";
        nombre.propiedad=valor;
        
        accediendo a comportamiento
        Renault.apaga();
        nombre.metodo;
        
     */
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoplataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, aireacondicionado;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoplataforma = 500;
    }

    public String dime_datos_generales() {//Getter
        return " el carro tiene " + ruedas + " ruedas "
                + " mide " + largo / 1000 + " metros con un ancho de " + ancho
                + " cm y un peso de " + pesoplataforma + " Kg ";
    }

    public void establece_color(String color_coche) {//Setter
        //color = "azul";
        color = color_coche;
    }

    public String dime_color() {//Getter
        return " el color del coche es " + color;
    }

    public void configurar_asientos(String asientos_cuero) {//Setter
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() {//Getter
        if (asientos_cuero == true) {
            return "el coche tiene asientos de cuero ";
        } else {
            return "el coche No tiene asientos de cuero ";
        }
    }

    public void configura_aireacondicionado(String aireacondicionado) {//Setter
        if (aireacondicionado.equalsIgnoreCase("si")) {
            this.aireacondicionado = true;
        } else {
            this.aireacondicionado = false;
        }
    }

    public String dime_aireacondicionado() {//Getter
        if (aireacondicionado == true) {
            return "el coche cuenta con aire acondicionado ";
        } else {
            return "el coche No cuenta con aire acondicionado ";
        }
    }

    //Setter y Getter no se recomienda
    public String dime_peso_coche() {
        int peso_carroceria = 500;
        peso_total = pesoplataforma + peso_carroceria;
        if (asientos_cuero == true) {
            peso_total = peso_total + 50;
        }
        if (aireacondicionado == true) {
            peso_total = peso_total + 20;
        }
        return "el peso del coche es " + peso_total;

    }

    public int precio_coche() {//Getter
        int preciofinal = 10000;
        if (asientos_cuero == true) {
            preciofinal += 2000;

        }
        if (aireacondicionado == true) {
            preciofinal += 1500;
        }
        return preciofinal;
    }

}
