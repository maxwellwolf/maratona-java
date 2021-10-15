package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores defaults de Arrays:
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ou ' '
        // boolean = false
        // String = null
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
    }
}
