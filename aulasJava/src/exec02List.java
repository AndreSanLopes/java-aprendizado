import java.util.ArrayList;

public class exec02List {
    public static void main(String[] args) {
        ArrayList<Integer> algarismo = new ArrayList<>();
        algarismo.add(5);
        algarismo.add(9);
        algarismo.add(3);
        algarismo.add(1);
        algarismo.add(0);
        algarismo.add(40);
        int soma = 0;
        double media = algarismo.size();
        double totMedia = 0;
        for (Integer n : algarismo){
            soma += n;
            totMedia = soma/media;
        }
        System.out.println("A soma de todos o itens no ArrayList é: " + soma + ".");
        System.out.println("A média é: " + totMedia + ".");
    }

}
