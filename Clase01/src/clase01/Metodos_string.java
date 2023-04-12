/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos_string {

    Scanner entrada;

    public Metodos_string() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Presentar caracteres    [1]");
        System.out.println("Presentar caracteres repetidos  [2]");
        System.out.println("Es palindromo   [3]");
        System.out.println("Contar vocales y consonantes    [4]");
        System.out.println("Salir   [0]");
        return entrada.nextInt();
    }

    public void carxcar() {
        String cadena = "";
        entrada.nextLine();
        System.out.println("Digite una cadena ");
        cadena = entrada.nextLine();
        System.out.println(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public void repeticion() {
        String cadena = "";
        char caracter;
        entrada.nextLine();
        int contador = 0;
        System.out.println("Digite una cadena ");
        cadena = entrada.nextLine();
        System.out.println(cadena);
        System.out.println("Digite el caracter a contar; ");
        caracter = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.printf("El caracter se repite %s veces\n", contador);
    }

    public String eliminarEspacios(String cad) {
        return cad.replace(" ", "");
    }

    //error en palindromo con el break
    public void palindromo() {
        String cadena1 = "";
        String cadena2 = eliminarEspacios(cadena1);
        int j = cadena2.length() - 1;
        boolean bandera = true;
        entrada.nextLine();
        System.out.println("Digite una cadena ");
        cadena1 = entrada.nextLine();
        System.out.println(cadena1);

        for (int i = 0; i < cadena2.length() / 2; i++) {
            if (cadena2.charAt(i) != cadena2.charAt(j)) {
                System.out.println("No es palindromo");
                break;
            }
            j++;
            System.out.println("Si es palindromo");
        }
        
    }

    public void contarvc() {
        String cadena1 = "";
        entrada.nextLine();
        System.out.println("Digite una cadena ");
        cadena1 = entrada.nextLine();
        System.out.println(cadena1);
        String cadena2 = eliminarEspacios(cadena1);
        int conv = 0;
        int conc = 0;
        for (int i = 0; i < cadena2.length(); i++) {
            if (cadena2.charAt(i) == 'a' || cadena2.charAt(i) == 'e'
                    || cadena2.charAt(i) == 'i' || cadena2.charAt(i) == 'o'
                    || cadena2.charAt(i) == 'u') {
                conv++;
            } else {
                conc++;
            }
        }
        System.out.printf("La frase tiene %s vocales y %s consonantes\n", conv, conc);
    }
}
