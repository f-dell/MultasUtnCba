/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UTN.Multas;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int codigos[];
        float montos[];
        float total = 0;
        int conteo[] = new int[20];
        int mayor, codigoMayor;

        int n; //total de multas a procesar

        do {
            System.out.println("Ingrese la cantidad de actas a procesar: ");
            n = input.nextInt();
        } while (n <= 0);

        codigos = new int[n];
        montos = new float[n];

        for (int i = 0; i < codigos.length; i++) {
            do {
                System.out.println("Ingrese el codigo de la multa: ");
            } while (codigos[i] < 1 || codigos[i] > 20);

            codigos[i] = input.nextInt();
            System.out.println("Ingrese el monto de la multa: ");
            montos[i] = input.nextFloat();
            total += montos[i];
        }

        //Contar los codigos de actas labradas
        for (int i = 0; i < codigos.length; i++) {
            conteo[codigos[i] - 1]++;
        }

        System.out.println("Monto total recaudado: $ " + total);
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Actas codigo: " + (i + 1) + ": " + conteo[i]);
            }
        }

        //Buscar el codigo de infraccion que mas se presento
        mayor = conteo[0];
        codigoMayor = 1;
        for (int i = 1; i < conteo.length; i++) {
            if (conteo[i] > mayor) {
                codigoMayor = i + 1;
            }
        }

        System.out.println("El codigo de infraccion que mas se presento es: "
                + codigoMayor + " con: " + mayor + " actas labradas.");

    }

}
