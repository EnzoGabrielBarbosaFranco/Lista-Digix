import java.util.Scanner;
public class Ex10 {
   
    public static void main(String[] args) {
        
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe um número: ");
            int num = leitor.nextInt();
            int soma = 0;
            while(num>0) {
                soma += (num % 10);
                num /= 10;
                System.out.println("O valor de soma é: " + soma);
            }
            System.out.println();
            System.out.println("A soma dos algarismos é: " + soma);
        }
    }
    }