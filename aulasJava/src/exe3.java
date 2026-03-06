import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        /*RAIZ QUADRADA*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("OBTENHA A RAIZ QUADRADA - Digite um número: ");
        int num = sc.nextInt();
        int raiz = (int) Math.sqrt(num);
        System.out.println("A raiz quadrada de " + num + " é: " + raiz + ".");*/

        /*POTÊNCIA*/
        Scanner sc = new Scanner(System.in);
        System.out.printf("Cálculo de potência%nDigite a base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o expoente: ");
        double exp = sc.nextDouble();
        double potencia = Math.pow(base, exp);
        System.out.println("O resultado de " + base + " elevado a " + exp + " é: " + potencia + ".");
    }
}
