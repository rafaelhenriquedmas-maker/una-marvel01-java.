import java.util.Scanner;

public class AlistamentoBrooklyn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Acesso Negado: Muito jovem para a guerra");
        } else {
            System.out.println("Acesso permitido para o alistamento");
        }

        scanner.close();
    }

}