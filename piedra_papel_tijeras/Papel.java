package papel;

import java.util.Random;
import java.util.Scanner;

public class Papel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = new String[3];
        
        opciones[0] = "piedra";
        opciones[1] = "papel";
        opciones[2] = "tijeras";
        
        int computerIndex = random.nextInt(2);
        String computerChoice = opciones[computerIndex];
        String opcion;
        do {
            System.out.println("Elije (piedra), (papel) o (tijeras):");
            opcion = scanner.next();
        } while (!(opcion.equals("piedra")||opcion.equals("papel")||opcion.equals("tijeras")));
        
        System.out.println(computerChoice);
        
        if (opcion.equals(computerChoice)) {
            System.out.println("Empate.");
        }
        else if (
                (opcion.equals("piedra") && computerChoice.equals("tijeras"))||
                (opcion.equals("papel") && computerChoice.equals("piedra"))||
                (opcion.equals("tijeras") && computerChoice.equals("papel"))
                ) {
            System.out.println("Tu ganas");
        }
        else {
            System.out.println("Tu pierdes.");
        }
        
    }
    
}
