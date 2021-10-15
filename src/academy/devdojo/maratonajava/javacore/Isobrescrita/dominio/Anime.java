package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private static int[] episodios;
    // Bloco de inicialização
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    private String nome;


    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Anime " +
                this.nome;
    }
}
