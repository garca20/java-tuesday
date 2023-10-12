package pulgadaspiesometros;
import java.util.Scanner;
public class PulgadasPiesOMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud:");
        double longitud = scanner.nextDouble();
        System.out.println("Ingrese la unidad de medida base (Pies, Pulgadas, Metros)");
        String unidadBase = scanner.next();
        double conversion = 1;
        String unidadFinal = "Error";
        switch (unidadBase) {
            case "Pies":
                System.out.println("Ingrese la unidad de medida final (Pulgadas, Metros)");
                unidadFinal = scanner.next();
                
                switch (unidadFinal) {
                    case "Pulgadas":
                        conversion = 12;
                        break;
                    case "Metros":
                        conversion = 0.3048;
                        break;
                    default:
                        break;
                }
                break;
             
                
            case "Pulgadas":
                System.out.println("Ingrese la unidad de medida final (Pies, Metros)");
                unidadFinal = scanner.next();
                
                switch (unidadFinal) {
                    case "Pies":
                        conversion = 0.0833333;
                        break;
                    case "Metros":
                        conversion = 0.0254;
                        break;
                    default:
                        break;
                }
                break;
                
            case "Metros":
                System.out.println("Ingrese la unidad de medida final (Pies, Pulgadas)");
                unidadFinal = scanner.next();
                
                switch (unidadFinal) {
                    case "Pies":
                        conversion = 3.28084;
                        break;
                    case "Pulgadas":
                        conversion = 39.3701;
                        break;
                    default:
                        break;
                        
                }
                break;
                
            default:
                break;
        }
        double longitudFinal = longitud*conversion;
        System.out.println(longitud + " " + unidadBase + " equivalen a " + longitudFinal + " " + unidadFinal);
    }
    
}
