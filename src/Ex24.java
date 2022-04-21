import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int Number1 = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int Number2 = leitor.nextInt();
        if (Number1 > Number2) {
            System.out.println("O primeiro valor é maior que o segundo: " + Number1);
        } else {
            if (Number2 > Number1) {

                System.out.println("O segundo valor é maior que o primeiro: " + Number2);
            }
        }
        if (Number1 == Number2) {
            System.out.println("Os valores sao iguais: 0");

            if (Number1 % 6 == 0 && Number2 % 6 == 0) {
                System.out.println(Number2);

            }
            leitor.close();
        }
    }
}
