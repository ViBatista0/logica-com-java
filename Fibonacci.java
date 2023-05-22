import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // Lê um número e exibe o Fibonacci dele.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja faber o Fibonacci: ");
        int valorFibo = scanner.nextInt();

        int posterior, anterior = 0, atual = 1;

        for(int i = 0; i < valorFibo; i++){
            System.out.print(atual + ", ");
            posterior = anterior + atual;
            anterior = atual; 
            atual = posterior;
        }


        

        scanner.close();

    }
}
