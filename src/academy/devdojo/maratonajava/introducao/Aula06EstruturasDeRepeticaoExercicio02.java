package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio02 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela>= 1000
        int valorCarro = 50000;
        ;
        int numeroParcela = 0;
        for (int valorParcela = 1; valorParcela <= valorCarro; valorParcela++) {
            double parcela = valorCarro / valorParcela;
            if (parcela >= 1000){
                System.out.println("Parcela: " + valorParcela + " R$ " + parcela);
            }else{
                break;
            }
        }
    }
}
