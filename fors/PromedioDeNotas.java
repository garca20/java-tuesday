package promediodenotas;
import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes a evaluar (menor a 5): ");
        int cantidadEstudiantes = scanner.nextInt();
        if (cantidadEstudiantes<=5) {
            double definitivasAcumulativas = 0;   
            String tablaEstudiante1 = "", tablaEstudiante2 = "", tablaEstudiante3 = "", tablaEstudiante4 = "", tablaEstudiante5 = "";
            for (int posicionEstudiante=1; posicionEstudiante<=cantidadEstudiantes; posicionEstudiante++) {
                System.out.println("Ingrese el nombre del estudiante "+posicionEstudiante);
                String nombre = scanner.next();
                double notaParcialAcumulada = 0;
                double nota70Porciento = 0;
                double definitiva = 0;
                double notaParcial1 = 0, notaParcial2 = 0, notaParcial3 = 0;
                double notaFinal = 0;
                
                for (int posicionNotas=1; posicionNotas<=4; posicionNotas++) {

                        if (posicionNotas==1) {
                            System.out.println("Ingrese la nota del parcial "+posicionNotas);                            
                            notaParcial1 = scanner.nextDouble();
                            if ((notaParcial1>5)||(notaParcial1<0)) {
                                System.out.println("Error: Nota invalida, su valor sera 0.");
                                notaParcial1 = 0;
                            }
                            notaParcialAcumulada += notaParcial1;
                        }
                        else if (posicionNotas==2) {
                            System.out.println("Ingrese la nota del parcial "+posicionNotas);
                            notaParcial2 = scanner.nextDouble();
                            if ((notaParcial2>5)||(notaParcial2<0)) {
                                System.out.println("Error: Nota invalida, su valor sera 0.");
                                notaParcial2 = 0;
                            }
                            notaParcialAcumulada += notaParcial2;
                        }
                        else if (posicionNotas==3) {
                            System.out.println("Ingrese la nota del parcial "+posicionNotas);
                            notaParcial3 = scanner.nextDouble();
                            if ((notaParcial3>5)||(notaParcial3<0)) {
                                System.out.println("Error: Nota invalida, su valor sera 0.");
                                notaParcial3 = 0;
                            }
                            notaParcialAcumulada += notaParcial3;
                        }                
                        else if (posicionNotas==4) {
                            System.out.println("Ingrese la nota del examen final: ");
                            notaFinal = scanner.nextDouble();
                            if ((notaFinal>5)||(notaFinal<0)) {
                                System.out.println("Error: Nota invalida, su valor sera 0.");
                                notaFinal = 0;
                            }
                        }
                }
                nota70Porciento = (notaParcialAcumulada/3)*0.7;
                definitiva = nota70Porciento + notaFinal*0.3;
                if (posicionEstudiante==1) {
                    tablaEstudiante1 = "| "+nombre+" | "+notaParcial1+" | "+notaParcial2+" | "+notaParcial3+" | "+notaFinal+" | "+definitiva+" | ";
                }
                else if (posicionEstudiante==2) {
                    tablaEstudiante2 = "| "+nombre+" | "+notaParcial1+" | "+notaParcial2+" | "+notaParcial3+" | "+notaFinal+" | "+definitiva+" | ";
                }
                else if (posicionEstudiante == 3) {
                    tablaEstudiante3 = "| "+nombre+" | "+notaParcial1+" | "+notaParcial2+" | "+notaParcial3+" | "+notaFinal+" | "+definitiva+" | ";
                }
                else if (posicionEstudiante==4) {
                    tablaEstudiante4 = "| "+nombre+" | "+notaParcial1+" | "+notaParcial2+" | "+notaParcial3+" | "+notaFinal+" | "+definitiva+" | ";
                }
                else if (posicionEstudiante==5) {
                    tablaEstudiante5 = "| "+nombre+" | "+notaParcial1+" | "+notaParcial2+" | "+notaParcial3+" | "+notaFinal+" | "+definitiva+" | ";
                }
                definitivasAcumulativas += definitiva;
            }
            System.out.println("|---------------------------------------------|");
            System.out.println("| Nombre | Nota Parciales  | 70% | Definitiva |");
            System.out.println("|---------------------------------------------|");
            System.out.println(tablaEstudiante1);
            System.out.println(tablaEstudiante2);
            System.out.println(tablaEstudiante3);
            System.out.println(tablaEstudiante4);
            System.out.println(tablaEstudiante5);
            System.out.println("Promedio de definitivas del curso: "+definitivasAcumulativas/cantidadEstudiantes);
        }
        else {
            System.out.println("Error: Cantidad maxima 5.");
        }        
    }    
}