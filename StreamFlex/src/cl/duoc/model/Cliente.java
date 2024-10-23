/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

import java.util.Scanner;
import streamflex.Scaner;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int idcliente;
    private int nombrecliente;
    private int consumomensual;

    public Cliente(String idclientenuevo, String nombre) {
    }

    public Cliente(int idcliente, int nombrecliente, int consumomensual) {
        this.idcliente = idcliente;
        this.nombrecliente = nombrecliente;
        this.consumomensual = consumomensual;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(int nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public int getConsumomensual() {
        return consumomensual;
    }

    public void setConsumomensual(int consumomensual) {
        this.consumomensual = consumomensual;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombrecliente=" + nombrecliente + ", consumomensual=" + consumomensual + '}';
    }
    public void crearCliente (){
        Scanner scanner= new Scaner(System.in);
        String idclientenuevo = scanner.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        String nombre = scanner.nextLine();
        Cliente clientenuevo = new Cliente (idclientenuevo,nombre);
        
        
    }
}
