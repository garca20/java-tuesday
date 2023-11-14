package elmayordetres;
import java.util.Scanner;

public class ElMayorDeTres {

    public static int encontrarMaximo(int primer, int segundo, int tercer) {
        if (primer>segundo&&primer>tercer) {
            return primer;
        }
        else {
            if (segundo>tercer) {
                return segundo;
            }
            else {
                return tercer;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int primer = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int segundo = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int tercer = scanner.nextInt();
        System.out.println("El mayor numero es: "+encontrarMaximo(primer, segundo, tercer));
    }
    
}
