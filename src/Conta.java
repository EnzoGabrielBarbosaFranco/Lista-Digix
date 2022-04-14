public class Conta {
    double saldo;
    String tipo;
    String numero;
    String agencia;
    double limite;
    boolean ativa;
    Cliente cliente;

    boolean sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        if(novoSaldo >= 0 ) {
            this.saldo = novoSaldo;
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        } 
    }

    void depositar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += quantidade;
        }
    }
        void pix(double valorPIX, Conta contaDestino) {
            if(this.sacar(valorPIX)) {
            contaDestino.depositar(valorPIX);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
}

