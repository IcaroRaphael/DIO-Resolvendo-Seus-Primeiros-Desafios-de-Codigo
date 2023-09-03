package desafios.java;

import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito - valorRetirada;

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: " + String.format("%.1f", saldoAtual));

        scanner.close();
    }
}