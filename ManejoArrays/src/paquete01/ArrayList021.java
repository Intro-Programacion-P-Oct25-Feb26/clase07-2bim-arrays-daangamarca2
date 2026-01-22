/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList021 {

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        ArrayList<String> iniciales = obtenerDatosIniciales(arreglo2);
        ArrayList<String> inicialesMinusculas = convertirMinusculas(iniciales);
        String cadenaFinal2 = obtenerCadenaFinal(inicialesMinusculas);

        System.out.printf("%s\n", cadenaFinal);
        System.out.printf("%s\n", cadenaFinal2);
    }

    public static ArrayList<String> obtenerDatosIniciales(ArrayList<String> nombres) {
        ArrayList<String> arreglo = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {
            String auxiliar = nombres.get(i);
            auxiliar = auxiliar.substring(0, 1);
            arreglo.add(auxiliar);
        }
        return arreglo;
    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        String opcion;

        while (bandera) {
            System.out.println("Ingrese un nombre de un país");
            String pais = entrada.nextLine();
            arreglo2.add(convertirMayusculas(pais));

            System.out.println("Desea ingresar salir, ingrese (s)");
            opcion = entrada.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                bandera = false;
            }
        }
        return arreglo2;
    }

    public static String convertirMayusculas(String c) {
        return c.toUpperCase();
    }

    public static ArrayList<String> convertirMinusculas(ArrayList<String> lista) {
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            resultado.add(lista.get(i).toLowerCase());
        }
        return resultado;
    }

    public static String obtenerCadenaFinal(ArrayList<String> lista) {
        String cadenaFinal = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, lista.get(i));
        }
        return cadenaFinal;
    }
}
