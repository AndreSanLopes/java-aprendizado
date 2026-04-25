import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class execCol01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite 5 números:");

            numeros.clear();
            for (int i = 0; i < 5; i++) {
                int num = scanner.nextInt();
                numeros.add(num);
            }
            System.out.println("Valores originais: " + numeros);

            Collections.sort(numeros);
            System.out.println("Valores ordenados: " + numeros);
            System.out.print("Quer continuar? s/n: ");
            String opcao = scanner.next();
            continuar = opcao.equalsIgnoreCase("s");
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

