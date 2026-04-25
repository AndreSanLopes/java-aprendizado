import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class execCol07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Lê 6 números
        System.out.println("Digite 6 números:");
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Ordena a lista (obrigatório para busca binária)
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);

        // Pede número a procurar
        System.out.print("Digite um número para buscar: ");
        int numeroProcurado = scanner.nextInt();

        // Busca binária com Collections.binarySearch
        int posicao = Collections.binarySearch(numeros, numeroProcurado);

        if (posicao >= 0) {
            System.out.println("Número " + numeroProcurado + " encontrado na posição " + posicao);
        } else {
            System.out.println("Número " + numeroProcurado + " NÃO encontrado na lista.");
        }

        scanner.close();
    }
}
