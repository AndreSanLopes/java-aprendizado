import java.util.Scanner;

public class exe4 {
    public static void main(String[] args){
        /*ÍMPAR OU PAR*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
