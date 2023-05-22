import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        // Verifica se um número é par ou impar

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");

        }

        scanner.close();

    }
}
