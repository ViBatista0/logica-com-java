import java.util.Scanner;

public class ExibeMaior {
    public static void main(String[] args) {

        // Lê dois números e exibe o maior entre eles

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int numeroDois = scanner.nextInt();

        int res = numeroUm > numeroDois ?  numeroUm : numeroDois;

        System.out.println("O maior número é: " + res);

        scanner.close();

    }
}
