package ejercicios;
import java.util.Scanner;


//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
public class Ejercicio1_AC {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Salario del Jefe: ");
        double salarioJefe = teclado.nextDouble();
        
        System.out.println("Salario del Encargado: ");
        double salarioEncargado = teclado.nextDouble();
        
        System.out.println("Salario de un Oficinista: ");
        double salarioOficinistas = teclado.nextDouble();
        
        System.out.println("N�mero de Oficinistas: ");
        int numOficinistas = teclado.nextInt();
        
        System.out.println("Presupuesto de la Empresa: ");
        double presupuesto = teclado.nextDouble();
        
        System.out.println("�Proyectos Terminados? (true o false): ");
        boolean proyectosTerminados = teclado.nextBoolean();


        boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numOficinistas, presupuesto, proyectosTerminados);
        

        System.out.println("Resultado de la auditor�a: " + (resultado ? "Apto" : "No apto"));
    }

    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, 
                                           int numOficinistas, double presupuesto, boolean proyectosTerminados) {
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditor�a ya que no ha terminado los proyectos acordados.");
            return false;
        }

        double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numOficinistas);

        if (gastoTotal > 20000) {
            System.out.println("No ha pasado la auditor�a ya que el gasto en personal es de " + gastoTotal +
                               " y excede el l�mite mensual de 20.000 euros.");
            return false;
        }

        if (presupuesto > 100000) {
            System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado de " + presupuesto +
                               " excede el l�mite establecido en 100.000 euros.");
            return false;
        }

        System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene.");
        return true;
    }
}
