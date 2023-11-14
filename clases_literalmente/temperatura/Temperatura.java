package temperatura;
import java.util.Scanner;

class conversorTemperatura{
    
    private conversorTemperatura(){}
        
    public static double celsiusFarenheit(double temperatura){
        return (temperatura * 9/5) + 32;
    }
        
    public static double fahrenheitCelsius(double temperatura){
        return (temperatura-32)*5/9;
    }
    
}

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius+"°C equivalen a "+conversorTemperatura.celsiusFarenheit(celsius)+"°F\n");
        System.out.println(Math.abs(celsius));
        System.out.println("Ingrese la temperatura en grados fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit+"°F equivalen a "+conversorTemperatura.fahrenheitCelsius(fahrenheit)+"°C");
    }
}
