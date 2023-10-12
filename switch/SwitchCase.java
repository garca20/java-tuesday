package switchcase;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero del dia de la semana");
        Scanner scanner = new Scanner(System.in);
        int diaSemana = scanner.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Es Lunes");
                 break;
            case 2:
                System.out.println("Es Martes");
                 break;
            case 3:
                System.out.println("Es Miercoles");
                 break;
            case 4:
                System.out.println("Es Jueves");
                 break;
            case 5:
                System.out.println("Es Viernes");
                 break;
            case 6:
                System.out.println("Es Sabado");
                 break;
            case 7:
                System.out.println("Es Domingo");
                 break;
            default:
                System.out.println("Dia invalido");
                break;
        }   
    }
}