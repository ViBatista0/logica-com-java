import java.util.Scanner;

public class ConverteMetrosParaCentimetros {
    public static void main(String[] args) {
        
        // Converte metros para centímetros

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor em metros: ");
        int metros = scanner.nextInt();

        int centimetros = metros * 100;

        System.out.println("O valor de " + metros + " metros em centímetros é: " + centimetros + "cm");
        scanner.close();

    }
}
