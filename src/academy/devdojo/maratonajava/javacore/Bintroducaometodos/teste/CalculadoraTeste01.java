package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subitraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,10);
        System.out.println(calculadora.divideDoisNumeros(10,2));
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Depois de alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Depois de somaArray");
        int [] array = new int[]{10,3,14,33};
        calculadora.somaArray(array);

        System.out.println("Depois de somaVarArgs");
        calculadora.somaVarArgs(1,2,3,4,5 );


    }
}
