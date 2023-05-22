import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        
        // Lê três valores e exibe a média aritmética entre eles

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int numeroDois = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int numeroTres = scanner.nextInt();

        double media = (numeroUm + numeroDois + numeroTres) / 3;

        System.out.print("A média aritmetica dos valores é: " + media);
        scanner.close();

    }
}
