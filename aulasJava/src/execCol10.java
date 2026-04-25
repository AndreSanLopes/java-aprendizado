import java.util.ArrayList;
import java.util.Scanner;

public class execCol10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Lê 8 números
        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Conta pares e ímpares
        int pares = 0, impares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibe resultados
        System.out.println("Total de pares: " + pares);
        System.out.println("Total de ímpares: " + impares);

        scanner.close();

    }
}
