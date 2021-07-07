/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.Date;

/**
 *
 * @author Toshiba
 */
public class MateriaPrima {
    private float total;
    private String loteAverio, proveedor;
    private int unidadExistente;
    private String fechaIngreso;
    private Usuario usuario;

    public MateriaPrima() {
        this.total = total;
        this.loteAverio = loteAverio;
        this.proveedor = proveedor;
        this.unidadExistente = unidadExistente;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }
    
    public MateriaPrima(float total, String loteAverio, String proveedor, int unidadExistente, String fechaIngreso, Usuario usuario) {
        this.total = total;
        this.loteAverio = loteAverio;
        this.proveedor = proveedor;
        this.unidadExistente = unidadExistente;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getUnidadExistente() {
        return unidadExistente;
    }

    public void setUnidadExistente(int unidadExistente) {
        this.unidadExistente = unidadExistente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getLoteAverio() {
        return loteAverio;
    }

    public void setLoteAverio(String loteAverio) {
        this.loteAverio = loteAverio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


}
