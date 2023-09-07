package conversiondetipos;
import java.util.Scanner;

public class Decimalaentero {
       public static void main(String[] args) {
        
        /*
        
        -- De double a número, usa ,
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un numero decimal: ");
        double decimal = scanner.nextDouble();
        int entero = (int) decimal;
        System.out.println(entero);
        
        
        -- De string a double, usa .
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un decimal");
        String fraseDecimal = scanner.nextLine();
        double decimal = Double.parseDouble(fraseDecimal);
        System.out.println(decimal+1);
        
        
        -- De char a int
        
        Scanner scanner = new Scanner(System.in);
           System.out.println("Ingrese un numero de una cifra: ");
           char num = scanner.next().charAt(0);
           int number = (int) num;
           System.out.println("El código ASCII de " + num + " es " + number);

        
        -- De short a char
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código ASCII de un caracter (0-255): ");
        short codigoAscii = scanner.nextShort();
        char caracter = (char) codigoAscii;
           System.out.println("El caracter correspondiente a " + codigoAscii);
           System.out.println("Es: " + caracter);

        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal: ");
        double decimal = scanner.nextDouble();
        String textoDecimal = String.valueOf(decimal);
        System.out.println(textoDecimal + 2);
        
        
        
        Scanner scanner = new Scanner(System.in);
           System.out.println("");
           int num = scanner.nextInt();
           String numBinary = Integer.toBinaryString(num);
           System.out.println(numBinary);

        */
        
        Scanner scanner = new Scanner(System.in);
           System.out.println("Ingrese un caracter mayusculo: ");
           char mayusculo = scanner.next().charAt(0);
           char minusculo = Character.toLowerCase(mayusculo);
           System.out.println(minusculo);
           
        Scanner scanner2 = new Scanner(System.in);
           System.out.println("Ingrese un caracter minusculo: ");
           char minusculo2 = scanner2.next().charAt(0);
           char mayusculo2 = Character.toUpperCase(minusculo2);
           System.out.println(mayusculo2);
    }
    
}
