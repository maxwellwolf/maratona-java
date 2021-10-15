package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela>= 1000
        double valorCarro = 50000;
        ;
        int numeroParcela = 0;
        for (int parcela = (int) valorCarro; parcela >=1; parcela--) {
            double Valorparcela = valorCarro / parcela;
            if (Valorparcela < 1000){
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$ " + Valorparcela);
        }
    }
}
