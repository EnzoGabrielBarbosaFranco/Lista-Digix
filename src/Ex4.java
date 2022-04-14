import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int fonte1;
        int fonte2;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            fonte1 = leitor.nextInt();
            System.out.println("Digite o segundo numero: ");
            fonte2 = leitor.nextInt();
        }
        System.out.println(fonte1 + "+" + fonte2 + "=" + (fonte1 + fonte2));

        System.out.println(fonte1 + "-" + fonte2 + "=" + (fonte1 - fonte2));

        System.out.println(fonte1 + "*" + fonte2 + "=" + (fonte1 * fonte2));

        System.out.println(fonte1 + "/" + fonte2 + "=" + (fonte1 / fonte2));

        System.out.println(fonte1 + "%" + fonte2 + "=" + (fonte1 % fonte2));

    }
}
