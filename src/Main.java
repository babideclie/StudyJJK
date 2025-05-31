import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Escola Jujutso!");
        System.out.println("Para escolher o feiticeiro ideal para a missão dijite:  " +
                "\n Gojo para escolher - Satoru Gojo" +
                "\n Geto para escolher - Suguru Geto" +
                "\n Nanami para escolher - Kento Nanami");
        String feiticeiro = scanner.next();
        String feticeirogojo = "Gojo";
        String feiticeirogeto = "Geto";
        String feiticeironanami = "Nanami";

        if (feiticeiro.equals(feticeirogojo)) {
            System.out.println("Você escolheu Satoru Gojo para a missão. ");
        } else if (feiticeiro.equals(feiticeirogeto)) {
            System.out.println("Você escolheu Suguru Geto para a missão.");
        } else if (feiticeiro.equals(feiticeironanami)) {
            System.out.println("Você escolheu o Nanami para a missão. ");
        } else {
            System.out.println("Opção inválida! Tente novamente. ");
        }

        scanner.close();

        /* if/else é usado para estruturas menores */
    }
}
