/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Toshiba
 */
public class MovimientoLote {

    private MateriaPrima lotePollo;
    private PerdidaMateriaPrima perdidaMateriaPrima;

    public MovimientoLote() {
        this.lotePollo = lotePollo;
        this.perdidaMateriaPrima = perdidaMateriaPrima;
    }

    public MovimientoLote(MateriaPrima lotePollo, PerdidaMateriaPrima perdidaMateriaPrima) {
        this.lotePollo = lotePollo;
        this.perdidaMateriaPrima = perdidaMateriaPrima;
    }

    public MateriaPrima getLotePollo() {
        return lotePollo;
    }

    public void setLotePollo(MateriaPrima lotePollo) {
        this.lotePollo = lotePollo;
    }

    public PerdidaMateriaPrima getPerdidaMateriaPrima() {
        return perdidaMateriaPrima;
    }

    public void setPerdidaMateriaPrima(PerdidaMateriaPrima perdidaMateriaPrima) {
        this.perdidaMateriaPrima = perdidaMateriaPrima;
    }

}