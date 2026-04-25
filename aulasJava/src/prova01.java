public class prova01 {
    public static void main(String[] args){
        int[][] matzSoma = {
                {2, 6, 10},
                {0, 4, 3},
                {12, 8, 55}
        };

        for (int[] linha : matzSoma){
            for(int algarismo : linha){
                System.out.println(matzSoma + " ");
            }
            System.out.println();
        }
    }
}
