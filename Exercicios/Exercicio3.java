import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o número
        System.out.print("Digite um número para ver a tabuada (1 a 10): ");
        int numero = sc.nextInt();

        // Verifica se o número está dentro do intervalo válido
        if (numero >= 1 && numero <= 10) {
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        }

        sc.close();
    }
}