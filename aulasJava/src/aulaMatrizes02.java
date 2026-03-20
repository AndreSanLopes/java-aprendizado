//LEIA 6 NOTAS EM UM VETOR E CALCULE A MÉDIA DA TURMA
import java.util.Scanner;
public class aulaMatrizes02 {
    public static void main(String[] args) {
        //LEIA 6 NOTAS EM UM VETOR E CALCULE A MÉDIA DA TURMA
        double[] fatec = new double[6]; //nota é double pois pode ser 7,5; 9,5; 4,1; etc.
        int me = fatec.length;//"me" recebe a quantidade de posições do vetor, independente de qual seja
        double soma = 0;//"soma" inicia com 0, é uma variável acumuladora
        /*
         * A variável acumuladora servirá para guardar os valores de cada posição,
         * sendo incrementada a cada laço para acumular as somas até que
         * todos os valores sejam incluídos
         */
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < fatec.length; i++) { //laço "for" para entrada de dados
            System.out.println("Digite a nota do aluno: ");
            fatec[i] = sc.nextDouble();//cada "i" será uma posição do vetor "fatec"
            soma += fatec[i];
        }
        System.out.println("A média da turma é " + soma/me + ".");//calcula a media
    }

}