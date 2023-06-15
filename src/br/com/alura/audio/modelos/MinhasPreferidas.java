package br.com.alura.audio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto");
        }else{
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        }

    }
}
