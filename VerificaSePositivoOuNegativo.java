import java.util.Scanner;

public class VerificaSePositivoOuNegativo {
    public static void main(String[] args) {
        
        // Verifica se um número é positivo, negativo ou zero

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("O número digitado é positivo!");
        }
        else if(numero < 0){
            System.out.println("O número digitado é negativo!");
        }
        else{
            System.out.println("O número é: " + numero);
        }

        scanner.close();

    }
}
