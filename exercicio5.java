import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Conceito: A (Excelente)");
        } else if (nota >= 7) {
            System.out.println("Conceito: B (Bom)");
        } else if (nota >= 5) {
            System.out.println("Conceito: C (Regular)");
        } else {
            System.out.println("Conceito: D (Insuficiente)");
        }

        scanner.close();
    }
}