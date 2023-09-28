package producciondepan;
import java.util.Scanner;

public class ProduccionDePan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double harina, agua, sal;
        System.out.println("Ingrese la cantidad de harina (en gramos): ");
        harina = scanner.nextDouble();
        
        System.out.println("Ingrese la cantidad de agua (en mililitros): ");
        agua = scanner.nextDouble();
        
        System.out.println("Ingrese la cantidad de sal (en gramos): ");
        sal = scanner.nextDouble();
        
        if ((harina>=700)&&(agua>=450)&&(sal>=25)) {
            System.out.println("Se puede producir 'Pan de Avena'");
        }
        else if ((harina>=600)&&(agua>=400)&&(sal>=20)) {
            System.out.println("Se puede producir 'Pan Integral'");
        }
        else if ((harina>=500)&&(agua>=300)) {
            System.out.println("Se puede producir 'Pan Comun'");
        }
        else {
            System.out.println("No es posible producir ningun pan.");
        }
        
        scanner.close();
    }
}
