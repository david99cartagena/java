package javabasico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class ClaseString {

    public static void main(String[] args) {
        //String mi_nombres = "David";
        //    instanciar o ejemplarizar
        String nombre = "david stevens cartagena";
        System.out.println("mi nombres es " + nombre);
        System.out.println("mi nombres tiene " + nombre.length() + " letras");
        System.out.println("mi nombre " + nombre + " la primera del nombres es " + nombre.charAt(0));
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("ultima letra de mi letra " + nombre.charAt(ultima_letra - 1));
    }

}
