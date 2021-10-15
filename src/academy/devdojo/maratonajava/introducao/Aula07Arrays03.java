package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Iteração de arrays
        String [] nomes = new String[3];
        nomes[0] = "Max";
        nomes[1] = "Lai";
        nomes[2] = "Mick";

        for(int i =0;i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
