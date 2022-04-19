import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double salarioMinimo = 788;
        double salarioRecebido = 11032 ;
        double qntdSM = 0;
        
        System.out.println("O valor do Salário Minímo é de: R$ " + salarioMinimo);
        System.out.println("Informe o seu salário: " + salarioRecebido);
        qntdSM = salarioRecebido / salarioMinimo;
        System.out.println("A pessoa recebe  " + String.format("%.2f", qntdSM));
        
    }
}
