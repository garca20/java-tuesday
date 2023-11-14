package volumentridimensionales;

public class VolumenTridimensionales {

    public static double volumenEsfera(double radio) {
        double volumen = (3*Math.PI*radio*radio*radio)/4;
        return volumen;
    }
    
    public static double volumenPrismaRectangular(double base, double ancho, double alto) {
        double volumen = base*ancho*alto;
        return volumen;
    }
    
    public static double volumenPiramide(double base, double ancho, double alto) {
        double volumen = (1/3)*(base*ancho*alto);
        return volumen;
    }
    
    public static double volumenCubo(double lado) {
        double volumen = lado*lado*lado;
        return volumen;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
