import java.util.ArrayList;
public class exec03List {
    public static void main(String[] args){
            ArrayList<String> buscaNome = new ArrayList<>();
            buscaNome.add("Ana");
            buscaNome.add("Bob");
            buscaNome.add("Carl");
            buscaNome.add("Dan");
            buscaNome.add("Jack");
            if (buscaNome.contains("Ana")) {
                System.out.println("Nome encontrado");
            }else{
                System.out.println("Nome não encontrado");
            }
    }

}
