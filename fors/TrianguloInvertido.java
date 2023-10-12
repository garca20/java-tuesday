package trianguloinvertido;
import java.util.Scanner;
public class TrianguloInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int baseTriangulo;
        for (int alturaTriangulo = numero; alturaTriangulo>0; alturaTriangulo--) {
            for (baseTriangulo=1; baseTriangulo<=alturaTriangulo; baseTriangulo++) {
            System.out.print(baseTriangulo + " ");
            }
            System.out.println("");
        }
    }
}
