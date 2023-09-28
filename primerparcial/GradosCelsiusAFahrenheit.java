package gradoscelsiusafahrenheit;
import java.util.Scanner;

public class GradosCelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius*9/5)+32;
        String clasificacionTemperatura = (fahrenheit<32)?"Frio":(fahrenheit>=32&&fahrenheit<70)?"Templado":(fahrenheit>=70&&fahrenheit<90)?"Calido":"Caluroso";
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");
        System.out.println("Clasificacion de temperatura: " + clasificacionTemperatura);
        scanner.close();
    }
}