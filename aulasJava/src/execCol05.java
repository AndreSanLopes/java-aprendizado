import java.util.ArrayList;
import java.util.Collections;

public class execCol05 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10);
        numeros.add(20);
        numeros.add(40);
        System.out.println("Lista completa: " + numeros);
        int valorProcurado = 10;
        int ocorrencias = Collections.frequency(numeros, valorProcurado);
        System.out.println("O valor " + valorProcurado + " aparece " + ocorrencias + " vezes.");
    }
}
