package desafios.java;

import java.util.Locale;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for(int i = 1; i <= periodo; i++){
            valorFinal += valorFinal * taxaJuros;
        }

        System.out.println("Valor final do investimento: R$ " + String.format("%.2f", valorFinal));

        scanner.close();
    }
}
