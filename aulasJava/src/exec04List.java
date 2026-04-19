import java.util.ArrayList;

public class exec04List {
    public static void main(String[] args) {
        ArrayList<Integer> contPar = new ArrayList<>();
        contPar.add(1);
        contPar.add(2);
        contPar.add(9);
        contPar.add(20);
        contPar.add(5);
        contPar.add(32);
        contPar.add(0);
        contPar.add(21);
        int contNum = 0;
        for(Integer i : contPar){
            contNum = i;
            if(contNum % 2 == 0){
                System.out.println(contNum + " é par.");
            } else {
                System.out.println(contNum + " não é par.");
            }
        }
    }
}
