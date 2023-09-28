package generarfactura;
import java.util.Scanner;

public class GenerarFactura {
    public static void main(String[] args) {
        int cantidadProducto;
        double precioUnitario, precioFactura, descuento;
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese su categoria:");
        System.out.println("(Normal, Plata, Oro, Platinum)");
        String categoriaCliente = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();
        
        System.out.println("Ingrese la cantidad de " + producto);
        cantidadProducto = scanner.nextInt();
        
        System.out.println("Ingrese su precio unitario:");
        precioUnitario = scanner.nextDouble();
        
        if (categoriaCliente.equals("Normal")) {
            descuento = 1;
        }
        else if (categoriaCliente.equals("Plata")) {
            descuento = 0.95;
        }
        else if (categoriaCliente.equals("Oro")) {
            descuento = 0.90;
        }
        else if (categoriaCliente.equals("Platinum")) {
            descuento = 0.85;
        }
        else {
            descuento = 0;
        }
        
        if (cantidadProducto>=10&&cantidadProducto<20&&cantidadProducto>=0) {
            descuento -= 0.1;
        }
        else {
            descuento -= 0.2;
        }       
        
        if (descuento>0) {
            precioFactura = (cantidadProducto*precioUnitario)*(descuento);
            System.out.println("Usted ha comprado '"+producto+"'");
            System.out.println("Valor por unidad:  $" + precioUnitario);
            System.out.println("Cantidad:          " + cantidadProducto);
            System.out.println("Precio total:      $" + precioFactura);
        }
        else {
            System.out.println("Error: Categoria Erronea.");
        }
        
        scanner.close();
    }
}