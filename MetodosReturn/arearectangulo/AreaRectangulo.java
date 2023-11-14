package arearectangulo;
import java.util.Scanner;

public class AreaRectangulo {
    
    public static double areaRectangulo(double base, double altura) {
        double area = base*altura;
        return area;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        
        System.out.println("El area del rectangulo es " + areaRectangulo(base, altura));
    }
    
}
