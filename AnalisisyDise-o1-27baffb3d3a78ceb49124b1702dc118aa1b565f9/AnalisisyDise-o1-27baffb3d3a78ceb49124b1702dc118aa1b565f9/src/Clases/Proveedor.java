/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jenif
 */
public class Proveedor {

    private String nombre, direccion, telefono, empresa;

    public Proveedor() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public Proveedor(String nombre, String direccion, String telefono, String empresa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
