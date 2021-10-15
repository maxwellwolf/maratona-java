package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Celtinha";
        carro1.modelo = "Celta";
        carro1.ano = 2003;
        carro2.nome = "Corsinha";
        carro2.modelo = "Corsa";
        carro2.ano = 2011;

        System.out.println("Nome do carro é " +carro1.nome+", seu modelo é "+ carro1.modelo+" e seu ano de fabricação é "+ carro1.ano);
        System.out.println("Nome do carro é " +carro2.nome+", seu modelo é "+ carro2.modelo+" e seu ano de fabricação é "+ carro2.ano);
    }
}
