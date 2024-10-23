/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido{
    private int duracion,calificacion;
    private String nombrepelicula;

    public Pelicula(int duracion1, int calificacion1, String nombre, String idNuevoContenido, String recomendacion) {
    }

    public Pelicula(int duracion, int calificacion, String nombrepelicula) {
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.nombrepelicula = nombrepelicula;
    }

    public Pelicula(int duracion, int calificacion, String nombrepelicula, String idcontenido, boolean recomendacionpersonal) {
        super(idcontenido, recomendacionpersonal);
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.nombrepelicula = nombrepelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", calificacion=" + calificacion + ", nombrepelicula=" + nombrepelicula + '}';
    }
        
}
