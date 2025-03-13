package br.com.dio.desafio.dominio;

public  abstract class Conteudo {
    private String titulos;
    private String descricao;

    protected  static final double XP_PADRAO=10;

    public abstract double calcularXp();

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
