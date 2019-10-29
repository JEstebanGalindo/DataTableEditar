/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatablemodificar.utilitarios;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@author julian esteban vallejo galindo
 */
public class Carros {

    private String nombre;
    private String marca;
    private int modelo;
    
    /**
     * Constructor de la clase Carros
     * @param nombre del carro
     * @param marca del carro
     * @param modelo (año) de lanzamiento
     */
    public Carros(String nombre, String marca, Date modelo) {
        this.nombre = nombre;
        this.marca = marca;
        String formato="yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        this.modelo = Integer.parseInt(dateFormat.format(modelo));;
    }
    
    /**
     * getters y setters
     * @return 
     */
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getModelo() {
        return modelo;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
