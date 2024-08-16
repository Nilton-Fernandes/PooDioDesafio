package principal;

import interfaces.AparelhoTelefonico;

public class Aparelho {
    public static void main(String[] args) {
        iPhone telefone = new iPhone();
        telefone.ligar("");
        telefone.atender("");
        telefone.correioDeVoz("");

        iPhone tocadorMusical = new iPhone();
        tocadorMusical.tocar();
        tocadorMusical.pausar();
        tocadorMusical.selecionarMusica();

        iPhone navegador = new iPhone();
        navegador.exibirPagina("");
        navegador.atualizarAba();
        navegador.adicionarNovaAba("");

    }
}
