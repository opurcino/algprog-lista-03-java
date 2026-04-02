import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Verificador de Triângulos ---");
        System.out.print("Digite o lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double ladoC = scanner.nextDouble();

        
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            
           
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("É um Triângulo Equilátero (todos os lados iguais).");
            } 
            
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um Triângulo Isósceles (dois lados iguais).");
            } 
           
            else {
                System.out.println("É um Triângulo Escaleno (todos os lados diferentes).");
            }

        } else {
            System.out.println("Os valores informados NÃO podem formar um triângulo.");
        }

       scanner.close();
    }
}