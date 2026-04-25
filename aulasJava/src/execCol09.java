import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class execCol09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite 5 notas (0-10):");
        for (int i = 0; i < 5; i++) {
            double nota = scanner.nextDouble();
            notas.add(nota);
        }
        double maiorNota = Collections.max(notas);
        double menorNota = Collections.min(notas);
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.printf("Maior nota: %.1f%n", maiorNota);
        System.out.printf("Menor nota: %.1f%n", menorNota);
        System.out.printf("Média das notas: %.1f%n", media);

        scanner.close();
    }
}
