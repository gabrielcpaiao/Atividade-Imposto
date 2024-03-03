import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.setVal(1000); // Defina o valor do orçamento

        Calcula calculadora = new Calcula(orcamento);

        Map<String, Double> taxas = new HashMap<>();
        taxas.put("icms", 0.18);
        taxas.put("iss", 0.05);
        taxas.put("pis", 0.01);
        taxas.put("cofins", 0.03);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o imposto (icms, iss, pis, cofins): ");
        String escolha = scanner.nextLine();

        if (taxas.containsKey(escolha)) {
            double taxaImposto = taxas.get(escolha);
            double impostoCalculado = calculadora.calcularImposto(taxaImposto);
            System.out.println("Imposto calculado: " + impostoCalculado);
        } else {
            System.out.println("Imposto inválido.");
        }

        scanner.close();
    }
}
