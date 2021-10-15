package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1000, "Aventura");
        anime.imprime();
        Anime anime2 = new Anime("Naruto", "TV", 500, "Ninja","PlayArt");
        anime2.imprime();
    }

}
