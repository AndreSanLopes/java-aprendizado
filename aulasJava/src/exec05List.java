import java.util.ArrayList;

public class exec05List {
    public static void main(String[] args) {
        ArrayList<Integer> numComp = new ArrayList<>();
        numComp.add(1);
        numComp.add(22);
        numComp.add(5);
        numComp.add(3);
        numComp.add(14);
        numComp.add(623);
        numComp.add(9);
        int max = numComp.get(0);
        int min = numComp.get(0);
        for(Integer i : numComp){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
    }
}
