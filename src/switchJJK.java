import java.util.Scanner;

public class switchJJK {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Bem vindo ao sorteio de feiticeiros Jujutsu!");
        System.out.println("Escolha um númedo de 1 a 10 para saber com qual feiticeiro você irá trabalhar nessa nova missão: ");

        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Nanami");
                break;
            case 2:
                System.out.println("Gojo");
                break;
            case 3:
                System.out.println("Megumi");
                break;
            case 4:
                System.out.println("Geto");
                break;
            case 5:
                System.out.println("Nobara");
                break;
            case 6:
                System.out.println("Inumaki");
                break;
            case 7:
                System.out.println("Itadori");
                break;
            case 8:
                System.out.println("Yuta");
                break;
            case 9:
                System.out.println("Panda");
                break;
            case 10:
                System.out.println("Shoko");
                break;
            default:
                System.out.println("Escolha um número válido!");

        }
        scanner.close();

        /* Usado para estruturas com várias repetições */
    }
}
