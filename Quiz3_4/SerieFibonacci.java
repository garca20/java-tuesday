package seriefibonacci;
import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de terminos de la serie fibonacci");
        int cantidadTerminos = scanner.nextInt();
        int primerNumero = 0;
        int segundoNumero = 1;
        int almacenarValor;
        
        if (cantidadTerminos>0) {
            switch (cantidadTerminos) {
                case 1:
                    System.out.print(primerNumero);
                default:
                    System.out.print(primerNumero+" "+segundoNumero);
                    while (cantidadTerminos>2) {
                        almacenarValor = primerNumero;
                        primerNumero = segundoNumero;
                        segundoNumero = almacenarValor+segundoNumero;
                        System.out.print(" "+segundoNumero);
                        cantidadTerminos--;
                    }  
            }
        }
    }
}