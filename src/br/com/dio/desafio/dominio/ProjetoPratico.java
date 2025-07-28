package br.com.dio.desafio.dominio;

import enums.Dificuldade;

public class ProjetoPratico extends Conteudo {

    private Dificuldade dificuldade;

    public ProjetoPratico() {
    }

    public ProjetoPratico(String titulo, String descricao, Dificuldade dificuldade) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularXp() {
        switch (dificuldade) {
            case FACIL: return 30d;
            case MEDIO: return 50d;
            case DIFICIL: return 80d;
            default: return 30d;
        }
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "ProjetoPratico{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }
}
