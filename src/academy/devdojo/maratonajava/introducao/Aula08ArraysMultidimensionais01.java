package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Array Multidimensionais
        int [][] dia = new int[3][3];

        dia[0][0] = 31;
        dia[0][1] = 28;
        dia[0][2] = 31;

        dia[1][0] = 30;
        dia[1][1] = 31;
        dia[1][2] = 30;

        dia[2][0] = 31;
        dia[2][1] = 30;
        dia[2][2] = 31;

        for(int i =0;i < dia.length; i++){
            for (int j = 0; j < dia[i].length; j++) {
                System.out.println(dia[i][j]);
            }
        }
        System.out.println("\n\n");
        // Outra forma de iterar array multidimensionais
        for (int[] arrBase:dia) {
            for (int num:arrBase) {
                System.out.println(num);
            }

        }
    }
}
