
package ejercicio1;

import java.util.Scanner;

public class MainSalario {
    public static void main(String[] args) {
        double sala1 = 0.0;
        double sala2 = 0.0;
        double sala3 = 0.0;
        CalcularSalario salario = new CalcularSalario();
        
         
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite las horas trabajadas :");
        salario.setHorTravajadas(leer.nextDouble());
        System.out.println("Introdusca el pago por hora :");
        salario.setPagPorhora(leer.nextDouble());
        System.out.println("------------------------------------");
        salario.calcularSalario();
        
        sala1 = salario.calcularSalario();
        sala2 = salario.renta(salario);
        sala3 = salario.salarioLiquido(salario);
        System.out.println("El salario bruto es : $"+sala1);
        System.out.println("El monto de la retencion aplicada es : $"+sala2);
        System.out.println("El salario liquido es : $"+sala3);
    }
}
