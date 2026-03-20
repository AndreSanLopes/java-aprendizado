import java.util.Scanner;
import java.util.Arrays;
public class aulaMatrizes03 {
    public static void main(String[] args) {
        //LEIA 10 NÚMEROS INTEIROS EM UM VETOR E EXIBA O MAIOR E O MENOR DELES
        Scanner sc = new Scanner(System.in);
        int[] listinha = new int[10];
        for(int i = 0; i < listinha.length; i++) {
            System.out.println("Digite um número: ");
            listinha[i] = sc.nextInt();
        }
        Arrays.sort(listinha); //ordena o array em ordem crescente
        System.out.println("O maior valor é " + listinha[9] + " e o menor é " + listinha[0] + ".");//.toString tem função de converter o array em string legível
    }
}