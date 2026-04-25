import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class execCol08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        numeros.add(50);
        numeros.add(40);
        System.out.println("Lista original: " + numeros);
        System.out.print("Digite o valor a substituir: ");
        int valorAntigo = scanner.nextInt();

        System.out.print("Digite o novo valor: ");
        int novoValor = scanner.nextInt();

        boolean substituido = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorAntigo) {
                numeros.set(i, novoValor);
                substituido = true;
                break;
            }
        }
        if (substituido) {
            System.out.println("Lista atualizada: " + numeros);
        } else {
            System.out.println("Valor não encontrado na lista!");
        }

        scanner.close();
    }
}
