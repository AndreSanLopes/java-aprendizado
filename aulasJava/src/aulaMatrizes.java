import java.util.Scanner;
import java.util.Arrays;

public class aulaMatrizes {
    public static void main(String[] args) {
        /*
         * Crie um vetor de 5 posições, leia os valores e exiba-os na ordem inversa
         * */
        int[] atari = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        atari[0] = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        atari[1] = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        atari[2] = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        atari[3] = sc.nextInt();
        System.out.println("Digite o último número: ");
        atari[4] = sc.nextInt();

        for (int i = atari.length - 1; i >= 0; i--){
            /*atari possui 5 posições, que iniciam do zero
             * logo, se colocasse apenas "atari.length",
             * retornaria erro, pois o Java irá tentar
             * encontrar a 6 posições, já que a quinta
             * posição é [4], não "5".*/
            //subtrai (i--) enquanto o contador for maior ou igual a 0
            System.out.println(atari[i]);
        }

    }
}