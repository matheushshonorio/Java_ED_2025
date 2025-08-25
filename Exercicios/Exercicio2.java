import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita a nota ao usuário
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        // Estrutura de decisão
        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        }

        sc.close();
    }
}