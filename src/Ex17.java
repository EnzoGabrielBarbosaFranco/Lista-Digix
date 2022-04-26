import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Escreva um numero: ");
            double numero = leitor.nextDouble(); 
            double i = numero;
            if (i % 2 == 0)
                System.out.println("É par !");

            else
                System.out.println("É impar!");
        }
    }
}
