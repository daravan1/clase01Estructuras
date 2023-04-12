/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author SALA H
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos_string obj = new Metodos_string();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->
                    obj.carxcar();
                case 2 ->
                    obj.repeticion();
                case 3 ->
                    obj.palindromo();
                case 4 ->
                    obj.contarvc();
                default -> {
                }
            }
        } while (opc != 0);

    }

}
