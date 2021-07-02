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
    private String loteAverio;
    private Date fechaIngreso;
    private Usuario usuario;
    private int unidadExistente;
    private String proveedor;

    public MateriaPrima() {
        this.total = total;
        this.loteAverio = loteAverio;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
        this.unidadExistente = unidadExistente;
        this.proveedor = proveedor;
    }

    public MateriaPrima(float total, String loteAverio, Date fechaIngreso, Usuario usuario, int unidadExistente, String proveedor) {
        this.total = total;
        this.loteAverio = loteAverio;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
        this.unidadExistente = unidadExistente;
        this.proveedor = proveedor;
    }

    public int getUnidadExistente() {
        return unidadExistente;
    }

    public void setUnidadExistente(int unidadExistente) {
        this.unidadExistente = unidadExistente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
