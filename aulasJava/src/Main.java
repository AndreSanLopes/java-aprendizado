import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*EXERCÍCIO 2 - ANDRÉ LOPES*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite a nota do primeiro bimestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("Agora, digite a nota do segundo bimestre: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.println("A média do aluno é de: " + media + ".");
        sc.close();
    }
}