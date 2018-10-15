
package juego;

import java.util.Scanner;

/**
 * Clase que contiene el juego del ahorcado
 * @author Mansilla jaime.mansilla98@gmail.com
 * @version 1.0
 */
public class Juego {

  
 public static void main(String[] args) {
     //**********Variables*************
        Scanner s = new Scanner(System.in);
        int vidas = 6;
        String palabra;
        int aciertos = 0;
        int tamaño;
        String opcion;
        int contador = 0;
        String[] palabras = new String[]{"lapiz", "goma", "libreta", "maestro", "examen", "matematicas"};
        char[] respuesta;
        palabra = palabras[(int) (Math.random() * 5)];
        tamaño = palabra.length();
        respuesta = new char[tamaño];
         
         
        for (int i = 0; i < tamaño; i++) {
            respuesta[i] = 'X';
        }
         
 //se ejecuta mientras no haya llegado a los aciertos o haya muerto
        while (aciertos != tamaño && vidas != 0) {
            System.out.println("=========AHORCADO :)==========          VIDAS="+vidas +" Aciertos= "+aciertos);
            dibujar(vidas);
            System.out.println("");
            for (int i = 0; i < tamaño; i++) {
 
                System.out.print(respuesta[i]);
            }
            System.out.println("\nIngresa una letra: ");
            opcion = s.next();
            if (palabra.contains(opcion)) {
                for (int i = 0; i < tamaño; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        respuesta[i] = opcion.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } else {
                vidas--;
            }
 
            contador = 0;
        }
        if(vidas==0){
            dibujar(vidas);
        }else
        {
            System.out.println("");
            for (int i = 0; i < tamaño; i++) {
 
                System.out.print(respuesta[i]);
            }
            System.out.println(" ");
            System.out.println("YOU WIN :)");
             
        }
    }
    
/**
 * Metodo que dibuja el muñeco en funcion de las vidas que queden
 * @param i indice que significa vidas 
 */ 
    private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j <2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }
}
