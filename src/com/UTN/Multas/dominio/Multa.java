/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UTN.Multas.dominio;

/**
 *
 * @author Fabricio
 */
public class Multa {
    private long acta;
    private int codigo;
    private float monto;

    public Multa(long acta, int codigo, float monto) {
        this.acta = acta;
        this.codigo = codigo;
        this.monto = monto;
    }

    public long getActa() {
        return acta;
    }

    public void setActa(long acta) {
        this.acta = acta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

//    public float getMonto() {
//        return monto;
//    }
//
//    public void setMonto(float monto) {
//        this.monto = monto;
//    }
    
    
    //Comportamientos propios
    public float calcularMonto() { //Con este metodo reemplazamos el getMonto
        return monto;
    }

    @Override
    public String toString() {
        return "Acta Nº: " + acta + " |codigo de infraccion: " + codigo 
                + "| monto; $ " + monto;           
    }
    
    
    
    
    
}
