import java.util.Scanner;


public class CalculaFatorial {
    public static void main(String[] args) {

        // Verifica se um número é par ou impar

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        for(int i = numero - 1; i >= 1; i--){
            numero *= i;
        }

        System.out.println("O resultado do fatorial é: " + numero);

        scanner.close();

    }
}
