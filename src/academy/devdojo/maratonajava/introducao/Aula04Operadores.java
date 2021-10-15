package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1= 10;
        int num2= 20;
        int resultado = num1 + num2;
        System.out.println(resultado);

        // % resto
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        Boolean isDezMaiorQueVinte = 10 > 20;
        Boolean isDezMenorQueVinte = 10 < 20;
        Boolean isDezIgualQueVinte = 10 == 20;
        Boolean isDezIgualQueDez = 10 == 10;
        Boolean isDezDiferenteQueDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualQueDez);
        System.out.println(isDezDiferenteQueDez);

        // && (and) || (or) ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("\n"+isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus = 2000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1.1;
        bonus /= 1.05;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        contador2 = 0;
        System.out.println(++contador2);

    }
}
