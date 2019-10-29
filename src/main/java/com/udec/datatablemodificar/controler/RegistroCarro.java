/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatablemodificar.controler;

import com.udec.datatablemodificar.utilitarios.Carros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;

/**
 *@author julian esteban vallejo galindo
 */
@Named(value = "registroCarro")
@ViewScoped
public class RegistroCarro implements Serializable{

    private String nombre;
    private String marca;
    private List<String> marcas;
    private List<Carros> carros;
    private List<Carros> filtros;
    private Date modelo;
    
    
    /**
    * PostConstructor de la clase,  inicializa las listas
    * y se crea la lista de marcas
    */
    @PostConstruct
    public void iniciar(){
       carros=new ArrayList<>();
        marcas=new ArrayList<>();
        marcas.add("Renault");
        marcas.add("Mazda");
        marcas.add("Chevrolet");
        marcas.add("Ford");
	marcas.add("Hyundai");
	marcas.add("Susuki");
    }
    
    /**
     * Metodo que llena el datatable
     */
    public void llenarTabla(){
        carros.add(new Carros(nombre,marca,modelo));
        nombre="";
        modelo=null;
                
    }
    
    /**
     * metodo que elimiina del datatable
     * @param r Carro a eliminar
     */
    public void eliminarCarro(Carros r){
        carros.remove(r);
    }
    
    /**
     * Metodo que edita del datatable
     * @param event 
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Se edito el carro: ", ((Carros) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    /**
     * Metodo que cancela el metodo de eliminar
     * @param event 
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada para: ", ((Carros) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
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
    public List<String> getMarcas() {
        return marcas;
    }
    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
    public Date getModelo() {
        return modelo;
    }
    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }
    public List<Carros> getCarros() {
        return carros;
    }
    public void setCarros(List<Carros> carros) {
        this.carros = carros;
    }
    public List<Carros> getFiltros() {
        return filtros;
    }
    public void setFiltros(List<Carros> filtros) {
        this.filtros = filtros;
    }
}
