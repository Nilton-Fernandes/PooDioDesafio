package principal;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        private String modelo;
        private int capacidadeBateria;
        private String sistemaOperacional;

    public iPhone(String modelo, int capacidadeBateria, String sistemaOperacional) {
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.sistemaOperacional = sistemaOperacional;
    }

    public iPhone() {}


    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }


    public void selecionarMusica() {
        System.out.println("Selecionando nova Musica.");
    }

    @Override
    public void ligar(String number) {
        System.out.println("Chamando " + number + "...");
    }

    @Override
    public void atender(String ligacao) {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void correioDeVoz(String ligacao) {
        System.out.println("Encaminhando ligação.");
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " );
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando  nova aba.");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando página.");
    }

    }
