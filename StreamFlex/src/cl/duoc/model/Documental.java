/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido{
    private int duracion;
    private double enfoqueeducativo;
    private String nombredocumental;

    public Documental(String nombredocumental1, int duraciondocumental, double educativo, String idNuevoContenido, String recomendacion) {
    }

    public Documental(int duracion, double enfoqueeducativo, String nombredocumental) {
        this.duracion = duracion;
        this.enfoqueeducativo = enfoqueeducativo;
        this.nombredocumental = nombredocumental;
    }

    public Documental(int duracion, double enfoqueeducativo, String nombredocumental, String idcontenido, boolean recomendacionpersonal) {
        super(idcontenido, recomendacionpersonal);
        this.duracion = duracion;
        this.enfoqueeducativo = enfoqueeducativo;
        this.nombredocumental = nombredocumental;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getEnfoqueeducativo() {
        return enfoqueeducativo;
    }

    public void setEnfoqueeducativo(double enfoqueeducativo) {
        this.enfoqueeducativo = enfoqueeducativo;
    }

    public String getNombredocumental() {
        return nombredocumental;
    }

    public void setNombredocumental(String nombredocumental) {
        this.nombredocumental = nombredocumental;
    }

    @Override
    public String toString() {
        return "Documental{" + "duracion=" + duracion + ", enfoqueeducativo=" + enfoqueeducativo + ", nombredocumental=" + nombredocumental + '}';
    }
    
}
