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
public class LotePollo {

    private float total;
    private String loteAverio, proveedor;
    private int unidadExistente;
    private Date fechaIngreso;
   // private Usuario usuario;
    

    public LotePollo() {
        this.loteAverio = loteAverio;
        this.unidadExistente= unidadExistente;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
        this.proveedor=proveedor;
    }

    public LotePollo(String loteAverio,int unidadExistente,Date fechaIngreso, float total, String proveedor) {
        this.loteAverio = loteAverio;
        this.unidadExistente= unidadExistente;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
        this.proveedor=proveedor;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


}
