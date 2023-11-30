package matrices;
import java.util.Scanner;

public class Matrices {
    
    public static void main(String[] args) {
        
        final int cantidadEstudiantes = 3;
        final int cantidadAsignaturas = 2;
        double matrizNotas[][] = new double[cantidadEstudiantes][cantidadAsignaturas];
        Scanner scanner = new Scanner(System.in);
        
        for (int posicionEstudiante=1; posicionEstudiante<=cantidadEstudiantes; posicionEstudiante++) {
            for (int posicionAsignatura=1; posicionAsignatura<=cantidadAsignaturas; posicionAsignatura++) {
                System.out.println("Ingrese la nota #"+posicionAsignatura+" del estudiante #"+posicionEstudiante);
                matrizNotas[posicionEstudiante-1][posicionAsignatura-1] = scanner.nextDouble();
            }
        }
        
        double promedios[] = new double[cantidadEstudiantes];
        for (int posicionEstudiante=1; posicionEstudiante<=cantidadEstudiantes; posicionEstudiante++) {
            for (double nota : matrizNotas[posicionEstudiante-1]) {
                promedios[posicionEstudiante-1] += nota;
            }
            promedios[posicionEstudiante-1] /= 2;
        }
        
        System.out.println("Promedios obtenidos:");
        for (double promedio : promedios) {
            System.out.println(promedio);
        }
        
    }
}