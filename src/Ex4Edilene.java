import java.util.Scanner;

public class Ex4Edilene {
    public static void main(String[] args) {

        int idade;
        int sexo;
        int maiorIdade = 0;
        int menorIdade = 20;
        int qtdMulheres = 0;
        int qtdFuncionario = 0;
        double salario;
        double somaSalario = 0;

        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();
            System.out.println("Digite 1 para Masculino ou 2 para feminino");
            sexo = leitor.nextInt();
            System.out.println("Digite o salário: ");
            salario = leitor.nextInt();

            somaSalario += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (sexo == 2 && salario > 4000) {
                qtdMulheres += 1;
            }
            if (salario > 0) {
                qtdFuncionario += 1;
            }
        }
        System.out.println("A média de salário do grupo é: " + somaSalario / qtdFuncionario);
        System.out.println("A maior idade do grupo é" + maiorIdade);
        System.out.println("A menor idade do grupo é" + menorIdade);
        System.out.println("a qtde de mulheres que ganham mais que 4mil é: " + qtdMulheres);
    }
}
