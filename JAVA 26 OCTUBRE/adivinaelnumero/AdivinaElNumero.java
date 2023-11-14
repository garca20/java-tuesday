package com.mycompany.adivinaelnumero;
import java.util.Scanner;
import java.util.Random;
public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String siNo="si";
        int caso=0;
        
        do {
            int numeroRandom = random.nextInt(10)+1;
            int intentos = 0;
            System.out.println("La computadora ha seleccionado un número\nAl azar del 1 al 10:");
            System.out.println("Intenta adivinarlo:");
            do {
                int numeroJugador = scanner.nextInt();
                // if (numeroJugadorString.toLowerCase().equals("salir") {
                //      break;
                // }
                // else {
                //   numeroJugador = numeroJugadorString.valueOf();
                //   (Todo el codigo)
                // }
                if (numeroJugador>numeroRandom) {caso=1;}
                else if (numeroJugador==numeroRandom) {caso=2;}
                else if (numeroJugador<numeroRandom) {caso=3;}

                switch (caso) {
                    case 1:
                        System.out.println("Incorrecto");
                        System.out.println("Pista: El numero es menor al ingresado.");
                        intentos++;
                        break;
                    case 2:
                        System.out.println("¡Correcto!");
                        System.out.println("¡El numero es igual al ingresado!");
                        break;
                    case 3:
                        System.out.println("Incorrecto");
                        System.out.println("Pista: El numero es mayor al ingresado.");
                        intentos++;
                        break;
                }

                if (numeroJugador==numeroRandom) {break;}
            } while (true);
            
            System.out.println("Te tomo "+intentos+" intentos en adivinar el numero.");
            System.out.println("\n¿Deseas jugar nuevamente?");
            siNo = scanner.next();
            
        } while (siNo.toLowerCase().equals("si"));
        System.out.println("¡Hasta luego!");
    }
}
