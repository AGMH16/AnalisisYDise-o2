/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author jenif
 */
public class InsumoUso {

    private String nombre;
    private int existencia;
    private Date fechaIngreso;
    private Float total;

    public InsumoUso() {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
    }

    public InsumoUso(String nombre, int existencia, Date fechaIngreso, float total) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    
}
