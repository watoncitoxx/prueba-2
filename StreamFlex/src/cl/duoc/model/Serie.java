/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido{
    private int temporadas;
    private boolean finalizada;
    private String nombreserie;

    public Serie(String nombre, int temporadas1, double finalizado, String idNuevoContenido, String recomendacion) {
    }

    public Serie(int temporadas, boolean finalizada, String nombreserie) {
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.nombreserie = nombreserie;
    }

    public Serie(int temporadas, boolean finalizada, String nombreserie, String idcontenido, boolean recomendacionpersonal) {
        super(idcontenido, recomendacionpersonal);
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.nombreserie = nombreserie;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public String getNombreserie() {
        return nombreserie;
    }

    public void setNombreserie(String nombreserie) {
        this.nombreserie = nombreserie;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporadas=" + temporadas + ", finalizada=" + finalizada + ", nombreserie=" + nombreserie + '}';
    }

    
}
