import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double altura;
        double largura;

        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o primeiro valor: ");
            altura = ler.nextDouble();
            System.out.println("Digite o segundo valor: ");
            largura = ler.nextDouble();
        }
        System.out.println(altura * largura);
        System.out.println(2 * (altura + largura));
        

        /* largura = base*/
    }
}
