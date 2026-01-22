/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
        /*
        En la funcion obtenerPromedioSemanal calculo el promedio de pedidos de 
        las 8 cafeterias, el cual fue enviado dentro de la funcion invocada en el
        metodo main y lo guardo en un arreglo unidimensional para luego retornarlo.
        */
    }

    public static int obtenerSumaTotal(int[][] pedidos) {

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
        /*
        En la funcion obtenerSumaTotal calculo la suma total de los pedidos de 
        las 8 cafeterias, el cual fue enviado dentro de la funcion invocada en el
        metodo main y lo guardo en una variable de suma para retornarlo.
        */
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
        /*
        En la funcion obtenerSumaSemanal, mediante un ciclo, voy a sumar los 
        pedidos semanales de cada cafeteria, y los guardo en un arreglo
        unidimensional. 
        */
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        
        return menor;
        /*
        En la funcion obtenerMenor recorro el arreglo pedidosCafeteria mediante
        un ciclo y voy guardando la posicion en la que se encuentra, comparando 
        si es menor mediante un condicional.
        */
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        
        return mayor;
        /*
        En la funcion obtenerMayot recorro el arreglo pedidosCafeteria mediante
        un ciclo y voy guardando la posicion en la que se encuentra, comparando 
        si es mayor mediante un condicional.
        */
    }

}
