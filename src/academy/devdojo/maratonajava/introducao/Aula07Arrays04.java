package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        // Outra forma de inicializar arrays
        String [] nomes = {"Max","Lai", "Mick"};
        String [] nomes2 = new String[]{"Max","Lai", "Mick"};

        for(int i =0;i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        // Outra forma de iterar arrays
        for (String name:nomes) {
            System.out.println(name);
        }
    }
}
