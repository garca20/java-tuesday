package calcularareas;
import java.util.Scanner;

public class CalcularAreas {

    public static double areaRectangulo(double base, double altura) {
        double area = base*altura;
        return area;
    }
    
    public static double areaCuadrado(double lado) {
        double area = lado*lado;
        return area;
    }
    
    public static double areaCirculo(double radio) {
        double area = Math.PI*radio*radio;
        return area;
    }
    
    public static double areaTriangulo(double base, double altura) {
        double area = base*altura/2;
        return area;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String siNo = "si";
        
        do {
            System.out.println("Bienvenido al programa para calcular areas");
            System.out.println("Ingrese una opcion:");
            System.out.println("Rectangulo, Cuadrado, Circulo o Triangulo:");
            
            String opcion = scanner.next();
            opcion = opcion.toLowerCase();
            switch (opcion) {
                case "rectangulo":
                    System.out.println("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El area del rectangulo es " + areaRectangulo(base, altura));
                    break;

                case "cuadrado":
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El area del cuadrado es " + areaCuadrado(lado));
                    break;

                case "circulo":
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El area del circulo es " + areaCirculo(radio));
                    break;

                case "triangulo":
                    System.out.println("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("El area del triangulo " + areaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                    
                default:
                    System.out.println("Error: Opcion no valida");
                    break;
            }
            
            System.out.println("¿Desea usar el programa nuevamente?");
            siNo = scanner.next();
        } while (siNo.toLowerCase().equals("si"));
        System.out.println("Adios");
        scanner.close();
    }
    
}
