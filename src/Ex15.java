import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int nn = n * 11;
        int nnn = n * 111;
        int resultado;

        System.out.println("Insira um número: ");
        resultado = n + nn + nnn;
        System.out.println("O resultado é: " + resultado);
        leitor.close();
    }
}
