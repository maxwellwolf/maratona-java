package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Bloco de inicialização
    static {
        System.out.println("Entou no bloco de incialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Entou no bloco de incialização estático 2");
    }

    static {
        System.out.println("Entou no bloco de incialização estático 3");
    }

    {
        System.out.println("Entou no bloco de incialização 4");
    }

    public Anime() {
    }

    public void imprime() {
        for (int i = 0; i < episodios.length; i++) {
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }


}
