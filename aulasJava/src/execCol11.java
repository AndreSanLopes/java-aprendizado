import java.util.ArrayList;
import java.util.Scanner;

public class execCol11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Cria lista com 6 números
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Lista original: " + numeros);

        // Pede número para remover
        System.out.print("Digite o número a remover: ");
        int numeroRemover = scanner.nextInt();

        // Remove primeira ocorrência
        boolean removido = numeros.remove(Integer.valueOf(numeroRemover));

        // Exibe resultado
        if (removido) {
            System.out.println("Número removido!");
            System.out.println("Lista atualizada: " + numeros);
        } else {
            System.out.println("Número não encontrado na lista!");
        }

        scanner.close();
    }
}
