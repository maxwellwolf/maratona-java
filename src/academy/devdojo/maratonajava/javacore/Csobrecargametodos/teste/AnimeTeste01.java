package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece","internet",1000 );
        anime.init("One Piece","TV",1000 , "Aventura");
        anime.imprime();
    }

}
