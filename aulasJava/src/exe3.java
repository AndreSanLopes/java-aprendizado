import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("OBTENHA A RAIZ QUADRADA - Digite um número: ");
        double num = sc.nextDouble();
        double raiz = Math.sqrt(num);
        System.out.println("A raiz quadrada de " + num + " é: " + raiz + ".");
    }
}
