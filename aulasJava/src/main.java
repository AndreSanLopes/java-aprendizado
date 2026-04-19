import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        //AULA DE ARRAY LIST - André Lopes
        //Exercícios do 1 ao 4
        ArrayList<String> nomes = new ArrayList<>();
        // <> define o tipo do dado, algo obrigatório ao trabalhar com Array List
        // () demonstra que o Java trata Array List como uma função
        nomes.add("André");
        nomes.add("Ana");
        nomes.add("Roberto");
        nomes.add("Joana");
        nomes.add("Benedito");
        System.out.println(nomes);
        System.out.println("O primeiro nome é: " + nomes.get(0) + ". Enquanto o último nome é: " + nomes.get(4) + ".");
        nomes.set(2, "Josias");
        System.out.println("Agora, o terceiro nome da lista é: " + nomes.get(2) + ".");
        nomes.remove(1);
        System.out.println("O segundo nome foi removido, portanto, agora o segundo elemento é: " + nomes.get(1) + ".");
    }
}
