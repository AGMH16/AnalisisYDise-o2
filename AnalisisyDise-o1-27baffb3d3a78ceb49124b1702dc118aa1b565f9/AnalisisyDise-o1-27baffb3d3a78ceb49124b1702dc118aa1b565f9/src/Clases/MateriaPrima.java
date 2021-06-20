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

    private int total;
    private String loteAverio;
    private Date fechaIngreso;
    private Usuario usuario;

    public MateriaPrima() {
        this.total = total;
        this.loteAverio = loteAverio;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public MateriaPrima(int total, String loteAverio, Date fechaIngreso, Usuario usuario) {
        this.total = total;
        this.loteAverio = loteAverio;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
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
