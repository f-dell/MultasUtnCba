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
public class Caminera {

    private Multa multas[];
    private int ultimaCarga;

    public Caminera(int cantidad) {
        multas = new Multa[cantidad];
        ultimaCarga = 0;
    }

//    public boolean registrarMulta(Multa multa) { 
//        if (ultimaCarga < multas.length) {
//            multas[ultimaCarga] = multa;
//            return true;
//        }
//        return false;
//}
     
    public boolean registrarMulta(Multa multa) { //idem metodo anterior evitando (por buena practica) colocar dos return
        boolean aux = false;
        if (ultimaCarga < multas.length) {
            multas[ultimaCarga] = multa;
            ultimaCarga++;
            aux = true;
        }
        return aux;
    }

    public float calcularTotal() {
        float aux = 0;
        //for each
        for (Multa multa : multas) {
            if (multa != null) {
                aux += multa.calcularMonto();
            }
        }
        return aux;
    }
    
    public int[] contabilizarCodigosMulta() {
        int conteo[] = new int[20];
        for (Multa multa : multas) {
            conteo[multa.getCodigo() - 1]++;
        }        
        return conteo;
    }
    
    public String mostrarMayorCodigo() {
        String aux = null;
        int mayor;
        int conteo[] = this.contabilizarCodigosMulta();
        int codigoMayor;
        
        mayor = conteo[0];
        codigoMayor = 1;
        for (int i = 1; i < conteo.length; i++) {
            if (conteo[i] > mayor) {
                codigoMayor = i + 1;
            }
        }     
        aux = "El codigo de infraccion mas frecuente es: " + codigoMayor 
                + " con: " + mayor + " actas labradas.";
        return aux;
    }

}
