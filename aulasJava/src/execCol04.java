import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class execCol04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 6 números:");
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();

    }
}
