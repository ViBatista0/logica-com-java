import java.util.Scanner;

public class SomaDoisValores {
    public static void main(String[] args) {

        // Um programa que recebe dois valores e realiza a soma deles.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        float valorUm = scanner.nextFloat();

        System.out.println("Digite o segundo valor: ");
        float valorDois = scanner.nextFloat();

        float res = valorUm + valorDois;

        System.out.println("O valor da soma é: " + res);

        scanner.close();
    }
}
