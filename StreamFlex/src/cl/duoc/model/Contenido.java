/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import streamflex.Scaner;

/**
 *
 * @author Cetecom
 */
public class Contenido {
    private String idcontenido;
    private boolean recomendacionpersonal;
    private List <Contenido> listacontenido = new ArrayList <>(); 

    public Contenido() {
    }

    public Contenido(String idcontenido, boolean recomendacionpersonal) {
        this.idcontenido = idcontenido;
        this.recomendacionpersonal = recomendacionpersonal;
    }

    public String getIdcontenido() {
        return idcontenido;
    }

    public void setIdcontenido(String idcontenido) {
        this.idcontenido = idcontenido;
    }

    public boolean isRecomendacionpersonal() {
        return recomendacionpersonal;
    }

    public void setRecomendacionpersonal(boolean recomendacionpersonal) {
        this.recomendacionpersonal = recomendacionpersonal;
    }

    public List<Contenido> getListacontenido() {
        return listacontenido;
    }

    public void setListacontenido(List<Contenido> listacontenido) {
        this.listacontenido = listacontenido;
    }

    @Override
    public String toString() {
        return "Contenido{" + "idcontenido=" + idcontenido + ", recomendacionpersonal=" + recomendacionpersonal + ", listacontenido=" + listacontenido + '}';
    }

    public void agregarContenido(){
        Scanner scanner = new Scaner(System.in);
        String idNuevoContenido = scanner.nextLine();
        System.out.println("¿Es contenido Recomendado?");
        String recomendacion = scanner.nextLine();
        System.out.println("¿Que tipo de contenido desea agregar?");
        System.out.println("1) Pelicula");
        System.out.println("2) Serie");
        System.out.println("3) Documental");
        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("¿Cual es el nombre de la pelicula?");
                String nombrepelicula = scanner.nextLine();
                System.out.println("¿Cual es la duracion de la pelicula? (En minutos)");
                int duracion = scanner.nextInt();
                System.out.println("¿Cual es la clasificacion de la pelicula?");
                int calificacion = scanner.nextInt();
                Pelicula nuevaPelicula = new Pelicula(duracion,calificacion,nombrepelicula,idNuevoContenido,recomendacion);
                break;
            case 2:
                System.out.println("¿Cual es el nombre de la serie?");
                String nombreserie = scanner.nextLine();
                System.out.println("¿Cuantas temporadas tiene la serie?");
                int temporadas = scanner.nextInt();
                System.out.println("¿La serie esta finalizada?");
                double finalizado = scanner.nextDouble();
                Serie nuevaSerie = new Serie (nombreserie,temporadas,finalizado,idNuevoContenido,recomendacion);
            case 3:
                System.out.println("¿Cual es el nombre del documental?");
                String nombredocumental = scanner.nextLine();
                System.out.println("¿Cual es la duracion del documental? (en minutos)");
                int duraciondocumental = scanner.nextInt();
                System.out.println("¿El documental tiene un enfoque educativo?");
                double educativo = scanner.nextDouble();
                Documental nuevodocumental = new Documental (nombredocumental,duraciondocumental,educativo,idNuevoContenido,recomendacion);
             default:
                throw new AssertionError();
        }
    }
}
