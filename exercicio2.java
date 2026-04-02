import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        } else if (valorPago == valorCompra) {
            System.out.println("Não há troco a ser devolvido.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.printf("Total do troco: R$ %.2f\n", troco);
            System.out.println("Notas a serem entregues:");

            int valorRestante = (int) troco;

            int notas50 = valorRestante / 50;
            valorRestante %= 50;
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50,00");

            int notas20 = valorRestante / 20;
            valorRestante %= 20;
            if (notas20 > 0) System.out.println(notas20 + " nota(s) de R$ 20,00");

            int notas10 = valorRestante / 10;
            valorRestante %= 10;
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10,00");

            int notas5 = valorRestante / 5;
            valorRestante %= 5;
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5,00");

            int notas2 = valorRestante / 2;
            valorRestante %= 2;
            if (notas2 > 0) System.out.println(notas2 + " nota(s) de R$ 2,00");

            int notas1 = valorRestante;
            if (notas1 > 0) System.out.println(notas1 + " nota(s)/moeda(s) de R$ 1,00");
        }

        scanner.close();
    }
}