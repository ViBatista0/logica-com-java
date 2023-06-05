import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        // Imprime a tabuada de um número digitado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número que deseja ver a tabuada:");
        int numero = scanner.nextInt();

        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = numero * i;
            System.out.println(numero + " x " + i + " = " + res);    
        }

        scanner.close();

    }
}
