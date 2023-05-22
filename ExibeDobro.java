import java.util.Scanner;

public class ExibeDobro {
    public static void main(String[] args) {
        
        // Um programa que lê um número e exibe o dobro

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você deseja saber o dobro: ");
        double numero = scanner.nextDouble();

        double res = numero * 2;

        System.out.println("O dobro de " + numero + " é " + res);

        scanner.close();

    }
}
