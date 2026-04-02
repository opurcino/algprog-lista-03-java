import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        double maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;

        double menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;

        double media = (n1 + n2 + n3) / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.printf("A média aritmética é: %.2f\n", media);

    }
}