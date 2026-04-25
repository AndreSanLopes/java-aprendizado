import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class execCol12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }
        System.out.println("\nLista original: " + numeros);
        ArrayList<Integer> ordenada = new ArrayList<>(numeros);
        Collections.sort(ordenada);
        System.out.println("Lista ordenada: " + ordenada);

        Collections.reverse(ordenada);
        System.out.println("Lista invertida: " + ordenada);
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
