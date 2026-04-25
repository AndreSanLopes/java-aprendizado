import java.util.ArrayList;
import java.util.Collections;

public class execCol03 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println("Lista original: " + numeros);
        Collections.shuffle(numeros);
        System.out.println("Lista embaralhada: " + numeros);
    }
}
