import java.util.Scanner;

public class whileJJK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energia = 0;

        System.out.println("Bem-vindo ao treinamento!");
        System.out.println("Objetivo: Alcançar 100 pontos de energia.");

        while (energia < 100) {
            System.out.println("Digite valor entre 1 e 20: ");
            int treino = scanner.nextInt();

            if (treino >= 1 && treino <= 20) {
                energia += treino;
                System.out.println("Energia atual: " + energia);
            } else {
                System.out.println("Valor inválido! Use apenas de 1 a 20.");
            }
        }
        System.out.println("Parabéns! Você atingiu o nível necessário para controlar seu domínio.");
        scanner.close();
    }
}
