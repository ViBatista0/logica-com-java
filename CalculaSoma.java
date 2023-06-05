public class CalculaSoma {
    public static void main(String[] args) {
        
        // Calcula a soma dos números de 1 a 100

        int numero = 0;

        for (int i = 1; i <= 100; i++) {
            numero += i; 
        }

        System.out.println("A soma dos números é: " + numero);

    }
}
