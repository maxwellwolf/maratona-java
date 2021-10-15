package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio2 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia últil ou final de semana utilizando switch
        // Considerando 1 como domingo
        int dia = 5;
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            default:
                System.out.println("Número inválido!");
        }

    }
}
