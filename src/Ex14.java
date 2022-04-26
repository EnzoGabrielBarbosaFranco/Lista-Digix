import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Insira sua senha: ");
            String senha = leitor.nextLine();
            System.out.println("Sua senha atual é: " + senha);
        }
    }
}
