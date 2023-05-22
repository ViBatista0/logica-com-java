import java.util.Scanner;

public class VerificaSePrimo {
    public static void main(String[] args) {

        // Verifica se um número é primo ou não

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e diremos se ele é primo ou não! ");
        int numero = scanner.nextInt();

        int contadora = 0;

        System.out.println("Divisores de: " + numero);

        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                System.out.print(i + ", ");
                contadora++;
            }
        }

        if (contadora > 2) {
            System.out.println("\nO número " + numero + " não é primo!");
        } else {
            System.out.println("\nO número " + numero + " é primo!");
        }

        scanner.close();

    }
}
