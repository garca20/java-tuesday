package matrizbidiomensionalpreasignada;

public class MatrizBidiomensionalPreasignada {

    public static void main(String[] args) {
        
        double matrizNotas[][] = {
            {4, 4},
            {5, 2},
            {2, 3}            
        };
        
        // Definimos las columnas, las usaremos para sacar el promedio
        
        final int columnas = matrizNotas[0].length;
        double promedios[] = new double[matrizNotas.length];
        
        /* 
            Sumamos a la matriz promedios la nota de cada estudiante para
            luego dividir entre la cantidad de columnas y obtener
            el promedio final
        */
        
        for (int index = 0; index < matrizNotas.length; index++) {
            for (double notas : matrizNotas[index]) {
                promedios[index] += notas;
            }
            promedios[index] /= columnas;
        }
        
        System.out.println("Promedios obtenidos:");
        for (double promedio : promedios) {
            System.out.println(promedio);
        }
        
    }
    
}
