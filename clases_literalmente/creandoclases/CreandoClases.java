package creandoclases;


public class CreandoClases {

    private CreandoClases(){}
        
    public static int sumar(int a, int b) {
        return a+b;
    }
        
    public static int restar(int a, int b) {
        return a-b;
    }
        
   public static int multiplicar(int a, int b) {
        return a*b;
    }
        
    public static double dividir(double a, double b) {
        return (double) a/b;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Suma: " + CreandoClases.sumar(5, 3));
        
    }
    
}
