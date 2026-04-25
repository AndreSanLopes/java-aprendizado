import java.util.ArrayList;
import java.util.Collections;

public class execCol02 {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("André");
        nomes.add("Carlos");
        nomes.add("Diana");
        nomes.add("Eduardo");
        nomes.add("Linus Torvalds");
        nomes.add("Roberto");
        nomes.add("Helena");
        nomes.add("Igor");
        nomes.add("Julia");
        System.out.println("Lista original:");
        System.out.println(nomes);
        Collections.reverse(nomes);
        System.out.println("Lista em ordem inversa:");
        System.out.println(nomes);
    }
}
