import java.util.ArrayList;
import java.util.Collections;

public class execCol06 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);
        numeros.add(5);
        numeros.add(10);
        numeros.add(25);
        System.out.println("Lista: " + numeros);
        int valorProcurado = 5;
        int totalOcorrencias = Collections.frequency(numeros, valorProcurado);

        System.out.println("O valor " + valorProcurado + " aparece " +
                totalOcorrencias + " vezes na lista.");

    }
}
