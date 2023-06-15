package br.com.alura.audio.principal;

import br.com.alura.audio.modelos.MinhasPreferidas;
import br.com.alura.audio.modelos.Musica;
import br.com.alura.audio.modelos.Podcast;

import javax.sql.PooledConnection;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Substance");
        minhaMusica.setCantor("Wiz Khalifa");

        for (int i = 0; i < 2010; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curtir();

        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setApresentador("Vilela");
        meuPodcast.setTitulo("Inteligencia.LTDA");

        for (int i = 0; i < 200; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 150; i++) {
            meuPodcast.curtir();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }
}
