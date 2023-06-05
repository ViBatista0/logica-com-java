import java.util.Scanner;

public class VerificaSeFormaTriangulo {
    public static void main(String[] args) {

        // Recebe três valores e verifica se forma ou não um triângulo

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valorUm = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valorDois = scanner.nextDouble();

        System.out.println("Digite o terceiro valor:");
        double valorTres = scanner.nextDouble();

        if (valorUm + valorDois > valorTres && valorDois + valorTres > valorUm && valorUm + valorTres > valorDois) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }

        scanner.close();

    }
}
