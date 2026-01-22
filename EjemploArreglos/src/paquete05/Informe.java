/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {

    public static int obtenerTotalDia(int[][] pedidos, int dia) {

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia - 1];
        }
        return suma;
        /*
        En la funcion obtenerTotalDia sumo el total de pedidos en un dia de las
        ocho cafeterias.
         */

    }

    public static String obtenerCafeteriaMasPedidos(int[][] pedidos, String[] cafeterias) {

        int[] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);

        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];

            if (valor > mayor) {
                mayor = valor;
                indice = i;
            }
        }

        return cafeterias[indice];
        /*
        Voy guardando en un arreglo segun el orden de mayor a memnor, la cafeteria
        que tuvo mas pedidos a la que tuvo menos pedidos.
        */
    }

    public static int[]
            obtenerMenorPedidoCafeteria(int[][] pedidos) {
        int[] pedidosMenores = new int[8];

        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }

        return pedidosMenores;
        /*
        Voy guardando el nombre de la cafeteria que tuvo menos pedidos, segun un 
        ciclo y la posicion de el valor retornado de la funcion obtenerMenor
         */
    }

    public static int[] obtenerMayorPedidoCafeteria(int[][] pedidos) {
        int[] pedidosMayores = new int[8];

        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }

        return pedidosMayores;
        /*
        Voy guardando el nombre de la cafeteria que tuvo mas pedidos, segun un 
        ciclo y la posicion de el valor retornado de la funcion obtenerMayor
         */
    }

}
