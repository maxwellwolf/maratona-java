package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        // while
        while (count < 10) {
            System.out.println(++count);
        }

        // do while (Executa pelo menos uma vez)
        do {
            System.out.println(--count);
        } while (count > 0);

        // for
        for (int i=0; i < 10; i+=2){
            System.out.println(i);
        }


    }
}
